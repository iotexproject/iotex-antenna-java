package com.github.iotexproject.antenna.protocol;

import lombok.Data;

/**
 * stakeUnstake request.
 *
 * @author XuePing Yang
 */
@Data
public class StakeUnstakeRequest extends ActionRequest {
    private long bucketIndex;
    private String payload;
}
