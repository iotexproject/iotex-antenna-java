package com.github.iotexproject.mobile.action;

import com.github.iotexproject.grpc.types.*;
import com.google.protobuf.InvalidProtocolBufferException;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * action envelop.
 *
 * @author Yang XuePing
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Envelop {
    private Integer version;
    private Long nonce;
    private Long gasLimit;
    private String gasPrice;

    // optional fields
    private Transfer transfer;
    private Execution execution;
    private StartSubChain startSubChain;
    private StopSubChain stopSubChain;
    private PutBlock putBlock;
    private CreateDeposit createDeposit;
    private SettleDeposit settleDeposit;
    private CreatePlumChain createPlumChain;
    private TerminatePlumChain terminatePlumChain;
    private PlumPutBlock plumPutBlock;
    private PlumCreateDeposit plumCreateDeposit;
    private PlumStartExit plumStartExit;
    private PlumChallengeExit plumChallengeExit;
    private PlumResponseChallengeExit plumResponseChallengeExit;
    private PlumFinalizeExit plumFinalizeExit;
    private PlumSettleDeposit plumSettleDeposit;
    private PlumTransfer plumTransfer;
    private DepositToRewardingFund depositToRewardingFund;
    private ClaimFromRewardingFund claimFromRewardingFund;
    private GrantReward grantReward;
    private PutPollResult putPollResult;

    public static Envelop deserialize(byte[] bytes) throws IllegalArgumentException {
        try {
            ActionCore core = ActionCore.parseFrom(bytes);
            Envelop envelop = new Envelop();
            envelop.setVersion(core.getVersion());
            envelop.setNonce(core.getNonce());
            envelop.setGasLimit(core.getGasLimit());
            envelop.setGasPrice(core.getGasPrice());

            envelop.setTransfer(core.getTransfer());
            envelop.setExecution(core.getExecution());
            envelop.setClaimFromRewardingFund(core.getClaimFromRewardingFund());

            return envelop;
        } catch (InvalidProtocolBufferException e) {
            throw new IllegalArgumentException("deserialize envelop error", e);
        }
    }

    public ActionCore core() {
        ActionCore.Builder builder = ActionCore.newBuilder().setVersion(version).setNonce(nonce).setGasLimit(gasLimit).setGasPrice(gasPrice);
        if (transfer != null) {
            builder.setTransfer(transfer);
        }
        if (execution != null) {
            builder.setExecution(execution);
        }
        if (startSubChain != null) {
            builder.setStartSubChain(startSubChain);
        }
        if (stopSubChain != null) {
            builder.setStopSubChain(stopSubChain);
        }
        if (putBlock != null) {
            builder.setPutBlock(putBlock);
        }
        if (createDeposit != null) {
            builder.setCreateDeposit(createDeposit);
        }
        if (settleDeposit != null) {
            builder.setSettleDeposit(settleDeposit);
        }
        if (createPlumChain != null) {
            builder.setCreatePlumChain(createPlumChain);
        }
        if (terminatePlumChain != null) {
            builder.setTerminatePlumChain(terminatePlumChain);
        }
        if (plumPutBlock != null) {
            builder.setPlumPutBlock(plumPutBlock);
        }
        if (plumCreateDeposit != null) {
            builder.setPlumCreateDeposit(plumCreateDeposit);
        }
        if (plumStartExit != null) {
            builder.setPlumStartExit(plumStartExit);
        }
        if (plumChallengeExit != null) {
            builder.setPlumChallengeExit(plumChallengeExit);
        }
        if (plumResponseChallengeExit != null) {
            builder.setPlumResponseChallengeExit(plumResponseChallengeExit);
        }
        if (plumFinalizeExit != null) {
            builder.setPlumFinalizeExit(plumFinalizeExit);
        }
        if (plumSettleDeposit != null) {
            builder.setPlumSettleDeposit(plumSettleDeposit);
        }
        if (plumTransfer != null) {
            builder.setPlumTransfer(plumTransfer);
        }
        if (depositToRewardingFund != null) {
            builder.setDepositToRewardingFund(depositToRewardingFund);
        }
        if (claimFromRewardingFund != null) {
            builder.setClaimFromRewardingFund(claimFromRewardingFund);
        }
        if (grantReward != null) {
            builder.setGrantReward(grantReward);
        }
        if (putPollResult != null) {
            builder.setPutPollResult(putPollResult);
        }
        return builder.build();
    }

    public byte[] byteStream() {
        return core().toByteArray();
    }
}
