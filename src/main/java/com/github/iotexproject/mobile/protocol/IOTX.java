package com.github.iotexproject.mobile.protocol;

import com.github.iotexproject.mobile.action.method.ExecutionMethod;
import com.github.iotexproject.mobile.action.method.TransferMethod;
import com.github.iotexproject.mobile.rpc.RPCMethod;

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
            this.provider.setProvider(provider);
        }
    }

    public String sendTransfer(TransferRequest request) {
        return new TransferMethod(provider, request).execute();
    }

    public String executeContract(ExecutionRequest request) {
        return new ExecutionMethod(provider, request).execute();
    }
}
