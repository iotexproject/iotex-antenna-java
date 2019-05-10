package io.iotex.mobile.account;

import io.iotex.mobile.crypto.Bech32;
import io.iotex.mobile.crypto.Hash;
import io.iotex.mobile.crypto.SECP256K1;
import io.iotex.mobile.crypto.Signer;
import io.iotex.mobile.utils.Numeric;
import org.bouncycastle.jcajce.provider.asymmetric.ec.BCECPrivateKey;
import org.bouncycastle.jcajce.provider.asymmetric.ec.BCECPublicKey;

import java.math.BigInteger;
import java.security.KeyPair;
import java.util.Arrays;

/**
 * iotex account.
 *
 * @author Yang XuePing
 */
public class IotexAccount extends AbstractAccount implements Account {
    // AddressPrefix is the prefix added to the human readable address.
    public static final String AddressPrefix = "io";

    // prevent create outer
    private IotexAccount(BigInteger privateKey, BigInteger publicKey) {
        this.privateKey = privateKey;
        this.publicKey = publicKey;
        this.address = computeAddress(publicKey);
    }

    /**
     * create account by Secp256K1.
     *
     * @return
     */
    public static Account create() {
        try {
            return create(SECP256K1.createSecp256k1KeyPair());
        } catch (Exception e) {
            throw new RuntimeException("create secp256k1 key error", e);
        }
    }

    /**
     * create account by keypair.
     *
     * @param keyPair
     * @return
     */
    public static Account create(KeyPair keyPair) {
        BCECPrivateKey privateKey = (BCECPrivateKey) keyPair.getPrivate();
        BCECPublicKey publicKey = (BCECPublicKey) keyPair.getPublic();

        BigInteger privateKeyValue = privateKey.getD();

        byte[] publicKeyBytes = publicKey.getQ().getEncoded(false);
        BigInteger publicKeyValue =
                new BigInteger(1, Arrays.copyOfRange(publicKeyBytes, 0, publicKeyBytes.length));

        return new IotexAccount(privateKeyValue, publicKeyValue);
    }

    /**
     * create by private key.
     *
     * @param privateKey
     * @return
     */
    public static Account create(BigInteger privateKey) {
        return new IotexAccount(privateKey, SECP256K1.publicKeyFromPrivate(privateKey, 0));
    }

    /**
     * create by private key byte.
     *
     * @param privateKey
     * @return
     */
    public static Account create(byte[] privateKey) {
        return create(Numeric.toBigInt(privateKey));
    }

    /**
     * create by private key string.
     *
     * @param privateKey
     * @return
     */
    public static Account create(String privateKey) {
        return create(Numeric.hexStringToByteArray(privateKey));
    }

    private static String computeAddress(BigInteger publicKey) {
        byte[] pubBytes = publicKey.toByteArray();
        byte[] hash256 = Hash.sha3(Arrays.copyOfRange(pubBytes, 1, pubBytes.length));
        byte[] values = Arrays.copyOfRange(hash256, 12, hash256.length);
        byte[] grouped = Bech32.convertBits(values, 0, values.length, 8, 5, true);
        return Bech32.encode(AddressPrefix, grouped);
    }

    public String getHexAddress() {
        byte[] pubBytes = publicKey.toByteArray();
        byte[] hash256 = Hash.sha3(Arrays.copyOfRange(pubBytes, 1, pubBytes.length));
        byte[] values = Arrays.copyOfRange(hash256, 12, hash256.length);
        return Numeric.toHexString(values);
    }


    @Override
    public byte[] publicKey() {
        return publicKey.toByteArray();
    }

    @Override
    public byte[] sign(byte[] data) {
        return Signer.sign(this.privateKey, this.publicKey, Hash.sha3(data));
    }
}
