package io.iotex.mobile.protocol;

import io.iotex.mobile.account.Account;
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
