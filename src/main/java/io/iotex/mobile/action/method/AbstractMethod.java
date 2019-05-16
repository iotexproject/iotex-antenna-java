package io.iotex.mobile.action.method;

import io.iotex.grpc.api.GetAccountRequest;
import io.iotex.grpc.api.GetAccountResponse;
import io.iotex.grpc.api.SuggestGasPriceRequest;
import io.iotex.grpc.api.SuggestGasPriceResponse;
import io.iotex.mobile.action.Envelop;
import io.iotex.mobile.protocol.ActionRequest;
import io.iotex.mobile.rpc.RPCMethod;

/**
 * abstract method.
 *
 * @author Yang XuePing
 */
public abstract class AbstractMethod {
    protected RPCMethod client;

    public AbstractMethod(RPCMethod client) {
        this.client = client;
    }

    public abstract String execute();

    protected Envelop baseEnvelop(ActionRequest request) {
        if (request.getNonce() == null) {
            GetAccountResponse response = client.getAccount(GetAccountRequest.newBuilder().setAddress(request.getAccount().address()).build());
            request.setNonce(response.getAccountMeta().getPendingNonce());
        }
        if (request.getGasPrice() == null) {
            SuggestGasPriceResponse response = client.suggestGasPrice(SuggestGasPriceRequest.newBuilder().build());
            request.setGasPrice(String.valueOf(response.getGasPrice()));
        }
        if (request.getGasLimit() == null) {
            request.setGasLimit(0l);
        }
        return Envelop.builder().version(1).nonce(request.getNonce()).gasLimit(request.getGasLimit()).gasPrice(request.getGasPrice()).build();
    }

    protected String sendAction(Envelop envelop) {
        return null;
    }
}
