package com.github.iotexproject.antenna.action;

import com.github.iotexproject.antenna.crypto.Bech32;
import com.github.iotexproject.grpc.types.ActionCore;
import com.github.iotexproject.grpc.types.SetVoterRewardDestination;
import com.github.iotexproject.grpc.types.SetVoterRewardOptIn;
import com.google.protobuf.ByteString;
import org.junit.Assert;
import org.junit.Test;

/**
 * The two IIP-59 actions, checked at the level that can silently go wrong:
 * which oneof field they occupy, and whether an empty payload survives the
 * round trip through Envelop.
 */
public class VoterRewardActionTest {

    private static final String RECIPIENT = "io1ph0u2psnd7muq5xv9623rmxdsxc4uapxhzpg02";

    /**
     * Field numbers the node dispatches on. An action filed under the wrong one
     * still marshals and still signs; it is only rejected once it reaches a
     * node, so pin them here.
     */
    @Test
    public void actionsOccupyTheProtocolFieldNumbers() {
        ActionCore optIn = ActionCore.newBuilder()
                .setSetVoterRewardOptIn(SetVoterRewardOptIn.newBuilder().build())
                .build();
        Assert.assertEquals(57,
                optIn.getDescriptorForType().findFieldByName("setVoterRewardOptIn").getNumber());

        ActionCore dest = ActionCore.newBuilder()
                .setSetVoterRewardDestination(SetVoterRewardDestination.newBuilder().build())
                .build();
        Assert.assertEquals(58,
                dest.getDescriptorForType().findFieldByName("setVoterRewardDestination").getNumber());
    }

    /**
     * The trap this test exists for: SetVoterRewardOptIn carries no fields, so
     * it serializes to zero bytes. Envelop's other branches detect a payload
     * with toByteArray().length > 0, which is false here -- the opt-in would be
     * dropped on the way back in, turning a delegate's one-way action into a
     * silent no-op. Presence, not length, is the only usable signal.
     */
    @Test
    public void emptyOptInPayloadIsStillPresent() {
        ActionCore core = ActionCore.newBuilder()
                .setSetVoterRewardOptIn(SetVoterRewardOptIn.newBuilder().build())
                .build();

        Assert.assertEquals(0, core.getSetVoterRewardOptIn().toByteArray().length);
        Assert.assertTrue("presence bit must survive a zero-byte payload", core.hasSetVoterRewardOptIn());
        Assert.assertEquals(ActionCore.ActionCase.SETVOTERREWARDOPTIN, core.getActionCase());
    }

    /** Envelop must carry the opt-in back out of a serialized core. */
    @Test
    public void envelopRoundTripsTheEmptyOptIn() {
        ActionCore core = ActionCore.newBuilder()
                .setVersion(1)
                .setNonce(7)
                .setGasLimit(200000)
                .setGasPrice("1000000000000")
                .setSetVoterRewardOptIn(SetVoterRewardOptIn.newBuilder().build())
                .build();

        Envelop back = Envelop.deserialize(core.toByteArray());
        Assert.assertNotNull("opt-in dropped on the way back in", back.getSetVoterRewardOptIn());
        Assert.assertTrue(back.core().hasSetVoterRewardOptIn());
    }

    /**
     * The protocol reads the recipient with address.FromBytes, so it must be 20
     * raw bytes rather than the bech32 string.
     */
    @Test
    public void destinationCarriesTwentyRawAddressBytes() {
        byte[] dec = Bech32.decode(RECIPIENT).data;
        byte[] raw = Bech32.convertBits(dec, 0, dec.length, 5, 8, false);
        Assert.assertEquals(20, raw.length);

        ActionCore core = ActionCore.newBuilder()
                .setSetVoterRewardDestination(SetVoterRewardDestination.newBuilder()
                        .setRecipient(ByteString.copyFrom(raw))
                        .build())
                .build();
        Assert.assertArrayEquals(raw, core.getSetVoterRewardDestination().getRecipient().toByteArray());
        Assert.assertEquals(20, core.getSetVoterRewardDestination().getRecipient().size());
    }
}
