package com.github.iotexproject.antenna.action.method;

import com.github.iotexproject.antenna.action.Envelop;
import com.github.iotexproject.antenna.protocol.StakeTransferOwnershipRequest;
import com.github.iotexproject.antenna.rpc.RPCMethod;
import com.github.iotexproject.antenna.utils.Numeric;
import com.github.iotexproject.grpc.types.Action;
import com.github.iotexproject.grpc.types.StakeTransferOwnership;
import com.google.protobuf.ByteString;

/**
 * StakeTransferOwnership method.
 *
 * @author Yang XuePing
 */
public class StakeTransferOwnershipMethod extends AbstractMethod {
    private final StakeTransferOwnershipRequest request;
    private final Envelop envelop;

    public StakeTransferOwnershipMethod(RPCMethod client, StakeTransferOwnershipRequest request) {
        super(client, request.getAccount());
        this.request = request;
        envelop = baseEnvelop(request);
    }

    @Override
    public String execute() {
        envelop.setStakeTransferOwnership(StakeTransferOwnership.newBuilder()
                .setBucketIndex(request.getBucketIndex())
                .setVoterAddress(request.getVoterAddress())
                .setPayload(ByteString.copyFrom(Numeric.hexStringToByteArray(request.getPayload())))
                .build());
        return sendAction(envelop);
    }

    public Action signedAction() {
        envelop.setStakeTransferOwnership(StakeTransferOwnership.newBuilder()
                .setBucketIndex(request.getBucketIndex())
                .setVoterAddress(request.getVoterAddress())
                .setPayload(ByteString.copyFrom(Numeric.hexStringToByteArray(request.getPayload())))
                .build());
        return signAction(envelop).action();
    }
}
