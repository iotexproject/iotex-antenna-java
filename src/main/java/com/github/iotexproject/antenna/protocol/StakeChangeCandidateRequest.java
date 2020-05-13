package com.github.iotexproject.antenna.protocol;

import lombok.Data;

/**
 * stakeChangeCandidate request.
 *
 * @author XuePing Yang
 */
@Data
public class StakeChangeCandidateRequest extends ActionRequest {
    private long bucketIndex;
    private String candidateName;
    private String payload;
}
