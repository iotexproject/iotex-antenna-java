package com.github.iotexproject.antenna.action;

import com.github.iotexproject.antenna.utils.Numeric;
import com.github.iotexproject.grpc.types.ActionCore;
import com.github.iotexproject.grpc.types.Encoding;
import com.github.iotexproject.grpc.types.Execution;
import com.github.iotexproject.grpc.types.Transfer;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigInteger;
import java.util.Collections;

/**
 * TX_CONTAINER signing path tests.
 */
public class TxContainerTest {

    // Throwaway dev key — address io187wzp08vnhjjpkydnr97qlh8kh0dpkkytfam8j
    private static final String PRIV = "0806c458b262edd333a191e92f561aff338211ee3e18ab315a074a2d82aa343f";
    private static final String PUB  = "044e18306ae9ef4ec9d07bf6e705442d4d1a75e6cdf750330ca2d880f2cc54607c9c33deb9eae9c06e06e04fe9ce3d43962cc67d5aa34fbeb71270d4bad3d648d9";
    private static final String RECIPIENT = "io14jyvf4stclr80nmgx9hrkdr0c4hptfwl7ljxdz";

    private static BigInteger priv() { return Numeric.toBigInt(PRIV); }
    private static BigInteger pub()  { return Numeric.toBigInt(PUB); }

    // --- IoAddressConverter ---

    @Test
    public void testIoAddressToHex() {
        String hex = IoAddressConverter.toHex(RECIPIENT);
        Assert.assertTrue(hex.startsWith("0x"));
        Assert.assertEquals(42, hex.length());
    }

