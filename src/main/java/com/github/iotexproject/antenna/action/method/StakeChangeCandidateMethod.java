package com.github.iotexproject.antenna.action.method;

import com.github.iotexproject.antenna.action.Envelop;
import com.github.iotexproject.antenna.protocol.StakeChangeCandidateRequest;
import com.github.iotexproject.antenna.rpc.RPCMethod;
import com.github.iotexproject.antenna.utils.Numeric;
import com.github.iotexproject.grpc.types.Action;
import com.github.iotexproject.grpc.types.StakeChangeCandidate;
import com.google.protobuf.ByteString;

/**
 * StakeChangeCandidate method.
 *
 * @author Yang XuePing
 */
public class StakeChangeCandidateMethod extends AbstractMethod {
    private final StakeChangeCandidateRequest request;
    private final Envelop envelop;

    public StakeChangeCandidateMethod(RPCMethod client, StakeChangeCandidateRequest request) {
        super(client, request.getAccount());
        this.request = request;
        envelop = baseEnvelop(request);
    }

    @Override
    public String execute() {
        envelop.setStakeChangeCandidate(StakeChangeCandidate.newBuilder()
                .setBucketIndex(request.getBucketIndex())
                .setCandidateName(request.getCandidateName())
                .setPayload(ByteString.copyFrom(Numeric.hexStringToByteArray(request.getPayload())))
                .build());
        return sendAction(envelop);
    }

    public Action signedAction() {
        envelop.setStakeChangeCandidate(StakeChangeCandidate.newBuilder()
                .setBucketIndex(request.getBucketIndex())
                .setCandidateName(request.getCandidateName())
                .setPayload(ByteString.copyFrom(Numeric.hexStringToByteArray(request.getPayload())))
                .build());
        return signAction(envelop).action();
    }
}
