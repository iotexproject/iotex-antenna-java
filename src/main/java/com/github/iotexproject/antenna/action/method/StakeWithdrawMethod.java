package com.github.iotexproject.antenna.action.method;

import com.github.iotexproject.antenna.action.Envelop;
import com.github.iotexproject.antenna.protocol.StakeWithdrawRequest;
import com.github.iotexproject.antenna.rpc.RPCMethod;
import com.github.iotexproject.antenna.utils.Numeric;
import com.github.iotexproject.grpc.types.Action;
import com.github.iotexproject.grpc.types.StakeReclaim;
import com.google.protobuf.ByteString;

/**
 * stakeWithdraw method.
 *
 * @author Yang XuePing
 */
public class StakeWithdrawMethod extends AbstractMethod {
    private final StakeWithdrawRequest request;
    private final Envelop envelop;

    public StakeWithdrawMethod(RPCMethod client, StakeWithdrawRequest request) {
        super(client, request.getAccount());
        this.request = request;
        envelop = baseEnvelop(request);
    }

    @Override
    public String execute() {
        envelop.setStakeWithdraw(StakeReclaim.newBuilder()
                .setBucketIndex(request.getBucketIndex())
                .setPayload(ByteString.copyFrom(Numeric.hexStringToByteArray(request.getPayload())))
                .build());
        return sendAction(envelop);
    }

    public Action signedAction() {
        envelop.setStakeWithdraw(StakeReclaim.newBuilder()
                .setBucketIndex(request.getBucketIndex())
                .setPayload(ByteString.copyFrom(Numeric.hexStringToByteArray(request.getPayload())))
                .build());
        return signAction(envelop).action();
    }
}
