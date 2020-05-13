package com.github.iotexproject.antenna.protocol;

import lombok.Data;

/**
 * stakeCreate request.
 *
 * @author Dustin Xie
 */
@Data
public class StakeCreateRequest extends ActionRequest {
    private String candidateName;
    private String stakedAmount;
    private int stakedDuration;
    private boolean autoStake;
    private String payload;
}
