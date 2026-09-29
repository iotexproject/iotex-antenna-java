package com.github.iotexproject.antenna.action.method;

import com.github.iotexproject.antenna.action.Envelop;
import com.github.iotexproject.antenna.protocol.CandidateUpdateRequest;
import com.github.iotexproject.antenna.rpc.RPCMethod;
import com.github.iotexproject.grpc.types.Action;

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
        envelop.setCandidateUpdate(candidateBasicInfo(
                request.getName(),
                request.getOperatorAddress(),
                request.getRewardAddress(),
                request.getBlsPubKey(),
                request.getBlsPop()));
        return sendAction(envelop);
    }

    public Action signedAction() {
        envelop.setCandidateUpdate(candidateBasicInfo(
                request.getName(),
                request.getOperatorAddress(),
                request.getRewardAddress(),
                request.getBlsPubKey(),
                request.getBlsPop()));
        return signAction(envelop).action();
    }
}
