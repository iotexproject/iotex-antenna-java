package com.github.iotexproject.antenna.action;

import com.google.protobuf.ByteString;
import org.web3j.crypto.AccessListObject;
import org.web3j.crypto.ECKeyPair;
import org.web3j.crypto.Hash;
import org.web3j.crypto.RawTransaction;
import org.web3j.crypto.Sign;
import org.web3j.crypto.TransactionEncoder;
import org.web3j.rlp.RlpEncoder;
import org.web3j.rlp.RlpList;
import org.web3j.rlp.RlpString;
import org.web3j.rlp.RlpType;
import org.web3j.utils.Numeric;

import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

final class EthTypedTxSigner {

    static final int TX_CONTAINER_ENCODING = 128;

    static final class SignResult {
        final byte[] rawEthTx;
        final byte[] iotexSig; // 65 bytes: r(32) || s(32) || v(1) where v = 27 or 28
        SignResult(byte[] rawEthTx, byte[] iotexSig) {
            this.rawEthTx = rawEthTx;
            this.iotexSig = iotexSig;
        }
    }

    static SignResult sign(Envelop envelop, BigInteger privateKey) {
        int txType = envelop.getTxType() == null ? 0 : envelop.getTxType();
        long evmChainId = ChainIdUtils.toEvmChainId(envelop.getChainID());
        ECKeyPair keyPair = ECKeyPair.create(privateKey);
        switch (txType) {
            case 1: return signType1(envelop, evmChainId, keyPair);
            case 2: return signType2(envelop, evmChainId, keyPair);
            case 3: throw new UnsupportedOperationException("blob (EIP-4844) tx signing not yet supported");
            case 4: return signType4(envelop, evmChainId, keyPair);
            default: throw new IllegalArgumentException("unsupported txType for TX_CONTAINER: " + txType);
        }
    }

    // EIP-2930 (access-list)
    private static SignResult signType1(Envelop envelop, long evmChainId, ECKeyPair keyPair) {
        BigInteger nonce = BigInteger.valueOf(envelop.getNonce());
        BigInteger gasPrice = parseBigInt(envelop.getGasPrice());
        BigInteger gasLimit = BigInteger.valueOf(envelop.getGasLimit());
        String to = toAddress(envelop);
        BigInteger value = toValue(envelop);
        String data = toDataHex(envelop);
        List<AccessListObject> accessList = toAccessList(envelop);
        RawTransaction rawTx = RawTransaction.createTransaction(
                evmChainId, nonce, gasPrice, gasLimit, to, value, data, accessList);
        return finishSign(rawTx, keyPair);
    }

    // EIP-1559 (dynamic fee)
    private static SignResult signType2(Envelop envelop, long evmChainId, ECKeyPair keyPair) {
        BigInteger nonce = BigInteger.valueOf(envelop.getNonce());
        BigInteger gasLimit = BigInteger.valueOf(envelop.getGasLimit());
        String to = toAddress(envelop);
        BigInteger value = toValue(envelop);
        String data = toDataHex(envelop);
        BigInteger maxPriorityFeePerGas = parseBigInt(envelop.getGasTipCap());
        BigInteger maxFeePerGas = parseBigInt(envelop.getGasFeeCap());
        List<AccessListObject> accessList = toAccessList(envelop);
        RawTransaction rawTx;
        if (accessList.isEmpty()) {
            rawTx = RawTransaction.createTransaction(
                    evmChainId, nonce, gasLimit, to, value, data, maxPriorityFeePerGas, maxFeePerGas);
        } else {
            rawTx = RawTransaction.createTransaction(
                    evmChainId, nonce, gasLimit, to, value, data, maxPriorityFeePerGas, maxFeePerGas, accessList);
        }
        return finishSign(rawTx, keyPair);
    }

    // EIP-7702 (set-code) — manual RLP since web3j 4.x does not support type 4
    private static SignResult signType4(Envelop envelop, long evmChainId, ECKeyPair keyPair) {
        BigInteger nonce = BigInteger.valueOf(envelop.getNonce());
        BigInteger gasLimit = BigInteger.valueOf(envelop.getGasLimit());
        String to = toAddress(envelop);
        BigInteger value = toValue(envelop);
        byte[] dataBytes = toDataBytes(envelop);
        BigInteger maxPriorityFeePerGas = parseBigInt(envelop.getGasTipCap());
        BigInteger maxFeePerGas = parseBigInt(envelop.getGasFeeCap());
        List<AccessListObject> accessList = toAccessList(envelop);
        List<SetCodeAuthorization> authList = envelop.getSetCodeAuthList() != null
                ? envelop.getSetCodeAuthList() : Collections.emptyList();

        List<RlpType> fields = new ArrayList<>();
        fields.add(RlpString.create(evmChainId));
        fields.add(RlpString.create(nonce));
        fields.add(RlpString.create(maxPriorityFeePerGas));
        fields.add(RlpString.create(maxFeePerGas));
        fields.add(RlpString.create(gasLimit));
        fields.add(to != null
                ? RlpString.create(Numeric.hexStringToByteArray(to))
                : RlpString.create(new byte[0]));
        fields.add(RlpString.create(value));
        fields.add(RlpString.create(dataBytes));
        fields.add(encodeAccessList(accessList));
        fields.add(encodeAuthList(authList));

        byte[] unsignedRlp = RlpEncoder.encode(new RlpList(fields));
        byte[] toHash = ByteBuffer.allocate(1 + unsignedRlp.length)
                .put((byte) 4)
                .put(unsignedRlp)
                .array();
        byte[] hash = Hash.sha3(toHash);

        Sign.SignatureData sig = Sign.signMessage(hash, keyPair, false);
        // web3j returns v = recId + 27; for the tx RLP yParity = v - 27
        int yParity = (sig.getV()[0] & 0xff) - 27;

        List<RlpType> signedFields = new ArrayList<>(fields);
        signedFields.add(RlpString.create((long) yParity));
        signedFields.add(RlpString.create(new BigInteger(1, sig.getR())));
        signedFields.add(RlpString.create(new BigInteger(1, sig.getS())));

        byte[] signedRlp = RlpEncoder.encode(new RlpList(signedFields));
        byte[] rawEthTx = ByteBuffer.allocate(1 + signedRlp.length)
                .put((byte) 4)
                .put(signedRlp)
                .array();

        return new SignResult(rawEthTx, buildIotexSig(sig));
    }

