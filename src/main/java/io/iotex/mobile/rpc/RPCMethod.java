package io.iotex.mobile.rpc;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.iotex.grpc.api.APIServiceGrpc;
import io.iotex.grpc.api.GetAccountRequest;
import io.iotex.grpc.api.GetAccountResponse;

/**
 * rpc method.
 *
 * @author Yang XuePing
 */
public class RPCMethod {
    private ManagedChannel channel;
    private APIServiceGrpc.APIServiceBlockingStub stub;

    public RPCMethod(String hostname) {
        channel = ManagedChannelBuilder.forTarget(hostname).usePlaintext().build();
        stub = APIServiceGrpc.newBlockingStub(channel);
    }

    public void close() {
        if (channel != null) {
            channel.shutdown();
        }
    }

    public GetAccountResponse getAccount(GetAccountRequest request) {
        return stub.getAccount(request);
    }
}
