package com.github.iotexproject.antenna.action;

import com.github.iotexproject.antenna.account.IotexAccountTest;
import com.github.iotexproject.antenna.utils.Numeric;
import com.google.protobuf.ByteString;
import com.github.iotexproject.grpc.types.Transfer;
import org.junit.Assert;
import org.junit.Test;

/**
 * sealed envelop test.
 *
 * @author Yang XuePing
 */
public class SealedEnvelopTest {
    @Test
    public void testSign() {
        Envelop envelop = Envelop.builder()
                .version(1).nonce(1l).gasLimit(100000l).gasPrice("10000000000000").chainID(2)
                .transfer(Transfer.newBuilder()
                        .setAmount("8500000000000000")
                        .setRecipient("io13zt8sznez2pf0q0hqdz2hyl938wak2fsjgdeml")
                        .setPayload(ByteString.copyFrom(Numeric.hexStringToByteArray("68656c6c6f20776f726c6421")))
                        .build()
                ).build();
        SealedEnvelop sealedEnvelop = SealedEnvelop.sign(
                Numeric.toBigInt(IotexAccountTest.TEST_PRIVATE),
                Numeric.toBigInt(IotexAccountTest.TEST_PUBLIC),
                envelop
        );
        Assert.assertEquals(
                "c6c296ea7e6d7c8422c5e70be716e47d91d1ea530c6b6c450d61e648a490f62c10448ebe87e473fda3de80ec52ddafbdcd2c4cf4126227f0f2d436db66879ef401",
                Numeric.toHexString(sealedEnvelop.getSignature())
        );
    }
}
