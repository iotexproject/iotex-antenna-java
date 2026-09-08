package com.github.iotexproject.antenna.live;

import com.github.iotexproject.antenna.account.Account;
import com.github.iotexproject.antenna.account.IotexAccount;
import com.github.iotexproject.antenna.action.method.SetVoterRewardDestinationMethod;
import com.github.iotexproject.antenna.action.method.SetVoterRewardOptInMethod;
import com.github.iotexproject.antenna.protocol.SetVoterRewardDestinationRequest;
import com.github.iotexproject.antenna.protocol.SetVoterRewardOptInRequest;
import com.github.iotexproject.antenna.rpc.RPCMethod;
import com.github.iotexproject.antenna.utils.Numeric;
import org.junit.Assume;
import org.junit.Before;
import org.junit.Test;

/**
 * Submits both IIP-59 actions to TestNet from Java.
 *
 * Skipped unless IOTEX_TEST_KEY is set, so it is inert in CI and in any
 * checkout without a funded key.
 *
 * The account must NOT be a delegate. SetVoterRewardOptIn is one-way -- the
 * protocol has no counterpart action to opt back out -- so running this against
 * a real delegate would permanently change it. From a non-delegate the action
 * still travels the full path and is rejected by the handler, which is what
 * proves the encoding without the side effect.
 */
public class VoterRewardLiveTest {
    private static final String ENDPOINT = "api.testnet.iotex.one:443";
    private static final int CHAIN_ID = 2;

    private RPCMethod rpc;
    private Account account;

    @Before
    public void init() {
        String key = System.getenv("IOTEX_TEST_KEY");
        Assume.assumeTrue("IOTEX_TEST_KEY unset; skipping live test", key != null && !key.isEmpty());
        this.rpc = new RPCMethod(ENDPOINT, true, CHAIN_ID);
        this.account = IotexAccount.create(Numeric.hexStringToByteArray(key));
    }

    /**
     * Safe to execute for real: the destination is reversible -- passing your
     * own address clears it -- and the sender only ever redirects its own
     * rewards.
     */
    @Test
    public void setVoterRewardDestinationIsAccepted() {
        SetVoterRewardDestinationRequest req = new SetVoterRewardDestinationRequest();
        req.setAccount(account);
        req.setGasLimit(200000L);
        req.setGasPrice("1000000000000");
        req.setRecipient(account.address());

        String hash = new SetVoterRewardDestinationMethod(rpc, req).execute();
        System.out.println("  SetVoterRewardDestination 已上链: " + hash);
        org.junit.Assert.assertNotNull(hash);
        org.junit.Assert.assertFalse(hash.isEmpty());
    }

    /**
     * Expected to be rejected by the staking handler, not by the decoder. A
     * decode failure would read "no applicable action to handle proto type";
     * anything mentioning the candidate means the action reached the handler,
     * which is the whole point.
     */
    @Test
    public void setVoterRewardOptInReachesTheHandler() {
        SetVoterRewardOptInRequest req = new SetVoterRewardOptInRequest();
        req.setAccount(account);
        req.setGasLimit(200000L);
        req.setGasPrice("1000000000000");

        try {
            String hash = new SetVoterRewardOptInMethod(rpc, req).execute();
            System.out.println("  SetVoterRewardOptIn 已上链: " + hash);
        } catch (Exception e) {
            String msg = String.valueOf(e.getMessage());
            System.out.println("  SetVoterRewardOptIn 节点回应: " + msg);
            org.junit.Assert.assertFalse(
                    "action was not decoded -- the wrapper files it under the wrong field: " + msg,
                    msg.contains("no applicable action to handle proto type"));
        }
    }
}
