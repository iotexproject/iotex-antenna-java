package io.iotex.mobile.protocol;

import lombok.Data;

/**
 * execution request.
 *
 * @author Yang XuePing
 */
@Data
public class ExecutionRequest extends ActionRequest {
    private String contract;
    private String amount;
    private byte[] data;
}
