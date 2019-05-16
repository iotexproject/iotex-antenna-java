package io.iotex.mobile.rpc;

import io.iotex.grpc.api.GetAccountRequest;
import io.iotex.grpc.api.GetAccountResponse;
import io.iotex.mobile.account.IotexAccountTest;
import org.junit.Assert;
import org.junit.Test;

/**
 * rpc method test.
 *
 * @author Yang XuePing
 */
public class RPCMethodTest {
    private static final String IOTEX_CORE = "api.testnet.iotex.one:80";

    @Test
    public void testGetAccount() {
        RPCMethod rpcMethod = new RPCMethod(IOTEX_CORE);
        GetAccountResponse response = rpcMethod.getAccount(GetAccountRequest.newBuilder().setAddress(IotexAccountTest.TEST_ADDRESS).build());
        Assert.assertNotNull(response);
    }
}
