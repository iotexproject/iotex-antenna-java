package com.github.iotexproject.antenna.action;

import com.github.iotexproject.antenna.account.Account;
import com.github.iotexproject.antenna.account.IotexAccount;
import com.github.iotexproject.antenna.crypto.Hash;
import com.github.iotexproject.antenna.crypto.SignatureData;
import com.github.iotexproject.antenna.crypto.Signer;
import com.github.iotexproject.antenna.protocol.TransferRequest;
import com.github.iotexproject.antenna.rpc.RPCMethod;
import com.github.iotexproject.antenna.utils.Numeric;
import com.github.iotexproject.grpc.api.GetReceiptByActionRequest;
import com.github.iotexproject.grpc.api.GetReceiptByActionResponse;
import com.github.iotexproject.grpc.api.SendActionRequest;
import com.github.iotexproject.grpc.api.SendActionResponse;
import com.github.iotexproject.grpc.types.Action;

public class OfflineTransferDemo {
    public static void main(String... args) {
        final String IOTEX_CORE = "api.testnet.iotex.one:80";
        RPCMethod rpcMethod = new RPCMethod(IOTEX_CORE, 2);

        // 构造转账交易
        TransferRequest request = new TransferRequest();
        request.setNonce(101l);
        request.setGasLimit(10000l);
        request.setGasPrice("1000000000000");
        request.setAmount("1000000000000000000");
        request.setRecipient("io13zt8sznez2pf0q0hqdz2hyl938wak2fsjgdeml");
        OfflineTransferMethod method = new OfflineTransferMethod(null, request);
        SealedEnvelop envelop = method.sealedEnvelop();

        // sign
        byte[] signMessage = Hash.sha3(envelop.getAct().byteStream());
        Account account = IotexAccount.create("SET_YOUR_PRIVATE_KEY");
        SignatureData signatureData = Signer.sign(Numeric.toBigInt(account.privateKey()), Numeric.toBigInt(account.publicKey()),
                0, 0, signMessage);
        byte[] signature = new byte[65];
        System.arraycopy(signatureData.getR(), 0, signature, 0, 32);
        System.arraycopy(signatureData.getS(), 0, signature, 32, 32);
        signature[64] = signatureData.getV();

        // send action
        envelop.setSenderPubKey(account.publicKey());
        envelop.setSignature(signature);
        String hash = envelop.hash();
        Action action = envelop.action();

        SendActionResponse response = rpcMethod.sendAction(SendActionRequest.newBuilder().setAction(action).build());
        System.out.println(response.getActionHash());
    }
}
