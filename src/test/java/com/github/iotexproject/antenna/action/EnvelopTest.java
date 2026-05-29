package com.github.iotexproject.antenna.action;

import com.github.iotexproject.grpc.types.AccessTuple;
import com.github.iotexproject.grpc.types.Execution;
import com.github.iotexproject.grpc.types.Transfer;
import com.github.iotexproject.antenna.utils.Numeric;
import com.google.protobuf.ByteString;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collections;

/**
 * envelop test.
 *
 * @author Yang XuePing
 */
public class EnvelopTest {
    @Test
    public void testTransferDeserialize() {
        Envelop envelop = Envelop.builder().version(1).nonce(2l).gasLimit(100l).gasPrice("300").chainID(2)
                .transfer(Transfer.newBuilder()
                        .setRecipient("io14jyvf4stclr80nmgx9hrkdr0c4hptfwl7ljxdz")
                        .setAmount("10000")
                        .setPayload(ByteString.copyFromUtf8("hello"))
                        .build())
                .build();

        try {
            Envelop deEnvelop = Envelop.deserialize(envelop.byteStream());

            Assert.assertEquals(Numeric.toHexString(envelop.byteStream()), Numeric.toHexString(deEnvelop.byteStream()));

            Assert.assertEquals(envelop.getVersion(), deEnvelop.getVersion());
            Assert.assertEquals(envelop.getNonce(), deEnvelop.getNonce());
            Assert.assertEquals(envelop.getGasLimit(), deEnvelop.getGasLimit());
            Assert.assertEquals(envelop.getGasPrice(), deEnvelop.getGasPrice());

            Assert.assertNotNull(deEnvelop);
            Assert.assertEquals(envelop.getTransfer().getRecipient(), deEnvelop.getTransfer().getRecipient());
            Assert.assertEquals(envelop.getTransfer().getAmount(), deEnvelop.getTransfer().getAmount());
            Assert.assertEquals(envelop.getTransfer().getPayload(), deEnvelop.getTransfer().getPayload());
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
            Assert.fail();
        }
    }


    @Test
    public void testEIP1559FieldsRoundTrip() {
        AccessTuple accessTuple = AccessTuple.newBuilder()
                .setAddress("0x1234567890abcdef1234567890abcdef12345678")
                .addStorageKeys("0xaaaa")
                .build();
        Envelop envelop = Envelop.builder()
                .version(1).nonce(3L).gasLimit(21000L).gasPrice("0").chainID(2)
                .txType(2)
                .gasTipCap("1000000000")
                .gasFeeCap("2000000000")
                .accessList(Collections.singletonList(accessTuple))
                .transfer(Transfer.newBuilder().setRecipient("io14jyvf4stclr80nmgx9hrkdr0c4hptfwl7ljxdz").setAmount("1").build())
                .build();

        Envelop deEnvelop = Envelop.deserialize(envelop.byteStream());

        Assert.assertEquals(Integer.valueOf(2), deEnvelop.getTxType());
        Assert.assertEquals("1000000000", deEnvelop.getGasTipCap());
        Assert.assertEquals("2000000000", deEnvelop.getGasFeeCap());
        Assert.assertEquals(1, deEnvelop.getAccessList().size());
        Assert.assertEquals("0x1234567890abcdef1234567890abcdef12345678", deEnvelop.getAccessList().get(0).getAddress());
    }

    @Test
    public void testSetCodeAuthList_coreWritesEvmChainId() {
        SetCodeAuthorization auth = SetCodeAuthorization.builder()
                .chainID(2)  // IoTeX testnet
                .address(new byte[20])
                .nonce(7L)
                .v(1)
                .r(new BigInteger("aabb", 16))
                .s(new BigInteger("ccdd", 16))
                .build();
        Envelop envelop = Envelop.builder()
                .version(1).nonce(1L).gasLimit(100000L).gasPrice("0").chainID(2)
                .txType(4)
                .gasTipCap("1000000000")
                .gasFeeCap("2000000000")
                .setCodeAuthList(Collections.singletonList(auth))
                .execution(com.github.iotexproject.grpc.types.Execution.newBuilder()
                        .setContract("io14jyvf4stclr80nmgx9hrkdr0c4hptfwl7ljxdz")
                        .setAmount("0")
                        .build())
                .build();

        com.github.iotexproject.grpc.types.ActionCore core = envelop.core();
        Assert.assertEquals(1, core.getSetCodeAuthListCount());
        Assert.assertEquals(4690, core.getSetCodeAuthList(0).getChainID());  // EVM network ID
        Assert.assertEquals(7L, core.getSetCodeAuthList(0).getNonce());
        Assert.assertEquals(1L, core.getSetCodeAuthList(0).getV());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetCodeAuthList_invalidIoTeXChainID() {
        SetCodeAuthorization auth = SetCodeAuthorization.builder()
                .chainID(4)  // invalid
                .address(new byte[20])
                .build();
        Envelop envelop = Envelop.builder()
                .version(1).nonce(1L).gasLimit(100000L).gasPrice("0").chainID(2)
                .setCodeAuthList(Collections.singletonList(auth))
                .execution(com.github.iotexproject.grpc.types.Execution.newBuilder()
                        .setContract("io14jyvf4stclr80nmgx9hrkdr0c4hptfwl7ljxdz")
                        .setAmount("0")
                        .build())
                .build();
        envelop.core();  // should throw
    }

    @Test
    public void testExecutionDeserialize() {
        Envelop envelop = Envelop.builder().version(1).nonce(2l).gasLimit(100l).gasPrice("300").chainID(2)
                .execution(Execution.newBuilder()
                        .setContract("io24jyvf4stclr80nmgx9hrkdr0c4hptfwl7ljxdz")
                        .setAmount("20000")
                        .setData(ByteString.copyFromUtf8("world"))
                        .build())
                .build();


        try {
            Envelop deEnvelop = Envelop.deserialize(envelop.byteStream());

            Assert.assertEquals(Numeric.toHexString(envelop.byteStream()), Numeric.toHexString(deEnvelop.byteStream()));

            Assert.assertEquals(envelop.getVersion(), deEnvelop.getVersion());
            Assert.assertEquals(envelop.getNonce(), deEnvelop.getNonce());
            Assert.assertEquals(envelop.getGasLimit(), deEnvelop.getGasLimit());
            Assert.assertEquals(envelop.getGasPrice(), deEnvelop.getGasPrice());

            Assert.assertNotNull(deEnvelop.getExecution());
            Assert.assertEquals(envelop.getExecution().getContract(), deEnvelop.getExecution().getContract());
            Assert.assertEquals(envelop.getExecution().getAmount(), deEnvelop.getExecution().getAmount());
            Assert.assertEquals(envelop.getExecution().getData(), deEnvelop.getExecution().getData());
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
            Assert.fail();
        }
    }
}