    @Test
    public void testIoAddressPassThrough0x() {
        String addr = "0xab1234567890abcdef1234567890abcdef123456";
        Assert.assertEquals(addr, IoAddressConverter.toHex(addr));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIoAddressRejectsGarbage() {
        IoAddressConverter.toHex("notanaddress");
    }

    // --- ChainIdUtils.fromEvmChainId ---

    @Test
    public void testFromEvmChainId() {
        Assert.assertEquals(1, ChainIdUtils.fromEvmChainId(4689));
        Assert.assertEquals(2, ChainIdUtils.fromEvmChainId(4690));
        Assert.assertEquals(3, ChainIdUtils.fromEvmChainId(4691));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFromEvmChainIdInvalid() {
        ChainIdUtils.fromEvmChainId(1);
    }

    // --- DynamicFee (type 2) TX_CONTAINER ---

    @Test
    public void testDynamicFeeTxProducesContainer() {
        Envelop envelop = Envelop.builder()
                .version(1).nonce(9L).gasLimit(50000L).gasPrice("0").chainID(1)
                .txType(2)
                .gasTipCap("1000000000")
                .gasFeeCap("2000000000")
                .transfer(Transfer.newBuilder()
                        .setRecipient(RECIPIENT)
                        .setAmount("1")
                        .build())
                .build();

        SealedEnvelop sealed = SealedEnvelop.sign(priv(), pub(), envelop);

        Assert.assertNotNull(sealed.getRawEthTx());
        Assert.assertEquals(Integer.valueOf(EthTypedTxSigner.TX_CONTAINER_ENCODING), sealed.getEncoding());
        Assert.assertEquals(65, sealed.getSignature().length);
        // v byte must be 27 or 28
        byte v = sealed.getSignature()[64];
        Assert.assertTrue(v == 27 || v == 28);
    }

    @Test
    public void testDynamicFeeAction() {
        Envelop envelop = Envelop.builder()
                .version(1).nonce(7L).gasLimit(42000L).gasPrice("0").chainID(1)
                .txType(2)
                .gasTipCap("500000000")
                .gasFeeCap("1500000000")
                .transfer(Transfer.newBuilder()
                        .setRecipient(RECIPIENT)
                        .setAmount("1")
                        .build())
                .build();

        SealedEnvelop sealed = SealedEnvelop.sign(priv(), pub(), envelop);
        com.github.iotexproject.grpc.types.Action action = sealed.action();

        Assert.assertEquals(Encoding.TX_CONTAINER_VALUE, action.getEncodingValue());
        Assert.assertTrue(action.getCore().hasTxContainer());
        Assert.assertTrue(action.getCore().getTxContainer().getRaw().size() > 0);
        // ActionCore metadata fields should be preserved
        ActionCore core = action.getCore();
        Assert.assertEquals(7L, core.getNonce());
        Assert.assertEquals(42000L, core.getGasLimit());
        Assert.assertEquals("500000000", core.getGasTipCap());
        Assert.assertEquals("1500000000", core.getGasFeeCap());
        Assert.assertEquals(1, core.getChainID());
    }

    // --- AccessList (type 1) TX_CONTAINER ---

    @Test
    public void testAccessListTxProducesContainer() {
        com.github.iotexproject.grpc.types.AccessTuple accessTuple =
                com.github.iotexproject.grpc.types.AccessTuple.newBuilder()
                        .setAddress("0x1234567890abcdef1234567890abcdef12345678")
                        .addStorageKeys("0x0000000000000000000000000000000000000000000000000000000000000001")
                        .build();
        Envelop envelop = Envelop.builder()
                .version(1).nonce(5L).gasLimit(60000L).gasPrice("1000000000").chainID(1)
                .txType(1)
                .accessList(Collections.singletonList(accessTuple))
                .transfer(Transfer.newBuilder()
                        .setRecipient(RECIPIENT)
                        .setAmount("0")
                        .build())
                .build();

        SealedEnvelop sealed = SealedEnvelop.sign(priv(), pub(), envelop);

        Assert.assertNotNull(sealed.getRawEthTx());
        Assert.assertEquals(Integer.valueOf(128), sealed.getEncoding());
        Assert.assertEquals(65, sealed.getSignature().length);
        // type 1 rawEthTx starts with 0x01
        Assert.assertEquals((byte) 1, sealed.getRawEthTx()[0]);
    }

    // --- SetCode (type 4) TX_CONTAINER ---

    @Test
    public void testSetCodeTxProducesContainer() {
        SetCodeAuthorization auth = SetCodeAuthorization.builder()
                .chainID(1)
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
                        .setContract(RECIPIENT)
                        .setAmount("0")
                        .build())
                .build();

        SealedEnvelop sealed = SealedEnvelop.sign(priv(), pub(), envelop);

        Assert.assertNotNull(sealed.getRawEthTx());
        Assert.assertEquals(Integer.valueOf(128), sealed.getEncoding());
        Assert.assertEquals(65, sealed.getSignature().length);
        // type 4 rawEthTx starts with 0x04
        Assert.assertEquals((byte) 4, sealed.getRawEthTx()[0]);
        // verify ActionCore still carries typed-tx metadata
        ActionCore core = sealed.action().getCore();
        Assert.assertEquals(4, core.getTxType());
        Assert.assertEquals("1000000000", core.getGasTipCap());
        Assert.assertEquals(1, core.getSetCodeAuthListCount());
        Assert.assertEquals(4689, core.getSetCodeAuthList(0).getChainID());
    }

    // --- Legacy (type 0) stays on IoTeX protobuf path ---

    @Test
    public void testLegacyPathUnchanged() {
        Envelop envelop = Envelop.builder()
                .version(1).nonce(1L).gasLimit(100000L).gasPrice("10000000000000").chainID(2)
                .transfer(Transfer.newBuilder()
                        .setAmount("8500000000000000")
                        .setRecipient("io13zt8sznez2pf0q0hqdz2hyl938wak2fsjgdeml")
                        .build())
                .build();

        SealedEnvelop sealed = SealedEnvelop.sign(priv(), pub(), envelop);

        Assert.assertNull(sealed.getRawEthTx());
        Assert.assertNull(sealed.getEncoding());
        Assert.assertEquals(65, sealed.getSignature().length);
        Assert.assertFalse(sealed.action().getCore().hasTxContainer());
    }

    // --- Envelop.deserialize() round-trip preserves IoTeX chain ID ---

    @Test
    public void testDeserializeSetCodeRoundTrip() {
        SetCodeAuthorization auth = SetCodeAuthorization.builder()
                .chainID(2)  // IoTeX testnet → EVM 4690
                .address(new byte[20])
                .nonce(7L)
                .v(1)
                .r(new BigInteger("aabb", 16))
                .s(new BigInteger("ccdd", 16))
                .build();
        Envelop envelop = Envelop.builder()
                .version(1).nonce(1L).gasLimit(100000L).gasPrice("0").chainID(2)
                .txType(4).gasTipCap("1000000000").gasFeeCap("2000000000")
                .setCodeAuthList(Collections.singletonList(auth))
                .execution(Execution.newBuilder()
                        .setContract(RECIPIENT).setAmount("0").build())
                .build();

        Envelop deserialized = Envelop.deserialize(envelop.byteStream());

        Assert.assertEquals(1, deserialized.getSetCodeAuthList().size());
        // Must be IoTeX chain ID (2), not EVM chain ID (4690)
        Assert.assertEquals(2, (int) deserialized.getSetCodeAuthList().get(0).getChainID());
        Assert.assertEquals(7L, deserialized.getSetCodeAuthList().get(0).getNonce());
    }

    // --- Signing the same envelop twice is deterministic ---

    private static Envelop makeDynamicFeeEnvelop() {
        return Envelop.builder()
                .version(1).nonce(55L).gasLimit(21000L).gasPrice("0").chainID(1)
                .txType(2).gasTipCap("1").gasFeeCap("2")
                .transfer(Transfer.newBuilder().setRecipient(RECIPIENT).setAmount("0").build())
                .build();
    }

    @Test
    public void testDynamicFeeSigningIsDeterministic() {
        SealedEnvelop a = SealedEnvelop.sign(priv(), pub(), makeDynamicFeeEnvelop());
        SealedEnvelop b = SealedEnvelop.sign(priv(), pub(), makeDynamicFeeEnvelop());
        Assert.assertArrayEquals(a.getRawEthTx(), b.getRawEthTx());
        Assert.assertArrayEquals(a.getSignature(), b.getSignature());
    }
}
