package com.github.iotexproject.mobile.action;

import com.github.iotexproject.grpc.types.Execution;
import com.github.iotexproject.grpc.types.Transfer;
import com.google.protobuf.ByteString;
import org.junit.Assert;
import org.junit.Test;

/**
 * envelop test.
 *
 * @author Yang XuePing
 */
public class EnvelopTest {
    @Test
    public void testTransferDeserialize() {
        Envelop envelop = Envelop.builder().version(1).nonce(2l).gasLimit(100l).gasPrice("300")
                .transfer(Transfer.newBuilder()
                        .setRecipient("io14jyvf4stclr80nmgx9hrkdr0c4hptfwl7ljxdz")
                        .setAmount("10000")
                        .setPayload(ByteString.copyFromUtf8("hello"))
                        .build())
                .build();


        try {
            Envelop deEnvelop = Envelop.deserialize(envelop.byteStream());
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
    public void testExecutionDeserialize() {
        Envelop envelop = Envelop.builder().version(1).nonce(2l).gasLimit(100l).gasPrice("300")
                .execution(Execution.newBuilder()
                        .setContract("io24jyvf4stclr80nmgx9hrkdr0c4hptfwl7ljxdz")
                        .setAmount("20000")
                        .setData(ByteString.copyFromUtf8("world"))
                        .build())
                .build();


        try {
            Envelop deEnvelop = Envelop.deserialize(envelop.byteStream());
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
