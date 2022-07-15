package com.github.iotexproject.antenna.protocol;

import com.github.iotexproject.antenna.account.Account;
import lombok.Data;

/**
 * action request.
 *
 * @author Yang XuePing
 */
@Data
public class ActionRequest {
    private Long nonce;
    private Long gasLimit;
    private String gasPrice;
    private Integer chainID;
    private Account account;
}
