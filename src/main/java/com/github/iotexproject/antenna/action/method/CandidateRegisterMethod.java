package com.github.iotexproject.antenna.action.method;

import com.github.iotexproject.antenna.action.Envelop;
import com.github.iotexproject.antenna.protocol.CandidateRegisterRequest;
import com.github.iotexproject.antenna.rpc.RPCMethod;
import com.github.iotexproject.antenna.utils.Numeric;
import com.github.iotexproject.grpc.types.Action;
import com.github.iotexproject.grpc.types.CandidateBasicInfo;
import com.github.iotexproject.grpc.types.CandidateRegister;
import com.google.protobuf.ByteString;

/**
 * CandidateRegister method.
 *
 * @author Yang XuePing
 */
public class CandidateRegisterMethod extends AbstractMethod {
    private final CandidateRegisterRequest request;
    private final Envelop envelop;

    public CandidateRegisterMethod(RPCMethod client, CandidateRegisterRequest request) {
        super(client, request.getAccount());
        this.request = request;
        envelop = baseEnvelop(request);
    }

    @Override
    public String execute() {
        envelop.setCandidateRegister(CandidateRegister.newBuilder()
                .setCandidate(CandidateBasicInfo.newBuilder()
                        .setName(request.getName())
                        .setOperatorAddress(request.getOperatorAddress())
                        .setRewardAddress(request.getRewardAddress())
                        .build())
                .setStakedAmount(request.getStakedAmount())
                .setStakedDuration(request.getStakedDuration())
                .setAutoStake(request.isAutoStake())
                .setOwnerAddress(request.getOwnerAddress())
                .setPayload(ByteString.copyFrom(Numeric.hexStringToByteArray(request.getPayload())))
                .build());
        return sendAction(envelop);
    }

    public Action signedAction() {
        envelop.setCandidateRegister(CandidateRegister.newBuilder()
                .setCandidate(CandidateBasicInfo.newBuilder()
                        .setName(request.getName())
                        .setOperatorAddress(request.getOperatorAddress())
                        .setRewardAddress(request.getRewardAddress())
                        .build())
                .setStakedAmount(request.getStakedAmount())
                .setStakedDuration(request.getStakedDuration())
                .setAutoStake(request.isAutoStake())
                .setOwnerAddress(request.getOwnerAddress())
                .setPayload(ByteString.copyFrom(Numeric.hexStringToByteArray(request.getPayload())))
                .build());
        return signAction(envelop).action();
    }
}