    private static SignResult finishSign(RawTransaction rawTx, ECKeyPair keyPair) {
        byte[] unsigned = TransactionEncoder.encode(rawTx);
        byte[] hash = Hash.sha3(unsigned);
        Sign.SignatureData sig = Sign.signMessage(hash, keyPair, false);
        byte[] rawEthTx = TransactionEncoder.encode(rawTx, sig);
        return new SignResult(rawEthTx, buildIotexSig(sig));
    }

    private static byte[] buildIotexSig(Sign.SignatureData sig) {
        byte[] iotexSig = new byte[65];
        System.arraycopy(sig.getR(), 0, iotexSig, 0, 32);
        System.arraycopy(sig.getS(), 0, iotexSig, 32, 32);
        iotexSig[64] = sig.getV()[0]; // 27 or 28
        return iotexSig;
    }

    private static RlpList encodeAccessList(List<AccessListObject> accessList) {
        List<RlpType> entries = new ArrayList<>();
        for (AccessListObject entry : accessList) {
            List<RlpType> entryFields = new ArrayList<>();
            entryFields.add(RlpString.create(Numeric.hexStringToByteArray(entry.getAddress())));
            List<RlpType> keys = new ArrayList<>();
            if (entry.getStorageKeys() != null) {
                for (String key : entry.getStorageKeys()) {
                    keys.add(RlpString.create(Numeric.hexStringToByteArray(key)));
                }
            }
            entryFields.add(new RlpList(keys));
            entries.add(new RlpList(entryFields));
        }
        return new RlpList(entries);
    }

    private static RlpList encodeAuthList(List<SetCodeAuthorization> authList) {
        List<RlpType> entries = new ArrayList<>();
        for (SetCodeAuthorization auth : authList) {
            List<RlpType> e = new ArrayList<>();
            e.add(RlpString.create((long) ChainIdUtils.toEvmChainId(auth.getChainID())));
            e.add(RlpString.create(auth.getAddress() != null ? auth.getAddress() : new byte[0]));
            e.add(RlpString.create((long) auth.getNonce()));
            e.add(RlpString.create((long) auth.getV()));
            e.add(auth.getR() != null ? RlpString.create(auth.getR()) : RlpString.create(new byte[0]));
            e.add(auth.getS() != null ? RlpString.create(auth.getS()) : RlpString.create(new byte[0]));
            entries.add(new RlpList(e));
        }
        return new RlpList(entries);
    }

    private static String toAddress(Envelop envelop) {
        String addr = null;
        if (envelop.getTransfer() != null) {
            addr = envelop.getTransfer().getRecipient();
        } else if (envelop.getExecution() != null) {
            addr = envelop.getExecution().getContract();
        }
        return (addr == null || addr.isEmpty()) ? null : IoAddressConverter.toHex(addr);
    }

    private static BigInteger toValue(Envelop envelop) {
        String amount = null;
        if (envelop.getTransfer() != null) {
            amount = envelop.getTransfer().getAmount();
        } else if (envelop.getExecution() != null) {
            amount = envelop.getExecution().getAmount();
        }
        return parseBigInt(amount);
    }

    private static String toDataHex(Envelop envelop) {
        byte[] bytes = toDataBytes(envelop);
        return bytes.length == 0 ? "" : Numeric.toHexString(bytes);
    }

    private static byte[] toDataBytes(Envelop envelop) {
        ByteString bs = null;
        if (envelop.getTransfer() != null) {
            bs = envelop.getTransfer().getPayload();
        } else if (envelop.getExecution() != null) {
            bs = envelop.getExecution().getData();
        }
        return (bs != null && !bs.isEmpty()) ? bs.toByteArray() : new byte[0];
    }

    private static List<AccessListObject> toAccessList(Envelop envelop) {
        if (envelop.getAccessList() == null || envelop.getAccessList().isEmpty()) {
            return Collections.emptyList();
        }
        List<AccessListObject> list = new ArrayList<>();
        for (com.github.iotexproject.grpc.types.AccessTuple tuple : envelop.getAccessList()) {
            list.add(new AccessListObject(tuple.getAddress(), tuple.getStorageKeysList()));
        }
        return list;
    }

    private static BigInteger parseBigInt(String s) {
        return (s == null || s.isEmpty() || "0".equals(s)) ? BigInteger.ZERO : new BigInteger(s);
    }

    private EthTypedTxSigner() {}
}
