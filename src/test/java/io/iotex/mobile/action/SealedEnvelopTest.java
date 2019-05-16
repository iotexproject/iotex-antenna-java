package io.iotex.mobile.action;

import com.google.protobuf.ByteString;
import io.iotex.grpc.types.Transfer;
import io.iotex.mobile.account.IotexAccountTest;
import io.iotex.mobile.utils.Numeric;
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
                .version(1).nonce(1l).gasLimit(100000l).gasPrice("10000000000000")
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
                "8d7174a896671f5c4565487cb267b7d4ef2a0e70f22082df0bd7e71282bcea7a7c38e2dcd29bc80410571d84b8f788c448f8fb0391160bf2d5eaeee7389c003b00",
                Numeric.toHexString(sealedEnvelop.getSignature())
        );
    }
}
