package com.github.iotexproject.antenna.account;

import com.github.iotexproject.antenna.crypto.Hash;
import com.github.iotexproject.antenna.crypto.SECP256K1;
import com.github.iotexproject.antenna.utils.Numeric;
import org.bouncycastle.jcajce.provider.asymmetric.ec.BCECPrivateKey;
import org.bouncycastle.jcajce.provider.asymmetric.ec.BCECPublicKey;

import java.math.BigInteger;
import java.security.KeyPair;
import java.util.Arrays;

/**
 * eth account.
 *
 * @author Yang XuePing
 */
public class EthAccount extends AbstractAccount implements Account {
    // AddressPrefix is the prefix added to the human readable address.
    public static final String AddressPrefix = "0x";

    // prevent create outer
    private EthAccount(BigInteger privateKey, BigInteger publicKey) {
        this.privateKey = privateKey;
        this.publicKey = publicKey;
        this.address = computeAddress(publicKey());
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
                new BigInteger(1, Arrays.copyOfRange(publicKeyBytes, 1, publicKeyBytes.length));

        return new EthAccount(privateKeyValue, publicKeyValue);
    }

    /**
     * create by private key.
     *
     * @param privateKey
     * @return
     */
    public static Account create(BigInteger privateKey) {
        return new EthAccount(privateKey, SECP256K1.publicKeyFromPrivate(privateKey, 1));
    }

    private static String computeAddress(byte[] publicKey) {
        byte[] hash256 = Hash.sha3(publicKey);
        return AddressPrefix + Numeric.toHexString(hash256).substring(24);
    }

    @Override
    public byte[] publicKey() {
        return Numeric.toBytesPadded(publicKey, 64);
    }

    @Override
    public byte[] sign(byte[] data) {
        throw new UnsupportedOperationException("please use web3j to sign");
    }
}
