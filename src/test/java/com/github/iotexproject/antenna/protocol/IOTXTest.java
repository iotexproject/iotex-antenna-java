package com.github.iotexproject.antenna.protocol;

import com.github.iotexproject.antenna.account.Account;
import com.github.iotexproject.antenna.account.IotexAccount;
import com.github.iotexproject.antenna.rpc.RPCMethodTest;
import org.junit.Assert;
import org.junit.Test;

/**
 * iotx test.
 *
 * @author Yang XuePing
 */
public class IOTXTest {
    @Test
    public void testTransfer() {
        //Account account = IotexAccount.create(IotexAccountTest.TEST_PRIVATE);
        Account account = IotexAccount.create("41a0dd7befae299109a2e64fd4f275d8c6d0148c2637fea605b8716d64d8236d");
        IOTX iotx = new IOTX(RPCMethodTest.IOTEX_CORE);

        TransferRequest request = new TransferRequest();
        //request.setNonce(1l); // optional, can be null
        request.setGasLimit(100000l); // optional, can be null
        request.setGasPrice("1000000000000"); // optional, can be null
        request.setAccount(account);
        request.setAmount("100");
        request.setRecipient("io13zt8sznez2pf0q0hqdz2hyl938wak2fsjgdeml");
        request.setPayload("68656c6c6f20776f726c6421"); // optional, can be null

        String hash = iotx.sendTransfer(request);
        Assert.assertNotNull(hash);
    }
}
