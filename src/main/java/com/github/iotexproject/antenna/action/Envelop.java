package com.github.iotexproject.antenna.action;

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

    private Integer chainID;

    // optional fields
    private Transfer transfer;
    private Execution execution;
    private StakeCreate stakeCreate;
    private StakeReclaim stakeUnstake;
    private StakeReclaim stakeWithdraw;
    private StakeAddDeposit stakeAddDeposit;
    private StakeRestake stakeRestake;
    private StakeChangeCandidate stakeChangeCandidate;
    private StakeTransferOwnership stakeTransferOwnership;
    private CandidateRegister candidateRegister;
    private CandidateBasicInfo candidateUpdate;
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
            envelop.setChainID(core.getChainID());

            if (core.getTransfer().toByteArray().length > 0) {
                envelop.setTransfer(core.getTransfer());
            }
            if (core.getExecution().toByteArray().length > 0) {
                envelop.setExecution(core.getExecution());
            }
            if (core.getClaimFromRewardingFund().toByteArray().length > 0) {
                envelop.setClaimFromRewardingFund(core.getClaimFromRewardingFund());
            }
            if (core.getStakeCreate().toByteArray().length > 0) {
                envelop.setStakeCreate(core.getStakeCreate());
            }
            if (core.getStakeUnstake().toByteArray().length > 0) {
                envelop.setStakeUnstake(core.getStakeUnstake());
            }
            if (core.getStakeWithdraw().toByteArray().length > 0) {
                envelop.setStakeWithdraw(core.getStakeWithdraw());
            }
            if (core.getStakeAddDeposit().toByteArray().length > 0) {
                envelop.setStakeAddDeposit(core.getStakeAddDeposit());
            }
            if (core.getStakeRestake().toByteArray().length > 0) {
                envelop.setStakeRestake(core.getStakeRestake());
            }
            if (core.getStakeChangeCandidate().toByteArray().length > 0) {
                envelop.setStakeChangeCandidate(core.getStakeChangeCandidate());
            }
            if (core.getStakeTransferOwnership().toByteArray().length > 0) {
                envelop.setStakeTransferOwnership(core.getStakeTransferOwnership());
            }
            if (core.getCandidateRegister().toByteArray().length > 0) {
                envelop.setCandidateRegister(core.getCandidateRegister());
            }
            if (core.getCandidateUpdate().toByteArray().length > 0) {
                envelop.setCandidateUpdate(core.getCandidateUpdate());
            }

            return envelop;
        } catch (InvalidProtocolBufferException e) {
            throw new IllegalArgumentException("deserialize envelop error", e);
        }
    }

    public ActionCore core() {
        ActionCore.Builder builder = ActionCore.newBuilder().setVersion(version).setNonce(nonce).setGasLimit(gasLimit).setGasPrice(gasPrice).setChainID(chainID);
        if (transfer != null) {
            builder.setTransfer(transfer);
        }
        if (execution != null) {
            builder.setExecution(execution);
        }
        if (stakeCreate != null) {
            builder.setStakeCreate(stakeCreate);
        }
        if (stakeUnstake != null) {
            builder.setStakeUnstake(stakeUnstake);
        }
        if (stakeWithdraw != null) {
            builder.setStakeWithdraw(stakeWithdraw);
        }
        if (stakeAddDeposit != null) {
            builder.setStakeAddDeposit(stakeAddDeposit);
        }
        if (stakeRestake != null) {
            builder.setStakeRestake(stakeRestake);
        }
        if (stakeChangeCandidate != null) {
            builder.setStakeChangeCandidate(stakeChangeCandidate);
        }
        if (stakeTransferOwnership != null) {
            builder.setStakeTransferOwnership(stakeTransferOwnership);
        }
        if (candidateRegister != null) {
            builder.setCandidateRegister(candidateRegister);
        }
        if (candidateUpdate != null) {
            builder.setCandidateUpdate(candidateUpdate);
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
