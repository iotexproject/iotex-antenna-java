package io.iotex.mobile.crypto;

import io.iotex.mobile.utils.Numeric;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * bip39 test.
 *
 * @author Yang XuePing
 */
public class Bip39Test {
    private static final String mnemonic128 = "bonus enemy toward slender kiss game only angry lens rifle auction brick";
    private static final String mnemonic256 = "slush cotton solar unable round violin dismiss mom rule planet upgrade among inch switch hire turtle artist agree coconut milk require chest lumber know";
    private static final String privateKey = "bdde8969dff56cb3c43de4ecc0d5e895bc6805f8591ea2ee70298ff8e4534822";

    @Test
    public void testGenerate() {
        String mnemonic = Bip39.generateMnemonic(256);
        System.out.println(mnemonic);
        Assert.assertNotNull(mnemonic);
    }

    @Test
    public void testGenerateSeed() {
        byte[] seed = Bip39.generateSeed(mnemonic128, "");
        assertEquals(64, seed.length);
        byte[] privKey = Bip32.generatePrivateKey(seed);
        assertEquals(privateKey, Numeric.toHexString(privKey));
    }
}
