package com.github.iotexproject.antenna.live;

import com.github.iotexproject.antenna.account.Account;
import com.github.iotexproject.antenna.account.IotexAccount;
import com.github.iotexproject.antenna.action.method.CandidateUpdateMethod;
import com.github.iotexproject.antenna.protocol.CandidateUpdateRequest;
import com.github.iotexproject.antenna.rpc.RPCMethod;
import com.github.iotexproject.antenna.utils.Numeric;
import com.github.iotexproject.grpc.api.GetReceiptByActionRequest;
import com.github.iotexproject.grpc.api.GetReceiptByActionResponse;
import com.github.iotexproject.grpc.api.GetTransactionLogByBlockHeightRequest;
import com.github.iotexproject.grpc.api.GetTransactionLogByBlockHeightResponse;
import com.github.iotexproject.grpc.types.TransactionLog;
import com.github.iotexproject.grpc.types.TransactionLogType;
import org.junit.Assume;
import org.junit.Before;
import org.junit.Test;

/**
 * candidateUpdate carrying a BLS public key and a proof of possession, sent to
 * a running chain twice: once with a proof bound to the candidate's own owner
 * address, once with a proof bound to a different candidate.
 *
 * The negative case is the point. The unit tests prove the bytes land in
 * CandidateBasicInfo fields 4 and 5, but a wiring that swapped them, truncated
 * one, or lost a 0x prefix would satisfy them too -- and the chain rejects all
 * of those identically. Only the pair separates "accepted" from "verified": a
 * correctly bound proof settles status 1, and one bound elsewhere settles
 * ErrUnauthorizedOperator (203), which is what VerifyBLSPop surfaces.
 *
 * Generate each pair with local-dev/iip59-harness/bin/blspop <candidate-io-addr>.
 * Aim this at a local chain: candidateUpdate rewrites a real delegate's name,
 * operator and reward address.
 */
public class CandidateBLSLiveTest {

    private RPCMethod rpc;
    private Account account;

    @Before
    public void init() {
        String key = System.getenv("IOTEX_TEST_KEY");
        Assume.assumeTrue("IOTEX_TEST_KEY unset; skipping live test",
                key != null && !key.isEmpty());
        Assume.assumeTrue("IOTEX_TEST_BLS_PUB unset; skipping live test",
                notBlank(System.getenv("IOTEX_TEST_BLS_PUB")));
        String endpoint = envOr("IOTEX_TEST_ENDPOINT", "api.testnet.iotex.one:443");
        int chainId = Integer.parseInt(envOr("IOTEX_TEST_CHAINID", "2"));
        boolean secure = !"false".equalsIgnoreCase(envOr("IOTEX_TEST_SECURE", "true"));
        this.rpc = new RPCMethod(endpoint, secure, chainId);
        this.account = IotexAccount.create(Numeric.hexStringToByteArray(key));
    }

    @Test
    public void proofBoundToThisCandidateIsAccepted() throws Exception {
        long status = sendUpdate(System.getenv("IOTEX_TEST_BLS_PUB"), System.getenv("IOTEX_TEST_BLS_POP"));
        org.junit.Assert.assertEquals("correctly bound proof must settle successfully", 1, status);
    }

    @Test
    public void proofBoundElsewhereIsRejected() throws Exception {
        Assume.assumeTrue("IOTEX_TEST_BLS_PUB_WRONG unset",
                notBlank(System.getenv("IOTEX_TEST_BLS_PUB_WRONG")));
        long status = sendUpdate(
                System.getenv("IOTEX_TEST_BLS_PUB_WRONG"), System.getenv("IOTEX_TEST_BLS_POP_WRONG"));
        org.junit.Assert.assertEquals(
                "a proof bound to another candidate must be rejected, not ignored", 203, status);
    }

    /**
     * IIP-59 pays voters out as ordinary transaction logs. It adds no new
     * TransactionLogType -- payouts reuse CLAIM_FROM_REWARDING_FUND -- so what
     * this checks is that the SDK still decodes a settlement block, and that
     * the sender arrives intact: it is the protocol pool pseudo-address
     * io0000000000000000000000rewardingprotocol, which has no 20-byte hash
     * behind it and comes back as an empty string from anything that decodes an
     * address the ordinary way.
     */
    @Test
    public void readsVoterRewardPayoutTransactionLogs() {
        String at = System.getenv("IOTEX_TEST_PAYOUT_HEIGHT");
        Assume.assumeTrue("IOTEX_TEST_PAYOUT_HEIGHT unset", notBlank(at));

        GetTransactionLogByBlockHeightResponse resp = rpc.getTransactionLogByBlockHeight(
                GetTransactionLogByBlockHeightRequest.newBuilder()
                        .setBlockHeight(Long.parseLong(at)).build());

        int payouts = 0;
        for (TransactionLog log : resp.getTransactionLogs().getLogsList()) {
            for (TransactionLog.Transaction tx : log.getTransactionsList()) {
                if (tx.getType() != TransactionLogType.CLAIM_FROM_REWARDING_FUND) {
                    continue;
                }
                payouts++;
                org.junit.Assert.assertFalse("payout sender must not decode to empty",
                        tx.getSender().isEmpty());
                org.junit.Assert.assertFalse("payout recipient must not decode to empty",
                        tx.getRecipient().isEmpty());
                org.junit.Assert.assertNotEquals("0", tx.getAmount());
            }
        }
        System.out.println("  block " + at + ": " + payouts + " voter reward payout logs");
        org.junit.Assert.assertTrue("expected at least one payout log at height " + at, payouts > 0);
    }

    private long sendUpdate(String pub, String pop) throws Exception {
        CandidateUpdateRequest req = new CandidateUpdateRequest();
        req.setAccount(account);
        req.setGasLimit(1000000L);
        req.setGasPrice("1000000000000");
        req.setName(System.getenv("IOTEX_TEST_CAND_NAME"));
        req.setOperatorAddress(System.getenv("IOTEX_TEST_CAND_OPERATOR"));
        req.setRewardAddress(System.getenv("IOTEX_TEST_CAND_REWARD"));
        req.setBlsPubKey(pub);
        req.setBlsPop(pop);

        String hash = new CandidateUpdateMethod(rpc, req).execute();
        System.out.println("  candidateUpdate+BLS " + hash);
        return waitStatus(hash);
    }

    private long waitStatus(String actionHash) throws Exception {
        for (int i = 0; i < 40; i++) {
            Thread.sleep(2000);
            try {
                GetReceiptByActionResponse r = rpc.getReceiptByAction(
                        GetReceiptByActionRequest.newBuilder().setActionHash(actionHash).build());
                long status = r.getReceiptInfo().getReceipt().getStatus();
                System.out.println("    status=" + status
                        + " height=" + r.getReceiptInfo().getReceipt().getBlkHeight());
                return status;
            } catch (Exception ignored) {
                // not mined yet
            }
        }
        throw new AssertionError("no receipt for " + actionHash);
    }

    private static boolean notBlank(String v) {
        return v != null && !v.isEmpty();
    }

    private static String envOr(String name, String fallback) {
        String v = System.getenv(name);
        return v == null || v.isEmpty() ? fallback : v;
    }
}
