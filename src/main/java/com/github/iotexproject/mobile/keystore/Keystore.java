package com.github.iotexproject.mobile.keystore;

import com.lambdaworks.crypto.SCrypt;
import com.github.iotexproject.mobile.crypto.Hash;
import com.github.iotexproject.mobile.utils.Numeric;
import org.bouncycastle.crypto.digests.SHA256Digest;
import org.bouncycastle.crypto.generators.PKCS5S2ParametersGenerator;
import org.bouncycastle.crypto.params.KeyParameter;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import java.math.BigInteger;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.UUID;

import static com.github.iotexproject.mobile.crypto.SecureRandomUtils.secureRandom;
import static java.nio.charset.StandardCharsets.UTF_8;

/**
 * <p>Ethereum keystore file management. For reference, refer to
 * <a href="https://github.com/ethereum/wiki/wiki/Web3-Secret-Storage-Definition">
 * Web3 Secret Storage Definition</a> or the
 * <a href="https://github.com/ethereum/go-ethereum/blob/master/accounts/key_store_passphrase.go">
 * Go Ethereum client implementation</a>.
 * </p>
 *
 * @author Yang XuePing
 */
public class Keystore {
    static final int PRIVATE_KEY_SIZE = 32;
    static final String AES_128_CTR = "pbkdf2";
    static final String SCRYPT = "scrypt";
    private static final int N_LIGHT = 1 << 12;
    private static final int P_LIGHT = 6;
    private static final int N_STANDARD = 1 << 18;
    private static final int P_STANDARD = 1;
    private static final int R = 8;
    private static final int DKLEN = 32;
    private static final int CURRENT_VERSION = 3;
    private static final String CIPHER = "aes-128-ctr";

    public static KeystoreFile create(String password, BigInteger privateKey, int n, int p)
            throws CipherException {

        byte[] salt = generateRandomBytes(32);

        byte[] derivedKey = generateDerivedScryptKey(
                password.getBytes(UTF_8), salt, n, R, p, DKLEN);

        byte[] encryptKey = Arrays.copyOfRange(derivedKey, 0, 16);
        byte[] iv = generateRandomBytes(16);

        byte[] privateKeyBytes =
                Numeric.toBytesPadded(privateKey, PRIVATE_KEY_SIZE);

        byte[] cipherText = performCipherOperation(
                Cipher.ENCRYPT_MODE, iv, encryptKey, privateKeyBytes);

        byte[] mac = generateMac(derivedKey, cipherText);

        return createWalletFile(cipherText, iv, salt, mac, n, p);
    }

    public static KeystoreFile createStandard(String password, BigInteger privateKey)
            throws CipherException {
        return create(password, privateKey, N_STANDARD, P_STANDARD);
    }

    public static KeystoreFile createLight(String password, BigInteger privateKey)
            throws CipherException {
        return create(password, privateKey, N_LIGHT, P_LIGHT);
    }

    private static KeystoreFile createWalletFile(byte[] cipherText, byte[] iv, byte[] salt, byte[] mac,
                                                 int n, int p) {
        KeystoreFile walletFile = new KeystoreFile();

        KeystoreFile.Crypto crypto = new KeystoreFile.Crypto();
        crypto.setCipher(CIPHER);
        crypto.setCiphertext(Numeric.toHexString(cipherText));

        KeystoreFile.CipherParams cipherParams = new KeystoreFile.CipherParams();
        cipherParams.setIv(Numeric.toHexString(iv));
        crypto.setCipherparams(cipherParams);

        crypto.setKdf(SCRYPT);
        KeystoreFile.ScryptKdfParams kdfParams = new KeystoreFile.ScryptKdfParams();
        kdfParams.setDklen(DKLEN);
        kdfParams.setN(n);
        kdfParams.setP(p);
        kdfParams.setR(R);
        kdfParams.setSalt(Numeric.toHexString(salt));
        crypto.setKdfparams(kdfParams);

        crypto.setMac(Numeric.toHexString(mac));
        walletFile.setCrypto(crypto);
        walletFile.setId(UUID.randomUUID().toString());
        walletFile.setVersion(CURRENT_VERSION);

        return walletFile;
    }

    private static byte[] generateDerivedScryptKey(
            byte[] password, byte[] salt, int n, int r, int p, int dkLen) throws CipherException {
        return SCrypt.scryptN(password, salt, n, r, p, dkLen);
    }

