package io.iotex.mobile.action.method;

import com.google.protobuf.ByteString;
import io.iotex.grpc.types.Transfer;
import io.iotex.mobile.action.Envelop;
import io.iotex.mobile.protocol.TransferRequest;
import io.iotex.mobile.rpc.RPCMethod;
import io.iotex.mobile.utils.Numeric;

/**
 * transfer method.
 *
 * @author Yang XuePing
 */
public class TransferMethod extends AbstractMethod {
    private TransferRequest request;
    private Envelop envelop;

    public TransferMethod(RPCMethod client, TransferRequest request) {
        super(client);
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
