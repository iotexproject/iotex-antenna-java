package com.github.iotexproject.antenna.action.method;

import com.github.iotexproject.antenna.action.Envelop;
import com.github.iotexproject.antenna.protocol.StakeAddDepositRequest;
import com.github.iotexproject.antenna.rpc.RPCMethod;
import com.github.iotexproject.antenna.utils.Numeric;
import com.github.iotexproject.grpc.types.Action;
import com.github.iotexproject.grpc.types.StakeAddDeposit;
import com.google.protobuf.ByteString;

/**
 * stakeAddDeposit method.
 *
 * @author Yang XuePing
 */
public class StakeAddDepositMethod extends AbstractMethod {
    private final StakeAddDepositRequest request;
    private final Envelop envelop;

    public StakeAddDepositMethod(RPCMethod client, StakeAddDepositRequest request) {
        super(client, request.getAccount());
        this.request = request;
        envelop = baseEnvelop(request);
    }

    @Override
    public String execute() {
        envelop.setStakeAddDeposit(StakeAddDeposit.newBuilder()
                .setBucketIndex(request.getBucketIndex())
                .setAmount(request.getAmount())
                .setPayload(ByteString.copyFrom(Numeric.hexStringToByteArray(request.getPayload())))
                .build());
        return sendAction(envelop);
    }

    public Action signedAction() {
        envelop.setStakeAddDeposit(StakeAddDeposit.newBuilder()
                .setBucketIndex(request.getBucketIndex())
                .setAmount(request.getAmount())
                .setPayload(ByteString.copyFrom(Numeric.hexStringToByteArray(request.getPayload())))
                .build());
        return signAction(envelop).action();
    }
}