    private static byte[] generateAes128CtrDerivedKey(
            byte[] password, byte[] salt, int c, String prf) throws CipherException {
        if (!prf.equals("hmac-sha256")) {
            throw new CipherException("Unsupported prf:" + prf);
        }

        PKCS5S2ParametersGenerator gen = new PKCS5S2ParametersGenerator(new SHA256Digest());
        gen.init(password, salt, c);
        return ((KeyParameter) gen.generateDerivedParameters(256)).getKey();
    }

    private static byte[] performCipherOperation(
            int mode, byte[] iv, byte[] encryptKey, byte[] text) throws CipherException {
        try {
            IvParameterSpec ivParameterSpec = new IvParameterSpec(iv);
            Cipher cipher = Cipher.getInstance("AES/CTR/NoPadding");

            SecretKeySpec secretKeySpec = new SecretKeySpec(encryptKey, "AES");
            cipher.init(mode, secretKeySpec, ivParameterSpec);
            return cipher.doFinal(text);
        } catch (NoSuchPaddingException | NoSuchAlgorithmException
                | InvalidAlgorithmParameterException | InvalidKeyException
                | BadPaddingException | IllegalBlockSizeException e) {
            throw new CipherException("Error performing cipher operation", e);
        }
    }

    private static byte[] generateMac(byte[] derivedKey, byte[] cipherText) {
        byte[] result = new byte[16 + cipherText.length];

        System.arraycopy(derivedKey, 16, result, 0, 16);
        System.arraycopy(cipherText, 0, result, 16, cipherText.length);

        return Hash.sha3(result);
    }

    public static BigInteger decrypt(String password, KeystoreFile walletFile)
            throws CipherException {

        validate(walletFile);

        KeystoreFile.Crypto crypto = walletFile.getCrypto();

        byte[] mac = Numeric.hexStringToByteArray(crypto.getMac());
        byte[] iv = Numeric.hexStringToByteArray(crypto.getCipherparams().getIv());
        byte[] cipherText = Numeric.hexStringToByteArray(crypto.getCiphertext());

        byte[] derivedKey;

        KeystoreFile.KdfParams kdfParams = crypto.getKdfparams();
        if (kdfParams instanceof KeystoreFile.ScryptKdfParams) {
            KeystoreFile.ScryptKdfParams scryptKdfParams =
                    (KeystoreFile.ScryptKdfParams) crypto.getKdfparams();
            int dklen = scryptKdfParams.getDklen();
            int n = scryptKdfParams.getN();
            int p = scryptKdfParams.getP();
            int r = scryptKdfParams.getR();
            byte[] salt = Numeric.hexStringToByteArray(scryptKdfParams.getSalt());
            derivedKey = generateDerivedScryptKey(password.getBytes(UTF_8), salt, n, r, p, dklen);
        } else if (kdfParams instanceof KeystoreFile.Aes128CtrKdfParams) {
            KeystoreFile.Aes128CtrKdfParams aes128CtrKdfParams =
                    (KeystoreFile.Aes128CtrKdfParams) crypto.getKdfparams();
            int c = aes128CtrKdfParams.getC();
            String prf = aes128CtrKdfParams.getPrf();
            byte[] salt = Numeric.hexStringToByteArray(aes128CtrKdfParams.getSalt());

            derivedKey = generateAes128CtrDerivedKey(password.getBytes(UTF_8), salt, c, prf);
        } else {
            throw new CipherException("Unable to deserialize params: " + crypto.getKdf());
        }

        byte[] derivedMac = generateMac(derivedKey, cipherText);

        if (!Arrays.equals(derivedMac, mac)) {
            throw new CipherException("Invalid password provided");
        }

        byte[] encryptKey = Arrays.copyOfRange(derivedKey, 0, 16);
        byte[] privateKey = performCipherOperation(Cipher.DECRYPT_MODE, iv, encryptKey, cipherText);
        return Numeric.toBigInt(privateKey);
    }

    private static void validate(KeystoreFile walletFile) throws CipherException {
        KeystoreFile.Crypto crypto = walletFile.getCrypto();

        if (walletFile.getVersion() != CURRENT_VERSION) {
            throw new CipherException("Keystore version is not supported");
        }

        if (!crypto.getCipher().equals(CIPHER)) {
            throw new CipherException("Keystore cipher is not supported");
        }

        if (!crypto.getKdf().equals(AES_128_CTR) && !crypto.getKdf().equals(SCRYPT)) {
            throw new CipherException("KDF type is not supported");
        }
    }

    static byte[] generateRandomBytes(int size) {
        byte[] bytes = new byte[size];
        secureRandom().nextBytes(bytes);
        return bytes;
    }
}
