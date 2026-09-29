package com.github.iotexproject.antenna.protocol;

import lombok.Data;

/**
 * setVoterRewardOptIn request.
 *
 * <p>Carries no fields of its own: the sender is the delegate opting in. It is
 * one-way -- the protocol has no counterpart action to opt back out.
 *
 * <p>Opting in with no reward portions published on the DelegateProfile
 * contract is silently harmful rather than rejected. The protocol cannot tell
 * "unset" from "explicit zero", falls back to a 100% commission, and pays every
 * voter zero while producing successful distributions. Publish portions first.
 */
@Data
public class SetVoterRewardOptInRequest extends ActionRequest {
}
