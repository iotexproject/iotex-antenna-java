package com.github.iotexproject.antenna.action.method;

import com.github.iotexproject.antenna.action.Envelop;
import com.github.iotexproject.antenna.crypto.Bech32;
import com.github.iotexproject.antenna.protocol.SetVoterRewardDestinationRequest;
import com.github.iotexproject.antenna.rpc.RPCMethod;
import com.github.iotexproject.grpc.types.Action;
import com.github.iotexproject.grpc.types.SetVoterRewardDestination;
import com.google.protobuf.ByteString;

/**
 * SetVoterRewardDestination method.
 *
 * <p>The protocol reads the recipient with address.FromBytes, so the io1...
 * string is decoded to its 20 raw bytes here. Sending the bech32 text instead
 * produces an action that signs and is then rejected on decode.
 */
public class SetVoterRewardDestinationMethod extends AbstractMethod {
    private final SetVoterRewardDestinationRequest request;
    private final Envelop envelop;

    public SetVoterRewardDestinationMethod(RPCMethod client, SetVoterRewardDestinationRequest request) {
        super(client, request.getAccount());
        this.request = request;
        this.envelop = baseEnvelop(request);
    }

    private SetVoterRewardDestination payload() {
        byte[] dec = Bech32.decode(request.getRecipient()).data;
        byte[] raw = Bech32.convertBits(dec, 0, dec.length, 5, 8, false);
        return SetVoterRewardDestination.newBuilder()
                .setRecipient(ByteString.copyFrom(raw))
                .build();
    }

    @Override
    public String execute() {
        envelop.setSetVoterRewardDestination(payload());
        return sendAction(envelop);
    }

    public Action signedAction() {
        envelop.setSetVoterRewardDestination(payload());
        return signAction(envelop).action();
    }
}
