package com.github.iotexproject.antenna.action.method;

import com.github.iotexproject.antenna.action.Envelop;
import com.github.iotexproject.antenna.protocol.SetVoterRewardOptInRequest;
import com.github.iotexproject.antenna.rpc.RPCMethod;
import com.github.iotexproject.grpc.types.Action;
import com.github.iotexproject.grpc.types.SetVoterRewardOptIn;

/**
 * SetVoterRewardOptIn method.
 *
 * <p>Opts the sending delegate into IIP-59 protocol-native voter reward
 * distribution. The message is empty by design -- the sender is the delegate --
 * so it must be set on the envelope explicitly rather than left to a
 * "non-empty payload" check, which would drop it.
 */
public class SetVoterRewardOptInMethod extends AbstractMethod {
    private final Envelop envelop;

    public SetVoterRewardOptInMethod(RPCMethod client, SetVoterRewardOptInRequest request) {
        super(client, request.getAccount());
        this.envelop = baseEnvelop(request);
    }

    @Override
    public String execute() {
        envelop.setSetVoterRewardOptIn(SetVoterRewardOptIn.newBuilder().build());
        return sendAction(envelop);
    }

    public Action signedAction() {
        envelop.setSetVoterRewardOptIn(SetVoterRewardOptIn.newBuilder().build());
        return signAction(envelop).action();
    }
}
