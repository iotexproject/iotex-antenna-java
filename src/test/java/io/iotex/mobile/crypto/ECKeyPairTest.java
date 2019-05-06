package io.iotex.mobile.crypto;

import io.iotex.mobile.utils.Numeric;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Test ECKeyPair.
 *
 * @author Yang XuePing
 */
public class ECKeyPairTest {
    public static final String TEST_PRIVATE = "0806c458b262edd333a191e92f561aff338211ee3e18ab315a074a2d82aa343f";
    public static final String TEST_PUBLIC = "044e18306ae9ef4ec9d07bf6e705442d4d1a75e6cdf750330ca2d880f2cc54607c9c33deb9eae9c06e06e04fe9ce3d43962cc67d5aa34fbeb71270d4bad3d648d9";
    public static final String TEST_ADDRESS = "io187wzp08vnhjjpkydnr97qlh8kh0dpkkytfam8j";
    public static final String TEST_HEX_ADDRESS = "3f9c20bcec9de520d88d98cbe07ee7b5ded0dac4";

    @Test
    public void testCreateKeyPairByPrivate() {
        ECKeyPair keyPair = ECKeyPair.create(Numeric.hexStringToByteArray(TEST_PRIVATE));
        assertEquals(TEST_PUBLIC, Numeric.toHexString(keyPair.getPublicKey().toByteArray()));
        assertEquals(TEST_ADDRESS, keyPair.getAddress());
    }

    @Test
    public void testSign() {
        ECKeyPair keyPair = ECKeyPair.create(Numeric.hexStringToByteArray(TEST_PRIVATE));
        byte[] sign = keyPair.sign("IoTeX is the auto-scalable and privacy-centric blockchain.".getBytes());
        assertEquals(
                "482da72c8faa48ee1ac2cf9a5f9ecd42ee3258be5ddd8d6b496c7171dc7bfe8e75e5d16e7129c88d99a21a912e5c082fa1baab6ba87d2688ebd7d27bb1ab090701",
                Numeric.toHexString(sign)
        );
    }
}
