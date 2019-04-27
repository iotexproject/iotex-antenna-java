package io.iotex.mobile.crypto;

import java.security.*;
import java.security.spec.ECGenParameterSpec;

import static io.iotex.mobile.crypto.SecureRandomUtils.secureRandom;

/**
 * SECP256K1 implement by bouncycastle.
 *
 * @author Yang XuePing
 */
public final class SECP256K1 {
    static KeyPair createSecp256k1KeyPair() throws NoSuchProviderException,
            NoSuchAlgorithmException, InvalidAlgorithmParameterException {
        return createSecp256k1KeyPair(secureRandom());
    }

    static KeyPair createSecp256k1KeyPair(SecureRandom random) throws NoSuchProviderException,
            NoSuchAlgorithmException, InvalidAlgorithmParameterException {
        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("ECDSA", "BC");
        ECGenParameterSpec ecGenParameterSpec = new ECGenParameterSpec("secp256k1");
        if (random != null) {
            keyPairGenerator.initialize(ecGenParameterSpec, random);
        } else {
            keyPairGenerator.initialize(ecGenParameterSpec);
        }
        return keyPairGenerator.generateKeyPair();
    }
}
