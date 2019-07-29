package com.github.iotexproject.mobile.token;

import com.github.iotexproject.mobile.contract.Contract;
import com.github.iotexproject.mobile.rpc.RPCMethod;
import com.github.iotexproject.mobile.solidity.Abi;
import com.github.iotexproject.mobile.utils.Numeric;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * token contract.
 *
 * @author Yang XuePing
 */
public class Token {
    protected Contract contract;

    public Token(RPCMethod provider, String contractAddress, String abi) {
        this.contract = new Contract(provider, contractAddress, abi);
    }

    public DecodedMethod decodeMethod(String data) {
        Abi.Function method = this.contract.getFunctionBySignature(data.substring(0, 8));
        if (method == null) {
            return null;
        }

        Map<String, Object> dataMap = new HashMap<>();
        List inputsData = method.decode(Numeric.hexStringToByteArray(data));

        for (int i = 0; i < method.inputs.size(); i++) {
            dataMap.put(method.inputs.get(i).name, inputsData.get(i));
        }
        return new DecodedMethod(method.name, dataMap);
    }
}
