package com.github.iotexproject.antenna.action.method;

import com.github.iotexproject.antenna.account.Account;
import com.github.iotexproject.antenna.action.Envelop;
import com.github.iotexproject.antenna.action.SealedEnvelop;
import com.github.iotexproject.antenna.protocol.ActionRequest;
import com.github.iotexproject.antenna.rpc.RPCMethod;
import com.github.iotexproject.antenna.utils.Numeric;
import com.github.iotexproject.grpc.api.*;
import com.github.iotexproject.grpc.types.CandidateBasicInfo;
import com.google.protobuf.ByteString;

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
        return Envelop.builder().version(1).nonce(request.getNonce()).gasLimit(request.getGasLimit()).gasPrice(request.getGasPrice()).chainID(client.getChainID()).build();
    }

    /**
     * Builds the CandidateBasicInfo shared by candidateRegister and
     * candidateUpdate.
     *
     * It lives here because each of those actions built the message twice --
     * once in execute() and once in signedAction() -- from two copies of the
     * same code. A field added to one copy and not the other produces an action
     * that is correct when sent and wrong when signed offline, or the reverse,
     * and nothing in either path notices.
     *
     * A null or empty BLS field is left unset rather than set to empty bytes,
     * so an update that does not mention a key leaves an already registered one
     * alone -- which is what the protocol's optional-key branch expects.
     */
    protected static CandidateBasicInfo candidateBasicInfo(
            String name, String operatorAddress, String rewardAddress, String blsPubKey, String blsPop) {
        byte[] pubKey = hexToBytes(blsPubKey);
        byte[] pop = hexToBytes(blsPop);
        // Unconditionally invalid, in every fork era: the chain rejects it at
        // validation, before a receipt exists, so the sender gets a bare RPC
        // error with no action hash to look up. Saying so here is cheaper.
        if (pubKey.length == 0 && pop.length > 0) {
            throw new IllegalArgumentException("blsPop requires blsPubKey");
        }
        CandidateBasicInfo.Builder builder = CandidateBasicInfo.newBuilder()
                .setName(name)
                .setOperatorAddress(operatorAddress)
                .setRewardAddress(rewardAddress);
        if (pubKey.length > 0) {
            builder.setBlsPubKey(ByteString.copyFrom(pubKey));
        }
        if (pop.length > 0) {
            builder.setBlsPop(ByteString.copyFrom(pop));
        }
        return builder.build();
    }

    /**
     * Decodes hex that may carry a 0x prefix.
     *
     * Numeric.hexStringToByteArray does not strip one: it reads '0' and 'x' as
     * a byte, and Character.digit('x', 16) is -1, so the result is silently
     * corrupt and the same length a caller would expect. BLS keys are quoted
     * with the prefix nearly everywhere they are produced, so the two paths
     * that take one go through this instead.
     */
    private static byte[] hexToBytes(String hex) {
        if (hex == null) {
            return new byte[]{};
        }
        String trimmed = hex.trim();
        if (trimmed.startsWith("0x") || trimmed.startsWith("0X")) {
            trimmed = trimmed.substring(2);
        }
        return Numeric.hexStringToByteArray(trimmed);
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
