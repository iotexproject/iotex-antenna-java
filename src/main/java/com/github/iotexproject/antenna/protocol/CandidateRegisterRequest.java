package com.github.iotexproject.antenna.protocol;

import lombok.Data;

/**
 * CandidateRegister request.
 *
 * @author XuePing Yang
 */
@Data
public class CandidateRegisterRequest extends ActionRequest {
    private String name;
    private String operatorAddress;
    private String rewardAddress;

    private String stakedAmount;
    private int stakedDuration;
    private boolean autoStake;
    private String ownerAddress;
    private String payload;

    /**
     * BLS12-381 public key, hex, with or without a 0x prefix. Optional: leave
     * it null to register or update without one, and to leave an already
     * registered key untouched.
     */
    private String blsPubKey;
    /**
     * Proof of possession for blsPubKey, hex, with or without a 0x prefix.
     * Zanzibar verifies it against the candidate's OWNER address, not the
     * sender's and not the operator's, and rejects the action with
     * ErrUnauthorizedOperator (203) otherwise.
     */
    private String blsPop;
}
