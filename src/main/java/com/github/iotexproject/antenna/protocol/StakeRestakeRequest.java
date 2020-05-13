package com.github.iotexproject.antenna.protocol;

import lombok.Data;

/**
 * stakeWithdraw request.
 *
 * @author XuePing Yang
 */
@Data
public class StakeRestakeRequest extends ActionRequest {
    private long bucketIndex;
    private int stakedDuration;
    private boolean autoStake;
    private String payload;
}
