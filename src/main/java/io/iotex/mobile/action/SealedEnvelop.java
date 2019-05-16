package io.iotex.mobile.action;

import io.iotex.mobile.crypto.Hash;
import io.iotex.mobile.crypto.SignatureData;
import io.iotex.mobile.crypto.Signer;
import lombok.Getter;

import java.math.BigInteger;

/**
 * Sealed Envelop.
 *
 * @author Yang XuePing
 */
@Getter
public class SealedEnvelop {
    private Envelop act;
    private byte[] senderPubKey;
    private byte[] signature;

    private SealedEnvelop() {
    }

    /**
     * sign Envelop to SealedEnvelop.
     *
     * @param privateKey
     * @param publicKey
     * @param envelop
     * @return
     */
    public static SealedEnvelop sign(BigInteger privateKey, BigInteger publicKey, Envelop envelop) {
        SignatureData signatureData = Signer.sign(privateKey, publicKey, 0, 0, Hash.sha3(envelop.bytestream()));

        SealedEnvelop sealedEnvelop = new SealedEnvelop();
        sealedEnvelop.act = envelop;
        sealedEnvelop.senderPubKey = publicKey.toByteArray();
        byte[] signature = new byte[65];
        System.arraycopy(signatureData.getR(), 0, signature, 0, 32);
        System.arraycopy(signatureData.getS(), 0, signature, 32, 32);
        signature[64] = signatureData.getV();
        sealedEnvelop.signature = signature;

        return sealedEnvelop;
    }
}
