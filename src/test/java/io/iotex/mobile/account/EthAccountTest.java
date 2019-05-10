package io.iotex.mobile.account;

import io.iotex.mobile.utils.Numeric;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * eth account test.
 *
 * @author Yang XuePing
 */
public class EthAccountTest {
    public static final String TEST_PRIVATE = "0ba6a6ce7712f69fbc560793f567f2c7c32b75ce83d37f565f184632c88d7fbb";
    public static final String TEST_PUBLIC = "00b23675d4f86f9edd327165d9d4040c47f1333c5bb7212fb22f15ef292d5a4cf80046facad3123db2f38ff00d634a87c7cd0912f52bc99ecd607f3c15c3310f53";
    public static final String TEST_ADDRESS = "0x8896780a7912829781f70344ab93e589dddb2930";

    @Test
    public void testCreateByPrivate() {
        Account account = EthAccount.create(Numeric.toBigInt(TEST_PRIVATE));
        assertEquals(TEST_PRIVATE, account.privateKey());
        assertEquals(TEST_PUBLIC, account.publicKey());
        assertEquals(TEST_ADDRESS, account.address());
    }
}
