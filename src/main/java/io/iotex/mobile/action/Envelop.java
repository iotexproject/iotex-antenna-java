package io.iotex.mobile.action;

import io.iotex.grpc.types.*;
import lombok.Builder;
import lombok.Data;

/**
 * action envelop.
 *
 * @author Yang XuePing
 */
@Data
@Builder
public class Envelop {
    private Integer version;
    private Long nonce;
    private Long gasLimit;
    private String gasPrice;

    // optional fields
    private Transfer transfer;
    private Vote vote;
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

    public ActionCore core() {
        ActionCore.Builder builder = ActionCore.newBuilder().setVersion(version).setNonce(nonce).setGasLimit(gasLimit).setGasPrice(gasPrice);
        if (transfer != null) {
            builder.setTransfer(transfer);
        }
        if (vote != null) {
            builder.setVote(vote);
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

    public byte[] bytestream() {
        return core().toByteArray();
    }
}
