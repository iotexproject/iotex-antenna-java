package com.github.iotexproject.antenna.action.method;

import com.github.iotexproject.antenna.protocol.ExecutionRequest;
import com.google.protobuf.ByteString;
import com.github.iotexproject.grpc.types.Action;
import com.github.iotexproject.grpc.types.Execution;
import com.github.iotexproject.antenna.action.Envelop;
import com.github.iotexproject.antenna.rpc.RPCMethod;

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
