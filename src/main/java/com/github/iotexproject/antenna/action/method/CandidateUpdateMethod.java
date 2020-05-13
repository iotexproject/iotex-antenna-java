package com.github.iotexproject.antenna.action.method;

import com.github.iotexproject.antenna.action.Envelop;
import com.github.iotexproject.antenna.protocol.CandidateUpdateRequest;
import com.github.iotexproject.antenna.rpc.RPCMethod;
import com.github.iotexproject.grpc.types.Action;
import com.github.iotexproject.grpc.types.CandidateBasicInfo;

/**
 * CandidateUpdate method.
 *
 * @author Yang XuePing
 */
public class CandidateUpdateMethod extends AbstractMethod {
    private final CandidateUpdateRequest request;
    private final Envelop envelop;

    public CandidateUpdateMethod(RPCMethod client, CandidateUpdateRequest request) {
        super(client, request.getAccount());
        this.request = request;
        envelop = baseEnvelop(request);
    }

    @Override
    public String execute() {
        envelop.setCandidateUpdate(CandidateBasicInfo.newBuilder()
                .setName(request.getName())
                .setOperatorAddress(request.getOperatorAddress())
                .setRewardAddress(request.getRewardAddress())
                .build());
        return sendAction(envelop);
    }

    public Action signedAction() {
        envelop.setCandidateUpdate(CandidateBasicInfo.newBuilder()
                .setName(request.getName())
                .setOperatorAddress(request.getOperatorAddress())
                .setRewardAddress(request.getRewardAddress())
                .build());
        return signAction(envelop).action();
    }
}
