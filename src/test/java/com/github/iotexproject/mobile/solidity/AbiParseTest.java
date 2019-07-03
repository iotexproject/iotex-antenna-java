package com.github.iotexproject.mobile.solidity;

import com.github.iotexproject.mobile.utils.Numeric;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Yang XuePing
 */
public class AbiParseTest {
    public static final String CONTRACT_WITH_CONSTRUCTOR_ABI = "[{\"constant\":false,\"inputs\":[{\"name\":\"x\",\"type\":\"uint256\"}],\"name\":\"set\",\"outputs\":[],\"payable\":false,\"stateMutability\":\"nonpayable\",\"type\":\"function\"},{\"constant\":true,\"inputs\":[],\"name\":\"get\",\"outputs\":[{\"name\":\"\",\"type\":\"uint256\"}],\"payable\":false,\"stateMutability\":\"view\",\"type\":\"function\"},{\"inputs\":[{\"name\":\"_x\",\"type\":\"uint256\"}],\"payable\":false,\"stateMutability\":\"nonpayable\",\"type\":\"constructor\"}]";

    public static final String CONTRACT_WITH_CONSTRUCTOR_BIN = "608060405234801561001057600080fd5b506040516020806100f8833981016040525163ffffffff1660005560bf806100396000396000f30060806040526004361060485763ffffffff7c010000000000000000000000000000000000000000000000000000000060003504166360fe47b18114604d5780636d4ce63c146064575b600080fd5b348015605857600080fd5b5060626004356088565b005b348015606f57600080fd5b506076608d565b60408051918252519081900360200190f35b600055565b600054905600a165627a7a7230582070434fff7e31d93874a701561dedad1299782e7ae9b4038a64d08a7e2c31056e0029";

    public static final String CONTRACT_NO_CONSTRUCTOR_ABI = "[{\"constant\":false,\"inputs\":[{\"name\":\"x\",\"type\":\"uint256\"}],\"name\":\"set\",\"outputs\":[],\"payable\":false,\"stateMutability\":\"nonpayable\",\"type\":\"function\"},{\"constant\":true,\"inputs\":[],\"name\":\"get\",\"outputs\":[{\"name\":\"\",\"type\":\"uint256\"}],\"payable\":false,\"stateMutability\":\"view\",\"type\":\"function\"}]";

    @Test
    public void testFromJson() {
        Abi abi = Abi.fromJson(CONTRACT_NO_CONSTRUCTOR_ABI);
        Abi.Constructor constructor = abi.findConstructor();
        assertNull(constructor);
        Abi.Function set = abi.findFunction("set");
        assertNotNull(set);
        assertEquals("60fe47b1000000000000000000000000000000000000000000000000000000000000000a", Numeric.toHexString(set.encode(10)));

        abi = Abi.fromJson(CONTRACT_WITH_CONSTRUCTOR_ABI);
        constructor = abi.findConstructor();
        assertNotNull(constructor);
        assertEquals("000000000000000000000000000000000000000000000000000000000000000a", Numeric.toHexString(constructor.encode(10)));
    }
}
