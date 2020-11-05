package com.github.iotexproject.antenna.crypto;

import org.bouncycastle.math.ec.ECPoint;

import java.math.BigInteger;
import java.util.Arrays;

/**
 * DeterministicKey
 *
 * @author Yang XuePing
 */
public class DeterministicKey {
    private final DeterministicKey parent;
    private final HDPath childNumberPath;
    private final int depth;
    private final BigInteger privateKey;
    private final byte[] chainCode;

    public DeterministicKey(DeterministicKey parent, byte[] privateKey, byte[] chainCode, HDPath childNumberPath) {
        this.parent = parent;
        this.childNumberPath = childNumberPath;
        this.privateKey = new BigInteger(privateKey);
        this.chainCode = Arrays.copyOf(chainCode, chainCode.length);
        this.depth = parent == null ? 0 : parent.depth + 1;
    }

    public byte[] getChainCode() {
        return chainCode;
    }

    public ECPoint getPubKeyPoint() {
        return SECP256K1.publicPointFromPrivate(this.privateKey);
    }

    public byte[] getPrivKeyBytes33() {
        byte[] bytes33 = new byte[33];
        byte[] priv = this.privateKey.toByteArray();
        System.arraycopy(priv, 0, bytes33, 33 - priv.length, priv.length);
        return bytes33;
    }

    public BigInteger getPrivateKey() {
        return privateKey;
    }

    public HDPath getPath() {
        return childNumberPath;
    }
}
