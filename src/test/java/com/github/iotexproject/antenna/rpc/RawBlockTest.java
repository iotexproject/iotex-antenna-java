package com.github.iotexproject.antenna.rpc;

import com.github.iotexproject.antenna.crypto.Hash;
import com.github.iotexproject.antenna.utils.Numeric;
import com.github.iotexproject.grpc.api.APIServiceGrpc;
import com.github.iotexproject.grpc.api.GetRawBlocksRequest;
import com.github.iotexproject.grpc.api.GetRawBlocksResponse;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * rpc method test.
 *
 * @author Yang XuePing
 */
public class RawBlockTest {
    public static final String IOTEX_CORE = "api.iotex.one:80";

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
    public void testRawBlock() {
        ManagedChannel channel = ManagedChannelBuilder.forTarget(IOTEX_CORE).usePlaintext().build();
        APIServiceGrpc.APIServiceBlockingStub stub = APIServiceGrpc.newBlockingStub(channel);

        GetRawBlocksResponse response = stub.getRawBlocks(GetRawBlocksRequest.newBuilder().setStartHeight(600001).setCount(1).build());
        String preHash = Numeric.toHexString(response.getBlocksList().get(0).getBlock().getHeader().getCore().getPrevBlockHash().toByteArray());
        String hash = Numeric.toHexString(Hash.sha3(response.getBlocksList().get(0).getBlock().getHeader().toByteArray()));

        System.out.println(String.format("%d block\n\tpreBlockHash: %s\n\tblockHash: %s\n", 600001, preHash, hash));
    }
}
