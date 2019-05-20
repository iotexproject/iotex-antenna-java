package io.iotex.mobile.contract;

import io.iotex.mobile.account.Account;
import io.iotex.mobile.account.IotexAccount;
import io.iotex.mobile.account.IotexAccountTest;
import io.iotex.mobile.rpc.RPCMethod;
import io.iotex.mobile.utils.Numeric;
import org.junit.Test;

import static io.iotex.mobile.rpc.RPCMethodTest.IOTEX_CORE;
import static io.iotex.mobile.solidity.AbiParseTest.CONTRACT_WITH_CONSTRUCTOR_ABI;
import static io.iotex.mobile.solidity.AbiParseTest.CONTRACT_WITH_CONSTRUCTOR_BIN;
import static org.junit.Assert.assertNotNull;

/**
 * contract test.
 *
 * @author Yang XuePing
 */
public class ContractTest {
    @Test
    public void testDeploy() {
        RPCMethod provider = new RPCMethod(IOTEX_CORE);
        Account account = IotexAccount.create(IotexAccountTest.TEST_PRIVATE);

        Contract contract = new Contract(provider, CONTRACT_WITH_CONSTRUCTOR_ABI, Numeric.hexStringToByteArray(CONTRACT_WITH_CONSTRUCTOR_BIN));
        String hash = contract.deploy(null, 100000l, "1000000000000", account, "0", 5);
        assertNotNull(hash);
    }

    @Test
    public void testExecute() {
        RPCMethod provider = new RPCMethod(IOTEX_CORE);
        Account account = IotexAccount.create(IotexAccountTest.TEST_PRIVATE);

        Contract contract = new Contract(provider, "io1tzevj29d4fsxet3a8gthhz9v4rmqc730myt0q4", CONTRACT_WITH_CONSTRUCTOR_ABI);
        String hash = contract.execute(null, 100000l, "1000000000000", account, "set", "0", 10);
        assertNotNull(hash);
    }
}
