package io.iotex.mobile.crypto;

import io.iotex.mobile.utils.Numeric;
import org.bouncycastle.asn1.x9.X9ECParameters;
import org.bouncycastle.crypto.ec.CustomNamedCurves;
import org.bouncycastle.crypto.params.ECDomainParameters;
import org.bouncycastle.jcajce.provider.asymmetric.ec.BCECPrivateKey;
import org.bouncycastle.jcajce.provider.asymmetric.ec.BCECPublicKey;
import org.bouncycastle.math.ec.ECPoint;
import org.bouncycastle.math.ec.FixedPointCombMultiplier;

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

    public static final X9ECParameters CURVE_PARAMS = CustomNamedCurves.getByName("secp256k1");
    static final ECDomainParameters CURVE = new ECDomainParameters(
            CURVE_PARAMS.getCurve(), CURVE_PARAMS.getG(), CURVE_PARAMS.getN(), CURVE_PARAMS.getH());

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
        return new ECKeyPair(privateKey, publicKeyFromPrivate(privateKey));
    }

    public static ECKeyPair create(byte[] privateKey) {
        return create(Numeric.toBigInt(privateKey));
    }

    /**
     * Returns public key from the given private key.
     *
     * @param privKey the private key to derive the public key from
     * @return BigInteger encoded public key
     */
    public static BigInteger publicKeyFromPrivate(BigInteger privKey) {
        ECPoint point = publicPointFromPrivate(privKey);
        byte[] encoded = point.getEncoded(false);
        return new BigInteger(1, Arrays.copyOfRange(encoded, 0, encoded.length));
    }

    /**
     * Returns public key point from the given private key.
     *
     * @param privKey the private key to derive the public key from
     * @return ECPoint public key
     */
    public static ECPoint publicPointFromPrivate(BigInteger privKey) {
        if (privKey.bitLength() > CURVE.getN().bitLength()) {
            privKey = privKey.mod(CURVE.getN());
        }
        return new FixedPointCombMultiplier().multiply(CURVE.getG(), privKey);
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
}
