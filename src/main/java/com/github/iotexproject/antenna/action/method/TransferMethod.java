package com.github.iotexproject.antenna.action.method;

import com.github.iotexproject.antenna.protocol.TransferRequest;
import com.google.protobuf.ByteString;
import com.github.iotexproject.grpc.types.Transfer;
import com.github.iotexproject.antenna.action.Envelop;
import com.github.iotexproject.antenna.rpc.RPCMethod;
import com.github.iotexproject.antenna.utils.Numeric;

/**
 * transfer method.
 *
 * @author Yang XuePing
 */
public class TransferMethod extends AbstractMethod {
    private TransferRequest request;
    private Envelop envelop;

    public TransferMethod(RPCMethod client, TransferRequest request) {
        super(client, request.getAccount());
        this.request = request;
        envelop = baseEnvelop(request);
    }

    @Override
    public String execute() {
        envelop.setTransfer(Transfer.newBuilder()
                .setRecipient(request.getRecipient())
                .setAmount(request.getAmount())
                .setPayload(ByteString.copyFrom(Numeric.hexStringToByteArray(request.getPayload())))
                .build());
        return sendAction(envelop);
    }
}
