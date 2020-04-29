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

    @Test
    public void testStakeCreate() {
        Account account = IotexAccount.create("cfa6ef757dee2e50351620dca002d32b9c090cfda55fb81f37f1d26b273743f1");
        IOTX iotx = new IOTX(RPCMethodTest.IOTEX_CORE);

        StakeCreateRequest request = new StakeCreateRequest();
        request.setNonce(0l); // optional, can be null
        request.setGasLimit(1000000l); // optional, can be null
        request.setGasPrice("10"); // optional, can be null
        request.setAccount(account);
        request.setCandName("io19d0p3ah4g8ww9d7kcxfq87yxe7fnr8rpth5shj");
        request.setAmount("100");
        request.setDuration(10000);
        request.setAutoStake(true);
        request.setPayload("7061796c6f6164"); // optional, can be null

        String hash = iotx.stakeCreate(request);
        Assert.assertEquals(
                "f1785e47b4200c752bb6518bd18097a41e075438b8c18c9cb00e1ae2f38ce767",
                hash)
        );
    }
}
