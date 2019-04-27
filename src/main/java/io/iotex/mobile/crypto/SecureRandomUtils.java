package io.iotex.mobile.crypto;

import java.security.SecureRandom;

/**
 * secure random utils.
 *
 * @author Yang XuePing
 */
public final class SecureRandomUtils {
    private static final SecureRandom SECURE_RANDOM;
    // Taken from BitcoinJ implementation
    private static int isAndroid = -1;

    static {
        if (isAndroidRuntime()) {
            new LinuxSecureRandom();
        }
        SECURE_RANDOM = new SecureRandom();
    }

    private SecureRandomUtils() {
    }

    static SecureRandom secureRandom() {
        return SECURE_RANDOM;
    }

    static boolean isAndroidRuntime() {
        if (isAndroid == -1) {
            final String runtime = System.getProperty("java.runtime.name");
            isAndroid = (runtime != null && runtime.equals("Android Runtime")) ? 1 : 0;
        }
        return isAndroid == 1;
    }
}
