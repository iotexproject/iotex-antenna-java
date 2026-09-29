package com.github.iotexproject.antenna.protocol;

import lombok.Data;

/**
 * setVoterRewardDestination request.
 *
 * <p>Redirects the sender's own IIP-59 voter rewards. Passing the sender's own
 * address clears the override.
 *
 * <p>The protocol resolves the destination live at drain time rather than
 * snapshotting it at the era freeze, so a change made mid-era applies to that
 * era's payout. A compound (AutoDeposit) bucket still takes priority over it.
 */
@Data
public class SetVoterRewardDestinationRequest extends ActionRequest {
    /** Recipient in io1... form; converted to raw bytes on the wire. */
    private String recipient;
}
