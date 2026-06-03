package com.github.iotexproject.antenna.action;

import com.github.iotexproject.antenna.account.IotexAccountTest;
import com.github.iotexproject.antenna.utils.Numeric;
import com.google.protobuf.ByteString;
import com.github.iotexproject.grpc.types.Execution;
import com.github.iotexproject.grpc.types.Transfer;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigInteger;
import java.util.Collections;

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

    @Test
    public void testTypedTxFieldsPropagate() {
        SetCodeAuthorization auth = SetCodeAuthorization.builder()
                .chainID(1)  // IoTeX mainnet → EVM 4689
                .address(new byte[20])
                .nonce(3L)
                .v(0)
                .r(BigInteger.valueOf(0xaabbL))
                .s(BigInteger.valueOf(0xccddL))
                .build();
        Envelop envelop = Envelop.builder()
                .version(1).nonce(5L).gasLimit(100000L).gasPrice("0").chainID(1)
                .txType(4)
                .gasTipCap("1000000000")
                .gasFeeCap("2000000000")
                .setCodeAuthList(Collections.singletonList(auth))
                .execution(Execution.newBuilder()
                        .setContract("io14jyvf4stclr80nmgx9hrkdr0c4hptfwl7ljxdz")
                        .setAmount("0")
                        .build())
                .build();

        SealedEnvelop sealed = SealedEnvelop.sign(
                Numeric.toBigInt(IotexAccountTest.TEST_PRIVATE),
                Numeric.toBigInt(IotexAccountTest.TEST_PUBLIC),
                envelop
        );
        com.github.iotexproject.grpc.types.ActionCore core = sealed.action().getCore();

        Assert.assertEquals(4, core.getTxType());
        Assert.assertEquals("1000000000", core.getGasTipCap());
        Assert.assertEquals("2000000000", core.getGasFeeCap());
        Assert.assertEquals(1, core.getSetCodeAuthListCount());
        Assert.assertEquals(4689, core.getSetCodeAuthList(0).getChainID());  // EVM network ID
        Assert.assertEquals(3L, core.getSetCodeAuthList(0).getNonce());
    }
}
