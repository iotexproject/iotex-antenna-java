package com.github.iotexproject.antenna.protocol;

import lombok.Data;

/**
 * transfer request.
 *
 * @author Yang XuePing
 */
@Data
public class TransferRequest extends ActionRequest {
    private String recipient;
    private String amount;
    private String payload;
}
