package com.github.iotexproject.antenna.rpc;

import com.github.iotexproject.antenna.account.IotexAccountTest;
import com.github.iotexproject.grpc.api.*;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * rpc method test.
 *
 * @author Yang XuePing
 */
public class RPCMethodTest {
    public static final String IOTEX_CORE = "api.testnet.iotex.one:80";

    private RPCMethod rpcMethod;

    @Before
    public void init() {
        this.rpcMethod = new RPCMethod(IOTEX_CORE);
    }

    @After
    public void clear() {
        this.rpcMethod.close();
    }

    @Test
    public void testGetAccount() {
        GetAccountResponse response = rpcMethod.getAccount(GetAccountRequest.newBuilder().setAddress(IotexAccountTest.TEST_ADDRESS).build());
        Assert.assertNotNull(response);
    }

    @Test
    public void testGetServerMeta() {
        GetServerMetaResponse response = rpcMethod.getServerMeta(GetServerMetaRequest.newBuilder().build());
        Assert.assertNotNull(response);
    }

    @Test
    public void testGetTransactionLogByBlockHeight() {
        GetTransactionLogByBlockHeightResponse response = rpcMethod.getTransactionLogByBlockHeight(
                GetTransactionLogByBlockHeightRequest.newBuilder()
                        .setBlockHeight(10000)
                        .build()
        );
        Assert.assertNotNull(response);
    }
}
