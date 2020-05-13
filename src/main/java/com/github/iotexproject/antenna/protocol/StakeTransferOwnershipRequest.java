package com.github.iotexproject.antenna.protocol;

import lombok.Data;

/**
 * stakeTransferOwnership request.
 *
 * @author XuePing Yang
 */
@Data
public class StakeTransferOwnershipRequest extends ActionRequest {
    private long bucketIndex;
    private String voterAddress;
    private String payload;
}
