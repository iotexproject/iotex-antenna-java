package io.iotex.mobile.crypto;

import io.iotex.mobile.utils.Numeric;
import org.bouncycastle.jcajce.provider.asymmetric.ec.BCECPrivateKey;
import org.bouncycastle.jcajce.provider.asymmetric.ec.BCECPublicKey;

import java.math.BigInteger;
import java.security.KeyPair;
import java.util.Arrays;

/**
 * SECP256K1 keypair.
 *
 * @author Yang XuePing
 */
public class ECKeyPair {
    // MainnetPrefix is the prefix added to the human readable address of mainnet
    public static final String MainnetPrefix = "io";

    // TestnetPrefix is the prefix added to the human readable address of testnet
    public static final String TestnetPrefix = "it";

    private final BigInteger privateKey;
    private final BigInteger publicKey;
    private final String address;

    public ECKeyPair(BigInteger privateKey, BigInteger publicKey) {
        this.privateKey = privateKey;
        this.publicKey = publicKey;

        byte[] pubBytes = publicKey.toByteArray();
        byte[] hash256 = Hash.sha3(Arrays.copyOfRange(pubBytes, 1, pubBytes.length));
        byte[] values = Arrays.copyOfRange(hash256, 12, hash256.length);
        byte[] grouped = Bech32.convertBits(values, 0, values.length, 8, 5, true);
        this.address = Bech32.encode(MainnetPrefix, grouped);
    }

    public static ECKeyPair create() {
        try {
            return create(SECP256K1.createSecp256k1KeyPair());
        } catch (Exception e) {
            throw new RuntimeException("create secp256k1 key error", e);
        }
    }

    public static ECKeyPair create(KeyPair keyPair) {
        BCECPrivateKey privateKey = (BCECPrivateKey) keyPair.getPrivate();
        BCECPublicKey publicKey = (BCECPublicKey) keyPair.getPublic();

        BigInteger privateKeyValue = privateKey.getD();

        byte[] publicKeyBytes = publicKey.getQ().getEncoded(false);
        BigInteger publicKeyValue =
                new BigInteger(1, Arrays.copyOfRange(publicKeyBytes, 0, publicKeyBytes.length));

        return new ECKeyPair(privateKeyValue, publicKeyValue);
    }

    public static ECKeyPair create(BigInteger privateKey) {
        return new ECKeyPair(privateKey, SECP256K1.publicKeyFromPrivate(privateKey));
    }

    public static ECKeyPair create(byte[] privateKey) {
        return create(Numeric.toBigInt(privateKey));
    }

    public byte[] sign(byte[] data) {
        return Sign.sign(this.privateKey, this.publicKey, Hash.sha3(data));
    }

    public String getAddress() {
        return address;
    }

    public BigInteger getPrivateKey() {
        return privateKey;
    }

    public BigInteger getPublicKey() {
        return publicKey;
    }


    public String getHexAddress() {
        byte[] pubBytes = publicKey.toByteArray();
        byte[] hash256 = Hash.sha3(Arrays.copyOfRange(pubBytes, 1, pubBytes.length));
        byte[] values = Arrays.copyOfRange(hash256, 12, hash256.length);
        return Numeric.toHexString(values);
    }
}
