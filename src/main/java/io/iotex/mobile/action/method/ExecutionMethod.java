package io.iotex.mobile.action.method;

import com.google.protobuf.ByteString;
import io.iotex.grpc.types.Action;
import io.iotex.grpc.types.Execution;
import io.iotex.mobile.action.Envelop;
import io.iotex.mobile.protocol.ExecutionRequest;
import io.iotex.mobile.rpc.RPCMethod;

/**
 * execution method.
 *
 * @author Yang XuePing
 */
public class ExecutionMethod extends AbstractMethod {
    private ExecutionRequest request;
    private Envelop envelop;

    public ExecutionMethod(RPCMethod client, ExecutionRequest request) {
        super(client, request.getAccount());
        this.request = request;
        envelop = baseEnvelop(request);
    }

    @Override
    public String execute() {
        envelop.setExecution(Execution.newBuilder()
                .setContract(request.getContract())
                .setData(ByteString.copyFrom(request.getData()))
                .setAmount(request.getAmount())
                .build());
        return sendAction(envelop);
    }

    public Action signedAction() {
        envelop.setExecution(Execution.newBuilder()
                .setContract(request.getContract())
                .setData(ByteString.copyFrom(request.getData()))
                .setAmount(request.getAmount())
                .build());
        return signAction(envelop).action();
    }
}
