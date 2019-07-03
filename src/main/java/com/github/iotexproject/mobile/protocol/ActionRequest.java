package com.github.iotexproject.mobile.protocol;

import com.github.iotexproject.mobile.account.Account;
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
    private Account account;
}
