package com.github.iotexproject.antenna.protocol;

import com.github.iotexproject.antenna.action.method.ExecutionMethod;
import com.github.iotexproject.antenna.action.method.StakeCreateMethod;
import com.github.iotexproject.antenna.action.method.TransferMethod;
import com.github.iotexproject.antenna.rpc.RPCMethod;

/**
 * iotex encapsulate.
 *
 * @author Yang XuePing
 */
public class IOTX {
    private RPCMethod provider;

    public IOTX(String provider) {
        this(provider, false);
    }

    public IOTX(String provider, boolean secure) {
        this.provider = new RPCMethod(provider, secure);
    }

    public RPCMethod currentProvider() {
        return this.provider;
    }

    public void setProvider(String provider) {
        setProvider(provider, false);
    }

    public void setProvider(String provider, boolean secure) {
        if (this.provider != null) {
            this.provider.setProvider(provider, secure);
        }
    }

    public String sendTransfer(TransferRequest request) {
        return new TransferMethod(provider, request).execute();
    }

    public String executeContract(ExecutionRequest request) {
        return new ExecutionMethod(provider, request).execute();
    }

    public String stakeCreate(StakeCreateRequest request) {
        return new StakeCreateMethod(provider, request).execute();
    }
}
