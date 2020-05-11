package com.github.iotexproject.antenna.action.method;

import com.google.protobuf.ByteString;
import com.github.iotexproject.grpc.types.StakeCreate;
import com.github.iotexproject.antenna.action.Envelop;
import com.github.iotexproject.antenna.protocol.StakeCreateRequest;
import com.github.iotexproject.antenna.rpc.RPCMethod;
import com.github.iotexproject.antenna.utils.Numeric;

/**
 * stakeCreate method.
 *
 * @author Dustin Xie
 */
public class StakeCreateMethod extends AbstractMethod {
    private StakeCreateRequest request;
    private Envelop envelop;

    public StakeCreateMethod(RPCMethod client, StakeCreateRequest request) {
        super(client, request.getAccount());
        this.request = request;
        envelop = baseEnvelop(request);
    }

    @Override
    public String execute() {
        envelop.setStakeCreate(StakeCreate.newBuilder()
                .setCandidateName(request.getCandName())
                .setStakedAmount(request.getAmount())
                .setStakedDuration(request.getDuration())
                .setAutoStake(request.isAutoStake())
                .setPayload(ByteString.copyFrom(Numeric.hexStringToByteArray(request.getPayload())))
                .build());
        return sendAction(envelop);
    }
}
