package com.github.iotexproject.antenna.protocol;

import com.github.iotexproject.antenna.action.method.ExecutionMethod;
import com.github.iotexproject.antenna.action.method.StakeCreateMethod;
import com.github.iotexproject.antenna.action.method.TransferMethod;
import com.github.iotexproject.antenna.rpc.RPCMethod;
import com.sun.org.apache.xpath.internal.operations.Bool;

/**
 * iotex encapsulate.
 *
 * @author Yang XuePing
 */
public class IOTX {
    private RPCMethod provider;

    public IOTX(String provider, Integer chainID) {
        this(provider, false, chainID);
    }

    public IOTX(String provider, Boolean secure, Integer chainID) {
        this.provider = new RPCMethod(provider, secure, chainID);
    }

    public RPCMethod currentProvider() {
        return this.provider;
    }

    public void setProvider(String provider, Integer chainID) {
        setProvider(provider, false, chainID);
    }

    public void setProvider(String provider, boolean secure, Integer chainID) {
        if (this.provider != null) {
            this.provider.setProvider(provider, secure, chainID);
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
