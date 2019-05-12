package io.iotex.mobile.crypto;

import java.util.Arrays;

import static io.iotex.mobile.crypto.Hash.hmacSha512;

/**
 * bip32 utils.
 *
 * @author Yang XuePing
 */
public class Bip32 {
    public static byte[] generatePrivateKey(byte[] seed) {
        byte[] i = hmacSha512("Bitcoin seed".getBytes(), seed);
        byte[] il = Arrays.copyOfRange(i, 0, 32);
        //byte[] ir = Arrays.copyOfRange(i, 32, 64);
        return il;
    }
}
