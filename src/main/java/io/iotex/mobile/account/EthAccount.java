package io.iotex.mobile.account;

import io.iotex.mobile.crypto.Hash;
import io.iotex.mobile.crypto.SECP256K1;
import io.iotex.mobile.utils.Numeric;

import java.math.BigInteger;
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
        this.address = computeAddress(publicKey);
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

    private static String computeAddress(BigInteger publicKey) {
        byte[] hash256 = Hash.sha3(Numeric.toBytesPadded(publicKey, 64));
        byte[] values = Arrays.copyOfRange(hash256, 12, hash256.length);
        return AddressPrefix + Numeric.toHexString(values);
    }

    @Override
    public byte[] sign(byte[] data) {
        return new byte[0];
    }
}
