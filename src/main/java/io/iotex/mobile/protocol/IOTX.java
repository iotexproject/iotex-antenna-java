package io.iotex.mobile.protocol;

import io.iotex.mobile.action.method.ExecutionMethod;
import io.iotex.mobile.action.method.TransferMethod;
import io.iotex.mobile.rpc.RPCMethod;

/**
 * iotex encapsulate.
 *
 * @author Yang XuePing
 */
public class IOTX {
    private RPCMethod provider;

    public IOTX(String provider) {
        this.provider = new RPCMethod(provider);
    }

    public RPCMethod currentProvider() {
        return this.provider;
    }

    public void setProvider(String provider) {
        if (this.provider != null) {
            this.provider.close();
        }
        this.provider = new RPCMethod(provider);
    }

    public String sendTransfer(TransferRequest request) {
        return new TransferMethod(provider, request).execute();
    }

    public String executeContract(ExecutionRequest request) {
        return new ExecutionMethod(provider, request).execute();
    }
}
