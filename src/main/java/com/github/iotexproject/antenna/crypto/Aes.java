package com.github.iotexproject.antenna.crypto;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import java.security.Key;
import java.security.SecureRandom;

/**
 * AES
 *
 * @author Yang XuePing
 */
public class Aes {
    public static Key getKey(String keySeed) {
        try {
            SecureRandom secureRandom = SecureRandom.getInstance("SHA1PRNG");
            secureRandom.setSeed(keySeed.getBytes());
            KeyGenerator generator = KeyGenerator.getInstance("AES");
            generator.init(secureRandom);
            return generator.generateKey();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static final byte[] encrypt(String seed, byte[] plainText) {
        Key secretKey = getKey(seed);
        try {
            Cipher cipher = Cipher.getInstance("AES");
            cipher.init(Cipher.ENCRYPT_MODE, secretKey);
            return cipher.doFinal(plainText);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static final byte[] decrypt(String seed, byte[] cipherText) {
        Key secretKey = getKey(seed);
        try {
            Cipher cipher = Cipher.getInstance("AES");
            cipher.init(Cipher.DECRYPT_MODE, secretKey);
            return cipher.doFinal(cipherText);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
