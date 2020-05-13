package com.github.iotexproject.antenna.action.method;

import com.github.iotexproject.antenna.action.Envelop;
import com.github.iotexproject.antenna.protocol.StakeRestakeRequest;
import com.github.iotexproject.antenna.rpc.RPCMethod;
import com.github.iotexproject.antenna.utils.Numeric;
import com.github.iotexproject.grpc.types.Action;
import com.github.iotexproject.grpc.types.StakeRestake;
import com.google.protobuf.ByteString;

/**
 * stakeWithdraw method.
 *
 * @author Yang XuePing
 */
public class StakeRestakeMethod extends AbstractMethod {
    private final StakeRestakeRequest request;
    private final Envelop envelop;

    public StakeRestakeMethod(RPCMethod client, StakeRestakeRequest request) {
        super(client, request.getAccount());
        this.request = request;
        envelop = baseEnvelop(request);
    }

    @Override
    public String execute() {
        envelop.setStakeRestake(StakeRestake.newBuilder()
                .setBucketIndex(request.getBucketIndex())
                .setStakedDuration(request.getStakedDuration())
                .setAutoStake(request.isAutoStake())
                .setPayload(ByteString.copyFrom(Numeric.hexStringToByteArray(request.getPayload())))
                .build());
        return sendAction(envelop);
    }

    public Action signedAction() {
        envelop.setStakeRestake(StakeRestake.newBuilder()
                .setBucketIndex(request.getBucketIndex())
                .setStakedDuration(request.getStakedDuration())
                .setAutoStake(request.isAutoStake())
                .setPayload(ByteString.copyFrom(Numeric.hexStringToByteArray(request.getPayload())))
                .build());
        return signAction(envelop).action();
    }
}
