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
}
