package com.github.iotexproject.antenna.crypto;

import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.util.Arrays;

import static com.github.iotexproject.antenna.crypto.Hash.hmacSha512;

/**
 * HDKeyDerivation
 *
 * @author Yang XuePing
 */
public class HDKeyDerivation {
    public static DeterministicKey createMasterPrivateKey(byte[] seed) throws HDDerivationException {
        byte[] i = hmacSha512("Bitcoin seed".getBytes(), seed);
        byte[] il = Arrays.copyOfRange(i, 0, 32);
        byte[] ir = Arrays.copyOfRange(i, 32, 64);
        Arrays.fill(i, (byte) 0);
        DeterministicKey masterPrivKey = createMasterPrivKeyFromBytes(il, ir);
        Arrays.fill(il, (byte) 0);
        Arrays.fill(ir, (byte) 0);
        return masterPrivKey;
    }

    public static DeterministicKey createMasterPrivKeyFromBytes(byte[] privKeyBytes, byte[] chainCode) throws HDDerivationException {
        BigInteger priv = new BigInteger(1, privKeyBytes);
        return new DeterministicKey(null, priv.toByteArray(), chainCode, HDPath.m());
    }

    public static DeterministicKey deriveChildKey(DeterministicKey parent, int childNumber) {
        return deriveChildKey(parent, new ChildNumber(childNumber));
    }

    public static DeterministicKey deriveChildKey(DeterministicKey parent, ChildNumber childNumber) throws HDDerivationException {
        return deriveChildKeyFromPrivate(parent, childNumber);
    }

    public static DeterministicKey deriveChildKeyFromPrivate(DeterministicKey parent, ChildNumber childNumber)
            throws HDDerivationException {
        RawKeyBytes rawKey = deriveChildKeyBytesFromPrivate(parent, childNumber);
        return new DeterministicKey(parent, new BigInteger(1, rawKey.keyBytes).toByteArray(), rawKey.chainCode, parent.getPath().extend(childNumber));
    }

    public static RawKeyBytes deriveChildKeyBytesFromPrivate(DeterministicKey parent,
                                                             ChildNumber childNumber) throws HDDerivationException {
        byte[] parentPublicKey = parent.getPubKeyPoint().getEncoded(true);
        ByteBuffer data = ByteBuffer.allocate(37);
        if (childNumber.isHardened()) {
            data.put(parent.getPrivKeyBytes33());
        } else {
            data.put(parentPublicKey);
        }
        data.putInt(childNumber.i());
        byte[] i = hmacSha512(parent.getChainCode(), data.array());
        byte[] il = Arrays.copyOfRange(i, 0, 32);
        byte[] chainCode = Arrays.copyOfRange(i, 32, 64);
        BigInteger ilInt = new BigInteger(1, il);
        final BigInteger priv = parent.getPrivateKey();
        BigInteger ki = priv.add(ilInt).mod(SECP256K1.CURVE.getN());
        return new RawKeyBytes(ki.toByteArray(), chainCode);
    }

    public static class RawKeyBytes {
        public final byte[] keyBytes, chainCode;

        public RawKeyBytes(byte[] keyBytes, byte[] chainCode) {
            this.keyBytes = keyBytes;
            this.chainCode = chainCode;
        }
    }
}
