package com.github.iotexproject.antenna.protocol;

import lombok.Data;

/**
 * stakeAddDeposit request.
 *
 * @author XuePing Yang
 */
@Data
public class StakeAddDepositRequest extends ActionRequest {
    private long bucketIndex;
    private String amount;
    private String payload;
}
