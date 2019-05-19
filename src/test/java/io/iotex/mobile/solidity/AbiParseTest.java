package io.iotex.mobile.solidity;

import io.iotex.mobile.utils.Numeric;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Yang XuePing
 */
public class AbiParseTest {
    public static final String CONTRACT_WITH_CONSTRUCTOR = "[{\"constant\":false,\"inputs\":[{\"name\":\"x\",\"type\":\"uint256\"}],\"name\":\"set\",\"outputs\":[],\"payable\":false,\"stateMutability\":\"nonpayable\",\"type\":\"function\"},{\"constant\":true,\"inputs\":[],\"name\":\"get\",\"outputs\":[{\"name\":\"\",\"type\":\"uint256\"}],\"payable\":false,\"stateMutability\":\"view\",\"type\":\"function\"},{\"inputs\":[{\"name\":\"_x\",\"type\":\"uint256\"}],\"payable\":false,\"stateMutability\":\"nonpayable\",\"type\":\"constructor\"}]";

    public static final String CONTRACT_NO_CONSTRUCTOR = "[{\"constant\":false,\"inputs\":[{\"name\":\"x\",\"type\":\"uint256\"}],\"name\":\"set\",\"outputs\":[],\"payable\":false,\"stateMutability\":\"nonpayable\",\"type\":\"function\"},{\"constant\":true,\"inputs\":[],\"name\":\"get\",\"outputs\":[{\"name\":\"\",\"type\":\"uint256\"}],\"payable\":false,\"stateMutability\":\"view\",\"type\":\"function\"}]";

    @Test
    public void testFromJson() {
        Abi abi = Abi.fromJson(CONTRACT_NO_CONSTRUCTOR);
        Abi.Constructor constructor = abi.findConstructor();
        assertNull(constructor);
        Abi.Function set = abi.findFunction("set");
        assertNotNull(set);
        assertEquals("60fe47b1000000000000000000000000000000000000000000000000000000000000000a", Numeric.toHexString(set.encode(10)));

        abi = Abi.fromJson(CONTRACT_WITH_CONSTRUCTOR);
        constructor = abi.findConstructor();
        assertNotNull(constructor);
        assertEquals("000000000000000000000000000000000000000000000000000000000000000a", Numeric.toHexString(constructor.encode(10)));
    }
}
