package com.github.iotexproject.antenna.action.method;

import com.github.iotexproject.antenna.account.Account;
import com.github.iotexproject.antenna.action.Envelop;
import com.github.iotexproject.antenna.action.SealedEnvelop;
import com.github.iotexproject.antenna.protocol.ActionRequest;
import com.github.iotexproject.antenna.rpc.RPCMethod;
import com.github.iotexproject.antenna.utils.Numeric;
import com.github.iotexproject.grpc.api.*;

import java.math.BigInteger;

/**
 * abstract method.
 *
 * @author Yang XuePing
 */
public abstract class AbstractMethod {
    protected RPCMethod client;
    protected Account account;

    public AbstractMethod(RPCMethod client, Account account) {
        this.client = client;
        this.account = account;
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
        return Envelop.builder().version(1).nonce(request.getNonce()).gasLimit(request.getGasLimit()).gasPrice(request.getGasPrice()).chainID(request.getChainID()).build();
    }

    protected String sendAction(Envelop envelop) {
        SendActionResponse response = this.client.sendAction(SendActionRequest.newBuilder().setAction(signAction(envelop).action()).build());
        return response.getActionHash();
    }

    protected SealedEnvelop signAction(Envelop envelop) {
        BigInteger privateKey = Numeric.toBigInt(this.account.privateKey());
        BigInteger publicKey = Numeric.toBigInt(this.account.publicKey());
        if (envelop.getGasLimit() == 0) {
            EstimateActionGasConsumptionRequest.Builder builder = EstimateActionGasConsumptionRequest.newBuilder();
            if (envelop.getTransfer() != null) {
                builder.setTransfer(envelop.getTransfer());
            }
            if (envelop.getExecution() != null) {
                builder.setExecution(envelop.getExecution());
            }
            builder.setCallerAddress(this.account.address());

            EstimateActionGasConsumptionResponse response = this.client.estimateActionGasConsumption(builder.build());
            envelop.setGasLimit(response.getGas());
        }
        return SealedEnvelop.sign(privateKey, publicKey, envelop);
    }
}
