package com.github.iotexproject.antenna.protocol;

import lombok.Data;

/**
 * stakeWithdraw request.
 *
 * @author XuePing Yang
 */
@Data
public class StakeWithdrawRequest extends ActionRequest {
    private long bucketIndex;
    private String payload;
}
