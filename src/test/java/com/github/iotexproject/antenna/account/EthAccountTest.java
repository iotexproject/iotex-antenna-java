package com.github.iotexproject.antenna.account;

import com.github.iotexproject.antenna.utils.Numeric;
import org.junit.Test;

import java.security.Security;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * eth account test.
 *
 * @author Yang XuePing
 */
public class EthAccountTest {
    public static final String TEST_PRIVATE = "0ba6a6ce7712f69fbc560793f567f2c7c32b75ce83d37f565f184632c88d7fbb";
    public static final String TEST_PUBLIC = "b23675d4f86f9edd327165d9d4040c47f1333c5bb7212fb22f15ef292d5a4cf80046facad3123db2f38ff00d634a87c7cd0912f52bc99ecd607f3c15c3310f53";
    public static final String TEST_ADDRESS = "0x8896780a7912829781f70344ab93e589dddb2930";

    @Test
    public void testCreateByPrivate() {
        Account account = EthAccount.create(Numeric.toBigInt(TEST_PRIVATE));
        assertEquals(TEST_PRIVATE, Numeric.toHexString(account.privateKey()));
        assertEquals(TEST_PUBLIC, Numeric.toHexString(account.publicKey()));
        assertEquals(TEST_ADDRESS, account.address());
    }

    @Test
    public void testCreate() {
        Security.addProvider(new org.bouncycastle.jce.provider.BouncyCastleProvider());
        for (int i = 0; i < 100; i++) {
            Account account = EthAccount.create();
            assertNotNull(account);
            assertNotNull(account.privateKey());
            assertEquals(32, account.privateKey().length);
            assertEquals(64, account.publicKey().length);
            assertEquals(42, account.address().length());
            assertEquals("0x", account.address().substring(0, 2));
        }
    }
}
