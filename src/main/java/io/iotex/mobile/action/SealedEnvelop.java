package io.iotex.mobile.action;

import com.google.protobuf.ByteString;
import io.iotex.grpc.types.Action;
import io.iotex.grpc.types.ActionCore;
import io.iotex.mobile.crypto.Hash;
import io.iotex.mobile.crypto.SignatureData;
import io.iotex.mobile.crypto.Signer;
import io.iotex.mobile.utils.Numeric;
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
        SignatureData signatureData = Signer.sign(privateKey, publicKey, 0, 0, Hash.sha3(envelop.byteStream()));

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

    public Action action() {
        ActionCore.Builder builder = ActionCore.newBuilder()
                .setVersion(act.getVersion()).setNonce(act.getNonce()).setGasLimit(act.getGasLimit()).setGasPrice(act.getGasPrice());
        if (act.getTransfer() != null) {
            builder.setTransfer(act.getTransfer());
        }
        if (act.getExecution() != null) {
            builder.setExecution(act.getExecution());
        }
        if (act.getStartSubChain() != null) {
            builder.setStartSubChain(act.getStartSubChain());
        }
        if (act.getStopSubChain() != null) {
            builder.setStopSubChain(act.getStopSubChain());
        }
        if (act.getPutBlock() != null) {
            builder.setPutBlock(act.getPutBlock());
        }
        if (act.getCreateDeposit() != null) {
            builder.setCreateDeposit(act.getCreateDeposit());
        }
        if (act.getSettleDeposit() != null) {
            builder.setSettleDeposit(act.getSettleDeposit());
        }
        if (act.getCreatePlumChain() != null) {
            builder.setCreatePlumChain(act.getCreatePlumChain());
        }
        if (act.getTerminatePlumChain() != null) {
            builder.setTerminatePlumChain(act.getTerminatePlumChain());
        }
        if (act.getPlumPutBlock() != null) {
            builder.setPlumPutBlock(act.getPlumPutBlock());
        }
        if (act.getPlumCreateDeposit() != null) {
            builder.setPlumCreateDeposit(act.getPlumCreateDeposit());
        }
        if (act.getPlumStartExit() != null) {
            builder.setPlumStartExit(act.getPlumStartExit());
        }
        if (act.getPlumChallengeExit() != null) {
            builder.setPlumChallengeExit(act.getPlumChallengeExit());
        }
        if (act.getPlumResponseChallengeExit() != null) {
            builder.setPlumResponseChallengeExit(act.getPlumResponseChallengeExit());
        }
        if (act.getPlumFinalizeExit() != null) {
            builder.setPlumFinalizeExit(act.getPlumFinalizeExit());
        }
        if (act.getPlumSettleDeposit() != null) {
            builder.setPlumSettleDeposit(act.getPlumSettleDeposit());
        }
        if (act.getPlumTransfer() != null) {
            builder.setPlumTransfer(act.getPlumTransfer());
        }
        if (act.getDepositToRewardingFund() != null) {
            builder.setDepositToRewardingFund(act.getDepositToRewardingFund());
        }
        if (act.getClaimFromRewardingFund() != null) {
            builder.setClaimFromRewardingFund(act.getClaimFromRewardingFund());
        }
        if (act.getGrantReward() != null) {
            builder.setGrantReward(act.getGrantReward());
        }
        if (act.getPutPollResult() != null) {
            builder.setPutPollResult(act.getPutPollResult());
        }
        return Action.newBuilder()
                .setCore(builder.build())
                .setSenderPubKey(ByteString.copyFrom(senderPubKey))
                .setSignature(ByteString.copyFrom(signature))
                .build();
    }

    public byte[] byteStream() {
        return action().toByteArray();
    }

    public String hash() {
        return Numeric.toHexString(Hash.sha3(byteStream()));
    }
}
