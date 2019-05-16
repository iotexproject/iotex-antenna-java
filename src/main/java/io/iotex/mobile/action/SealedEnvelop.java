package io.iotex.mobile.action;

import io.iotex.mobile.crypto.Hash;
import io.iotex.mobile.crypto.SignatureData;
import io.iotex.mobile.crypto.Signer;

import java.math.BigInteger;

/**
 * Sealed Envelop.
 *
 * @author Yang XuePing
 */
public class SealedEnvelop {
    public Envelop act;
    public byte[] senderPubKey;
    public byte[] signature;

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
