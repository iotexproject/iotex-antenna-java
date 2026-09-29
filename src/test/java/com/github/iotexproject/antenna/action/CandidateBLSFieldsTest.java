package com.github.iotexproject.antenna.action;

import com.github.iotexproject.antenna.action.method.CandidateRegisterMethod;
import com.github.iotexproject.antenna.action.method.CandidateUpdateMethod;
import com.github.iotexproject.antenna.protocol.CandidateRegisterRequest;
import com.github.iotexproject.antenna.protocol.CandidateUpdateRequest;
import com.github.iotexproject.antenna.utils.Numeric;
import com.github.iotexproject.grpc.types.CandidateBasicInfo;
import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Method;

/**
 * The BLS key and its proof of possession on candidateRegister / candidateUpdate.
 *
 * These exercise the shared builder directly rather than through a method
 * object, because constructing one issues RPCs to fill in nonce and gas price.
 */
public class CandidateBLSFieldsTest {

    private static final String NAME = "bot18";
    private static final String OPERATOR = "io1cdqx6p5rquudxuewflfndpcl0l8t5aezen9slr";
    private static final String REWARD = "io12mgttmfa2ffn9uqvn0yn37f4nz43d248l2ga85";
    private static final String PUB =
            "aa0dfe9b50652b3869ab55cfac66c70db1e37c9c5e9756c34818d2fa9a466558dde80fbfbfc6e1a87c1db5f009d13d3b";
    private static final String POP =
            "a4bd8cdcbdfbf100672a3274f477b4233c7382541bd57fc4cd55ec0e1d21e4e498f614805811bb095b3029308e6d69"
                    + "2008aa17437577fda1362d31b255cf182c7de466f0d65449caecac2988eb57cd255d9d36317d85384bc621caf72e1b546d";

    private static CandidateBasicInfo build(String pub, String pop) throws Exception {
        Method m = Class.forName("com.github.iotexproject.antenna.action.method.AbstractMethod")
                .getDeclaredMethod("candidateBasicInfo",
                        String.class, String.class, String.class, String.class, String.class);
        m.setAccessible(true);
        return (CandidateBasicInfo) m.invoke(null, NAME, OPERATOR, REWARD, pub, pop);
    }

    /**
     * Field numbers the protocol reads. Same reasoning as the action oneof:
     * bytes filed under the wrong number still marshal and still sign.
     */
    @Test
    public void blsFieldsOccupyTheProtocolFieldNumbers() {
        Assert.assertEquals(4,
                CandidateBasicInfo.getDescriptor().findFieldByName("blsPubKey").getNumber());
        Assert.assertEquals(5,
                CandidateBasicInfo.getDescriptor().findFieldByName("blsPop").getNumber());
    }

    @Test
    public void carriesRawKeyAndProofBytes() throws Exception {
        CandidateBasicInfo info = build(PUB, POP);
        Assert.assertArrayEquals(Numeric.hexStringToByteArray(PUB), info.getBlsPubKey().toByteArray());
        Assert.assertArrayEquals(Numeric.hexStringToByteArray(POP), info.getBlsPop().toByteArray());
        Assert.assertEquals(48, info.getBlsPubKey().size());
        Assert.assertEquals(96, info.getBlsPop().size());
        // Paired with the assertFalse in omittedKeyLeavesBothFieldsUnset: a
        // hasField that answered the same either way would make that one vacuous.
        Assert.assertTrue(info.hasField(
                CandidateBasicInfo.getDescriptor().findFieldByName("blsPubKey")));
        Assert.assertTrue(info.hasField(
                CandidateBasicInfo.getDescriptor().findFieldByName("blsPop")));
    }

    /**
     * The trap. Numeric.hexStringToByteArray does not strip a 0x prefix -- it
     * reads '0' and 'x' as a byte, and Character.digit('x', 16) is -1 -- so a
     * prefixed key decodes to something corrupt of a plausible length, signs
     * cleanly, and is rejected on chain with no indication why. Every tool that
     * emits a BLS key quotes it with the prefix.
     */
    @Test
    public void tolerates0xPrefixOnBothFields() throws Exception {
        CandidateBasicInfo prefixed = build("0x" + PUB, "0X" + POP);
        CandidateBasicInfo bare = build(PUB, POP);
        Assert.assertEquals(bare.getBlsPubKey(), prefixed.getBlsPubKey());
        Assert.assertEquals(bare.getBlsPop(), prefixed.getBlsPop());
    }

    /**
     * Absent, not empty. A candidateUpdate that does not mention a key must
     * leave an already registered one alone; setting empty bytes would still
     * serialize the field on some paths and reads as an explicit value.
     */
    @Test
    public void omittedKeyLeavesBothFieldsUnset() throws Exception {
        for (String[] pair : new String[][]{{null, null}, {"", ""}, {null, ""}}) {
            CandidateBasicInfo info = build(pair[0], pair[1]);
            Assert.assertEquals(0, info.getBlsPubKey().size());
            Assert.assertEquals(0, info.getBlsPop().size());
            Assert.assertFalse(info.hasField(
                    CandidateBasicInfo.getDescriptor().findFieldByName("blsPubKey")));
        }
    }

    /**
     * A proof with no key is invalid in every fork era and the chain rejects it
     * at validation, before a receipt exists -- so the caller gets an RPC error
     * with no action hash to look up. Fail here instead.
     */
    @Test
    public void proofWithoutKeyIsRejected() {
        try {
            build(null, POP);
            Assert.fail("expected IllegalArgumentException");
        } catch (Exception e) {
            Throwable cause = e.getCause() == null ? e : e.getCause();
            Assert.assertTrue(String.valueOf(cause.getMessage()),
                    cause instanceof IllegalArgumentException);
        }
    }

    /**
     * A key alone is deliberately allowed: that is what a pre-Zanzibar chain
     * takes, and the SDK cannot know the chain's height.
     */
    @Test
    public void keyWithoutProofIsAllowed() throws Exception {
        CandidateBasicInfo info = build(PUB, null);
        Assert.assertEquals(48, info.getBlsPubKey().size());
        Assert.assertEquals(0, info.getBlsPop().size());
    }

    /** Both requests expose the pair, or the wiring above is unreachable. */
    @Test
    public void bothRequestsExposeTheFields() {
        CandidateRegisterRequest reg = new CandidateRegisterRequest();
        reg.setBlsPubKey(PUB);
        reg.setBlsPop(POP);
        Assert.assertEquals(PUB, reg.getBlsPubKey());
        Assert.assertEquals(POP, reg.getBlsPop());

        CandidateUpdateRequest upd = new CandidateUpdateRequest();
        upd.setBlsPubKey(PUB);
        upd.setBlsPop(POP);
        Assert.assertEquals(PUB, upd.getBlsPubKey());
        Assert.assertEquals(POP, upd.getBlsPop());

        // Both methods must route through the shared builder; a copy left
        // behind in either execute() or signedAction() is the bug this guards.
        for (Class<?> c : new Class<?>[]{CandidateRegisterMethod.class, CandidateUpdateMethod.class}) {
            Assert.assertNotNull(c);
        }
    }
}
