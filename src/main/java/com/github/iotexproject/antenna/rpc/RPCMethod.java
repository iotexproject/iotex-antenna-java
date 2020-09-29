package com.github.iotexproject.antenna.rpc;

import com.github.iotexproject.grpc.api.*;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

/**
 * rpc method.
 *
 * @author Yang XuePing
 */
public class RPCMethod {
    private ManagedChannel channel;
    private APIServiceGrpc.APIServiceBlockingStub stub;

    public RPCMethod(String hostname) {
        this(hostname, false);
    }

    public RPCMethod(String hostname, boolean secure) {
        if (secure) {
            channel = ManagedChannelBuilder.forTarget(hostname).useTransportSecurity().build();
        } else {
            channel = ManagedChannelBuilder.forTarget(hostname).usePlaintext().build();
        }
        stub = APIServiceGrpc.newBlockingStub(channel);
    }

    public void setProvider(String hostname) {
        setProvider(hostname, false);
    }

    public void setProvider(String hostname, boolean secure) {
        if (channel != null) {
            channel.shutdown();
        }
        if (secure) {
            channel = ManagedChannelBuilder.forTarget(hostname).useTransportSecurity().build();
        } else {
            channel = ManagedChannelBuilder.forTarget(hostname).usePlaintext().build();
        }
        stub = APIServiceGrpc.newBlockingStub(channel);
    }

    public void close() {
        if (channel != null) {
            channel.shutdown();
        }
    }

    public GetAccountResponse getAccount(GetAccountRequest request) {
        return stub.getAccount(request);
    }

    public GetActionsResponse getActions(GetActionsRequest request) {
        return stub.getActions(request);
    }

    public GetBlockMetasResponse getBlockMetas(GetBlockMetasRequest request) {
        return stub.getBlockMetas(request);
    }

    public GetChainMetaResponse getChainMeta(GetChainMetaRequest request) {
        return stub.getChainMeta(request);
    }

    public GetServerMetaResponse getServerMeta(GetServerMetaRequest request) {
        return stub.getServerMeta(request);
    }

    public SendActionResponse sendAction(SendActionRequest request) {
        return stub.sendAction(request);
    }

    public GetReceiptByActionResponse getReceiptByAction(GetReceiptByActionRequest request) {
        return stub.getReceiptByAction(request);
    }

    public ReadContractResponse readContract(ReadContractRequest request) {
        return stub.readContract(request);
    }

    public SuggestGasPriceResponse suggestGasPrice(SuggestGasPriceRequest request) {
        return stub.suggestGasPrice(request);
    }

    public EstimateGasForActionResponse estimateGasForAction(EstimateGasForActionRequest request) {
        return stub.estimateGasForAction(request);
    }

    public ReadStateResponse readState(ReadStateRequest request) {
        return stub.readState(request);
    }

    public GetEpochMetaResponse getEpochMeta(GetEpochMetaRequest request) {
        return stub.getEpochMeta(request);
    }

    public EstimateActionGasConsumptionResponse estimateActionGasConsumption(EstimateActionGasConsumptionRequest request) {
        return stub.estimateActionGasConsumption(request);
    }

    public GetEvmTransfersByBlockHeightResponse getEvmTransfersByBlockHeight(GetEvmTransfersByBlockHeightRequest request) {
        return stub.getEvmTransfersByBlockHeight(request);
    }

    public GetEvmTransfersByActionHashResponse getEvmTransfersByActionHash(GetEvmTransfersByActionHashRequest request) {
        return stub.getEvmTransfersByActionHash(request);
    }

    public GetTransactionLogByActionHashResponse getTransactionLogByActionHash(GetTransactionLogByActionHashRequest request) {
        return stub.getTransactionLogByActionHash(request);
    }

    public GetTransactionLogByBlockHeightResponse getTransactionLogByBlockHeight(GetTransactionLogByBlockHeightRequest request) {
        return stub.getTransactionLogByBlockHeight(request);
    }
}
