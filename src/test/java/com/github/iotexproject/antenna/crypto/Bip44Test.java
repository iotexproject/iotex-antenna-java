package com.github.iotexproject.antenna.crypto;

import com.github.iotexproject.antenna.account.Account;
import com.github.iotexproject.antenna.account.EthAccount;
import com.github.iotexproject.antenna.account.IotexAccount;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigInteger;

/**
 * bip39 test.
 *
 * @author Yang XuePing
 */
public class Bip44Test {
    @Test
    public void createPrivateKeyBySeed() {
        byte[] seed = Bip39.generateSeed("clever seek document inner key cook picture radar join eyebrow general sketch", "");
        BigInteger key = Bip44.createPrivateKeyBySeed("m/44'/60'/0'/0/0", seed);
        Account account = EthAccount.create(key);
        Assert.assertEquals("0xfE68A0Bb38669089030386dE6068A8287a052D8f".toLowerCase(), account.address());
    }

    @Test
    public void createRestoreBySeed() {
        String mnemonic = "clever seek document inner key cook picture radar join eyebrow general sketch";
        byte[] chiper = Aes.encrypt("123456", mnemonic.getBytes());
        String restoredMnemonic = new String(Aes.decrypt("123456", chiper));

        byte[] seed = Bip39.generateSeed(restoredMnemonic, "");
        BigInteger key = Bip44.createPrivateKeyBySeed("m/44'/60'/0'/0/0", seed);
        Account ethAccount = EthAccount.create(key);
        Assert.assertEquals("0xfE68A0Bb38669089030386dE6068A8287a052D8f".toLowerCase(), ethAccount.address());
        key = Bip44.createPrivateKeyBySeed("m/44'/60'/0'/0/1", seed);
        ethAccount = EthAccount.create(key);
        Assert.assertEquals("0x73F2D8e888c7F2A4b6aE7f90f9469e2B47257b54".toLowerCase(), ethAccount.address());

        key = Bip44.createPrivateKeyBySeed("m/44'/304'/0'/0/0", seed);
        Account iotexAccount = IotexAccount.create(key);
        Assert.assertEquals("io1y0zdk0wcclr3nnhch8h7rnxgrtqcwejvj9pjgn", iotexAccount.address());
    }
}
