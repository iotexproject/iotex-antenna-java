package io.iotex.mobile.contract;

import io.iotex.mobile.account.Account;
import io.iotex.mobile.account.IotexAccount;
import io.iotex.mobile.account.IotexAccountTest;
import io.iotex.mobile.rpc.RPCMethod;
import io.iotex.mobile.solidity.Abi;
import io.iotex.mobile.utils.Numeric;
import org.junit.Test;

import java.math.BigInteger;
import java.util.List;

import static io.iotex.mobile.rpc.RPCMethodTest.IOTEX_CORE;
import static io.iotex.mobile.solidity.AbiParseTest.CONTRACT_WITH_CONSTRUCTOR_ABI;
import static io.iotex.mobile.solidity.AbiParseTest.CONTRACT_WITH_CONSTRUCTOR_BIN;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * contract test.
 *
 * @author Yang XuePing
 */
public class ContractTest {
    private static final String ERC20_ABI = "[{\"constant\":true,\"inputs\":[],\"name\":\"name\",\"outputs\":[{\"name\":\"\",\"type\":\"string\"}],\"payable\":false,\"stateMutability\":\"view\",\"type\":\"function\"},{\"constant\":false,\"inputs\":[{\"name\":\"spender\",\"type\":\"address\"},{\"name\":\"tokens\",\"type\":\"uint256\"}],\"name\":\"approve\",\"outputs\":[{\"name\":\"success\",\"type\":\"bool\"}],\"payable\":false,\"stateMutability\":\"nonpayable\",\"type\":\"function\"},{\"constant\":true,\"inputs\":[],\"name\":\"totalSupply\",\"outputs\":[{\"name\":\"\",\"type\":\"uint256\"}],\"payable\":false,\"stateMutability\":\"view\",\"type\":\"function\"},{\"constant\":false,\"inputs\":[{\"name\":\"from\",\"type\":\"address\"},{\"name\":\"to\",\"type\":\"address\"},{\"name\":\"tokens\",\"type\":\"uint256\"}],\"name\":\"transferFrom\",\"outputs\":[{\"name\":\"success\",\"type\":\"bool\"}],\"payable\":false,\"stateMutability\":\"nonpayable\",\"type\":\"function\"},{\"constant\":true,\"inputs\":[],\"name\":\"decimals\",\"outputs\":[{\"name\":\"\",\"type\":\"uint8\"}],\"payable\":false,\"stateMutability\":\"view\",\"type\":\"function\"},{\"constant\":true,\"inputs\":[{\"name\":\"tokenOwner\",\"type\":\"address\"}],\"name\":\"balanceOf\",\"outputs\":[{\"name\":\"balance\",\"type\":\"uint256\"}],\"payable\":false,\"stateMutability\":\"view\",\"type\":\"function\"},{\"constant\":false,\"inputs\":[],\"name\":\"acceptOwnership\",\"outputs\":[],\"payable\":false,\"stateMutability\":\"nonpayable\",\"type\":\"function\"},{\"constant\":true,\"inputs\":[],\"name\":\"owner\",\"outputs\":[{\"name\":\"\",\"type\":\"address\"}],\"payable\":false,\"stateMutability\":\"view\",\"type\":\"function\"},{\"constant\":true,\"inputs\":[],\"name\":\"symbol\",\"outputs\":[{\"name\":\"\",\"type\":\"string\"}],\"payable\":false,\"stateMutability\":\"view\",\"type\":\"function\"},{\"constant\":false,\"inputs\":[{\"name\":\"to\",\"type\":\"address\"},{\"name\":\"tokens\",\"type\":\"uint256\"}],\"name\":\"transfer\",\"outputs\":[{\"name\":\"success\",\"type\":\"bool\"}],\"payable\":false,\"stateMutability\":\"nonpayable\",\"type\":\"function\"},{\"constant\":false,\"inputs\":[{\"name\":\"spender\",\"type\":\"address\"},{\"name\":\"tokens\",\"type\":\"uint256\"},{\"name\":\"data\",\"type\":\"bytes\"}],\"name\":\"approveAndCall\",\"outputs\":[{\"name\":\"success\",\"type\":\"bool\"}],\"payable\":false,\"stateMutability\":\"nonpayable\",\"type\":\"function\"},{\"constant\":true,\"inputs\":[],\"name\":\"newOwner\",\"outputs\":[{\"name\":\"\",\"type\":\"address\"}],\"payable\":false,\"stateMutability\":\"view\",\"type\":\"function\"},{\"constant\":false,\"inputs\":[{\"name\":\"tokenAddress\",\"type\":\"address\"},{\"name\":\"tokens\",\"type\":\"uint256\"}],\"name\":\"transferAnyERC20Token\",\"outputs\":[{\"name\":\"success\",\"type\":\"bool\"}],\"payable\":false,\"stateMutability\":\"nonpayable\",\"type\":\"function\"},{\"constant\":true,\"inputs\":[{\"name\":\"tokenOwner\",\"type\":\"address\"},{\"name\":\"spender\",\"type\":\"address\"}],\"name\":\"allowance\",\"outputs\":[{\"name\":\"remaining\",\"type\":\"uint256\"}],\"payable\":false,\"stateMutability\":\"view\",\"type\":\"function\"},{\"constant\":false,\"inputs\":[{\"name\":\"_newOwner\",\"type\":\"address\"}],\"name\":\"transferOwnership\",\"outputs\":[],\"payable\":false,\"stateMutability\":\"nonpayable\",\"type\":\"function\"},{\"inputs\":[],\"payable\":false,\"stateMutability\":\"nonpayable\",\"type\":\"constructor\"},{\"payable\":true,\"stateMutability\":\"payable\",\"type\":\"fallback\"},{\"anonymous\":false,\"inputs\":[{\"indexed\":true,\"name\":\"_from\",\"type\":\"address\"},{\"indexed\":true,\"name\":\"_to\",\"type\":\"address\"}],\"name\":\"OwnershipTransferred\",\"type\":\"event\"},{\"anonymous\":false,\"inputs\":[{\"indexed\":true,\"name\":\"from\",\"type\":\"address\"},{\"indexed\":true,\"name\":\"to\",\"type\":\"address\"},{\"indexed\":false,\"name\":\"tokens\",\"type\":\"uint256\"}],\"name\":\"Transfer\",\"type\":\"event\"},{\"anonymous\":false,\"inputs\":[{\"indexed\":true,\"name\":\"tokenOwner\",\"type\":\"address\"},{\"indexed\":true,\"name\":\"spender\",\"type\":\"address\"},{\"indexed\":false,\"name\":\"tokens\",\"type\":\"uint256\"}],\"name\":\"Approval\",\"type\":\"event\"}]";

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

