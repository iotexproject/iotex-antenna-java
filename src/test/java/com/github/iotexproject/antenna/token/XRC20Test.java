package com.github.iotexproject.antenna.token;

import com.github.iotexproject.antenna.account.Account;
import com.github.iotexproject.antenna.account.IotexAccount;
import com.github.iotexproject.antenna.account.IotexAccountTest;
import com.github.iotexproject.antenna.rpc.RPCMethod;
import org.junit.Assert;

import java.math.BigInteger;

import static com.github.iotexproject.antenna.rpc.RPCMethodTest.IOTEX_CORE;

/**
 * XRC20 test.
 *
 * @author Yang XuePing
 */
public class XRC20Test {
    public void testConstant() {
        RPCMethod provider = new RPCMethod(IOTEX_CORE, 2);

        XRC20 vita = new XRC20(provider, "io14j96vg9pkx28htpgt2jx0tf3v9etpg4j9h384m");
        Assert.assertEquals("Vitality", vita.name());
        Assert.assertEquals("VITA", vita.symbol());
        Assert.assertEquals(Long.valueOf(18), vita.decimals());
        Assert.assertNotNull(vita.totalSupply());
    }


    public void testTransfer() {
        RPCMethod provider = new RPCMethod(IOTEX_CORE, 2);
        Account account = IotexAccount.create(IotexAccountTest.TEST_PRIVATE);

        XRC20 vita = new XRC20(provider, "io14j96vg9pkx28htpgt2jx0tf3v9etpg4j9h384m");
        Assert.assertNotNull(vita.transfer("io13zt8sznez2pf0q0hqdz2hyl938wak2fsjgdeml", BigInteger.valueOf(1l), account, "1000000000000", 50000l));
    }
}
