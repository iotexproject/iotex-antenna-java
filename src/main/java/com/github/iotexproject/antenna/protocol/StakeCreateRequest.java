package com.github.iotexproject.antenna.protocol;

import lombok.Data;

/**
 * stakeCreate request.
 *
 * @author Dustin Xie
 */
@Data
public class StakeCreateRequest extends ActionRequest {
    private String candName;
    private String amount;
    private int duration;
    private boolean autoStake;
    private String payload;
}