    public void testRead() {
        RPCMethod provider = new RPCMethod(IOTEX_CORE);
        Contract contract = new Contract(provider, "io1l4xyuc9t858qgv3xy946avyedf4pryg7hpfzmy", ERC20_ABI);
        List result = contract.read("io13zt8sznez2pf0q0hqdz2hyl938wak2fsjgdeml", "balanceOf", "io13zt8sznez2pf0q0hqdz2hyl938wak2fsjgdeml");
        assertNotNull(result);
    }

    @Test
    public void testDecode() {
        RPCMethod provider = new RPCMethod(IOTEX_CORE);
        Contract contract = new Contract(provider, "io1l4xyuc9t858qgv3xy946avyedf4pryg7hpfzmy", ERC20_ABI);

        Abi.Function function = contract.getFunctionBySignature("a9059cbb");
        assertNotNull(function);

        List result = function.decode(Numeric.hexStringToByteArray("a9059cbb000000000000000000000000b1495e965cb5682e81cc96eeb16892c68eb701b00000000000000000000000000000000000000000000000000000000000002710"));
        assertEquals(result.get(0), "io1k9y4a9juk45zaqwvjmhtz6yjc68twqds4qcvzv");
        assertEquals(result.get(1), BigInteger.valueOf(10000));
    }
}
