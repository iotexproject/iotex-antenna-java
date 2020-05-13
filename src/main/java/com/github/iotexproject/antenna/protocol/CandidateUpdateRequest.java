package com.github.iotexproject.antenna.protocol;

import lombok.Data;

/**
 * CandidateUpdate request.
 *
 * @author XuePing Yang
 */
@Data
public class CandidateUpdateRequest extends ActionRequest {
    private String name;
    private String operatorAddress;
    private String rewardAddress;
}
