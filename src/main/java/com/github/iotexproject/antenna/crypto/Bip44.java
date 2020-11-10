package com.github.iotexproject.antenna.crypto;

import java.math.BigInteger;
import java.util.List;

/**
 * bip44 utils.
 *
 * @author Yang XuePing
 */
public class Bip44 {
    public static BigInteger createPrivateKeyBySeed(String path, byte[] seed) {
        DeterministicKey masterKey = HDKeyDerivation.createMasterPrivateKey(seed);
        List<ChildNumber> childNumberList = HDPath.parsePath(path);
        DeterministicKey key = masterKey;
        for (ChildNumber childNumber : childNumberList) {
            key = HDKeyDerivation.deriveChildKey(key, childNumber);
        }

        return key.getPrivateKey();
    }
}
