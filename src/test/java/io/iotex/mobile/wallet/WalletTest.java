package io.iotex.mobile.wallet;

import io.iotex.mobile.crypto.ECKeyPair;
import io.iotex.mobile.utils.Numeric;
import org.junit.Assert;
import org.junit.Test;

import static io.iotex.mobile.crypto.ECKeyPairTest.*;


/**
 * wallet test.
 *
 * @author Yang XuePing
 */
public class WalletTest {
    public static final String TEST_KEYSTORE = "{\"address\":\"io187wzp08vnhjjpkydnr97qlh8kh0dpkkytfam8j\",\"id\":\"91cd0053-ab75-48f3-8532-f3b421ba12c0\",\"version\":3,\"crypto\":{\"cipher\":\"aes-128-ctr\",\"ciphertext\":\"5a2fadcc2c20666e43f078ee8a55b09f798be10f3dd12b1394eeee29f79bf193\",\"cipherparams\":{\"iv\":\"c54b9f15e6bff1087362c23b358e2992\"},\"kdf\":\"scrypt\",\"kdfparams\":{\"dklen\":32,\"n\":262144,\"p\":1,\"r\":8,\"salt\":\"69a9fa00faedbd1a92065ad8007254fdd7c84d19233bb50d95baf32829a1c152\"},\"mac\":\"1cbc221fb1bbd34970523d8d2587c737521e36dabe9e1bb343aabf99c90886d9\"}}\n";

    @Test
    public void testCreateWalletFileByExistKeyPair() {
        ECKeyPair keyPair = ECKeyPair.create(Numeric.hexStringToByteArray(TEST_PRIVATE));
        WalletFile walletFile = Wallet.createStandard("123456", keyPair);
        Assert.assertEquals(TEST_ADDRESS, walletFile.getAddress());
        Assert.assertNotNull(WalletUtils.toWalletFileJson(walletFile));
    }

    @Test
    public void testLoadKeystore() {
        ECKeyPair keyPair = WalletUtils.loadKeystore("123456", TEST_KEYSTORE);
        Assert.assertNotNull(keyPair);
        Assert.assertEquals(TEST_ADDRESS, keyPair.getAddress());
        Assert.assertEquals(TEST_PRIVATE, Numeric.toHexString(keyPair.getPrivateKey().toByteArray()));
        Assert.assertEquals(TEST_PUBLIC, Numeric.toHexString(keyPair.getPublicKey().toByteArray()));
    }
}
