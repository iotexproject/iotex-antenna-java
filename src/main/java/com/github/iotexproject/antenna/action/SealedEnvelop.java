package com.github.iotexproject.antenna.action;

import com.github.iotexproject.antenna.crypto.Hash;
import com.github.iotexproject.antenna.crypto.SignatureData;
import com.github.iotexproject.antenna.crypto.Signer;
import com.github.iotexproject.antenna.utils.Numeric;
import com.github.iotexproject.grpc.types.Action;
import com.github.iotexproject.grpc.types.ActionCore;
import com.github.iotexproject.grpc.types.TxContainer;
import com.google.protobuf.ByteString;
import lombok.Data;

import java.math.BigInteger;

/**
 * Sealed Envelop.
 *
 * @author Yang XuePing
 */
@Data
public class SealedEnvelop {
    private Envelop act;
    private byte[] senderPubKey;
    private byte[] signature;

    // Non-null for typed-tx (types 1-4) signed via the TX_CONTAINER path.
    private byte[] rawEthTx;
    private Integer encoding; // 128 = TX_CONTAINER

    private SealedEnvelop() {
    }

    /**
     * sign Envelop to SealedEnvelop.
     */
    public static SealedEnvelop sign(BigInteger privateKey, BigInteger publicKey, Envelop envelop) {
        SealedEnvelop sealedEnvelop = new SealedEnvelop();
        sealedEnvelop.act = envelop;
        sealedEnvelop.senderPubKey = publicKey.toByteArray();

        int txType = envelop.getTxType() == null ? 0 : envelop.getTxType();
        if (txType != 0) {
            // Ethereum RLP (TX_CONTAINER) path for types 1-4
            EthTypedTxSigner.SignResult result = EthTypedTxSigner.sign(envelop, privateKey);
            sealedEnvelop.rawEthTx = result.rawEthTx;
            sealedEnvelop.signature = result.iotexSig;
            sealedEnvelop.encoding = EthTypedTxSigner.TX_CONTAINER_ENCODING;
        } else {
            // Legacy IoTeX protobuf path
            SignatureData signatureData = Signer.sign(privateKey, publicKey, 0, 0, Hash.sha3(envelop.byteStream()));
            byte[] signature = new byte[65];
            System.arraycopy(signatureData.getR(), 0, signature, 0, 32);
            System.arraycopy(signatureData.getS(), 0, signature, 32, 32);
            signature[64] = signatureData.getV();
            sealedEnvelop.signature = signature;
        }

        return sealedEnvelop;
    }

    /**
     * construct empty SealedEnvelop.
     */
    public static SealedEnvelop empty(Envelop envelop) {
        SealedEnvelop sealedEnvelop = new SealedEnvelop();
        sealedEnvelop.act = envelop;
        sealedEnvelop.senderPubKey = new byte[0];
        sealedEnvelop.signature = new byte[0];
        return sealedEnvelop;
    }

    public Action action() {
        ActionCore core = act.core();
        if (rawEthTx != null) {
            // For TX_CONTAINER, replace the oneof action field with TxContainer.
            // setTxContainer() clears any existing transfer/execution (oneof semantics).
            core = core.toBuilder()
                    .setTxContainer(TxContainer.newBuilder()
                            .setRaw(ByteString.copyFrom(rawEthTx))
                            .build())
                    .build();
        }
        Action.Builder ab = Action.newBuilder()
                .setCore(core)
                .setSenderPubKey(ByteString.copyFrom(senderPubKey))
                .setSignature(ByteString.copyFrom(signature));
        if (encoding != null) {
            ab.setEncodingValue(encoding);
        }
        return ab.build();
    }

    public byte[] byteStream() {
        return action().toByteArray();
    }

    public String hash() {
        return Numeric.toHexString(Hash.sha3(byteStream()));
    }
}
