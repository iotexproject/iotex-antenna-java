package com.github.iotexproject.antenna.contract;

import com.github.iotexproject.antenna.protocol.ExecutionRequest;
import com.github.iotexproject.antenna.solidity.Abi;
import com.google.protobuf.ByteString;
import com.github.iotexproject.grpc.api.ReadContractRequest;
import com.github.iotexproject.grpc.types.Execution;
import com.github.iotexproject.antenna.account.Account;
import com.github.iotexproject.antenna.action.method.ExecutionMethod;
import com.github.iotexproject.antenna.rpc.RPCMethod;
import com.github.iotexproject.antenna.utils.Numeric;
import lombok.Data;

import java.util.List;

/**
 * smart contract.
 *
 * @author Yang XuePing
 */
@Data
public class Contract {
    private RPCMethod provider;

    private String address;
    private String abiJson;
    private byte[] bin;

    private Abi abi;

    public Contract(RPCMethod provider, String abi) {
        this(provider, "", abi, null);
    }

    public Contract(RPCMethod provider, String address, String abi) {
        this(provider, address, abi, null);
    }

    public Contract(RPCMethod provider, String abi, byte[] bin) {
        this.provider = provider;
        this.address = "";
        this.abiJson = abi;
        this.bin = bin;
        this.abi = Abi.fromJson(abi);
    }

    public Contract(RPCMethod provider, String address, String abi, byte[] bin) {
        this.provider = provider;
        this.address = address;
        this.abiJson = abi;
        this.bin = bin;
        this.abi = Abi.fromJson(abi);
    }

    public void setProvider(RPCMethod provider) {
        this.provider = provider;
    }

    public RPCMethod currentProvider() {
        return this.provider;
    }

    /**
     * deploy contract.
     *
     * @param nonce    nonce, optional
     * @param gasLimit gasLimit, optional
     * @param gasPrice gasPrice, optional
     * @param account  account
     * @param args     constructor params
     * @return
     */
    public String deploy(Long nonce, Long gasLimit, String gasPrice, Account account, String amount, Object... args) {
        if (this.bin == null) {
            throw new RuntimeException("deploy contract must set bin");
        }
        byte[] data = this.bin;
        Abi.Constructor constructor = this.abi.findConstructor();
        if (constructor != null && args != null && args.length > 0) {
            data = Numeric.merge(data, constructor.encode(args));
        }
        ExecutionRequest request = new ExecutionRequest();
        request.setNonce(nonce);
        request.setGasLimit(gasLimit);
        request.setGasPrice(gasPrice);
        request.setAccount(account);
        request.setContract("");
        request.setAmount(amount);
        request.setData(data);
        return new ExecutionMethod(provider, request).execute();
    }

    /**
     * execute contract.
     *
     * @param nonce    nonce, optional
     * @param gasLimit gasLimit, optional
     * @param gasPrice gasPrice, optional
     * @param account  account
     * @param method   contract method name
     * @param method   execute amount
     * @param args     contract method params
     * @return
     */
    public String execute(Long nonce, Long gasLimit, String gasPrice, Account account, String method, String amount, Object... args) {
        Abi.Function function = this.abi.findFunction(method);
        if (function == null) {
            throw new RuntimeException("contract method " + method + " not exists.");
        }
        ExecutionRequest request = new ExecutionRequest();
        request.setNonce(nonce);
        request.setGasLimit(gasLimit);
        request.setGasPrice(gasPrice);
        request.setAccount(account);
        request.setContract(address);
        request.setAmount(amount);
        request.setData(function.encode(args));
        return new ExecutionMethod(provider, request).execute();
    }

    /**
     * read contract.
     *
     * @param callerAddress caller address
     * @param method        contract method
     * @param args          contract method params
     * @return
     */
    public List<?> read(String callerAddress, String method, Object... args) {
        Abi.Function function = this.abi.findFunction(method);
        if (function == null) {
            throw new RuntimeException("contract method " + method + " not exists.");
        }

        String result = provider.readContract(
                ReadContractRequest.newBuilder()
                        .setExecution(
                                Execution.newBuilder()
                                        .setContract(address)
                                        .setAmount("0")
                                        .setData(ByteString.copyFrom(function.encode(args)))
                                        .build())
                        .setCallerAddress(callerAddress)
                        .build()
        ).getData();
        return function.decodeResult(Numeric.hexStringToByteArray(result));
    }

    public Abi.Function getFunctionBySignature(String signature) {
        for (Abi.Entry entry : this.abi) {
            if (signature.equals(Numeric.toHexString(entry.encodeSignature()))) {
                return (Abi.Function) entry;
            }
        }
        return null;
    }
}
