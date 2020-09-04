package com.github.iotexproject.antenna.action;

import com.github.iotexproject.antenna.action.method.AbstractMethod;
import com.github.iotexproject.antenna.protocol.TransferRequest;
import com.github.iotexproject.antenna.rpc.RPCMethod;
import com.github.iotexproject.antenna.utils.Numeric;
import com.github.iotexproject.grpc.types.Transfer;
import com.google.protobuf.ByteString;

public class OfflineTransferMethod extends AbstractMethod {
    private final TransferRequest request;
    private final Envelop envelop;

    public OfflineTransferMethod(RPCMethod client, TransferRequest request) {
        super(client, request.getAccount());
        this.request = request;
        envelop = baseEnvelop(request);
    }

    @Override
    public String execute() {
        throw new UnsupportedOperationException();
    }

    public SealedEnvelop sealedEnvelop() {
        this.envelop.setTransfer(Transfer.newBuilder()
                .setRecipient(request.getRecipient())
                .setAmount(request.getAmount())
                .setPayload(ByteString.copyFrom(Numeric.hexStringToByteArray(request.getPayload())))
                .build());
        return SealedEnvelop.empty(this.envelop);
    }
}
