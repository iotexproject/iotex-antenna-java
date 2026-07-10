package com.github.iotexproject.antenna.action;

import org.junit.Assert;
import org.junit.Test;

public class ChainIdUtilsTest {

    @Test
    public void testToEvmChainId() {
        Assert.assertEquals(4689, ChainIdUtils.toEvmChainId(1));
        Assert.assertEquals(4690, ChainIdUtils.toEvmChainId(2));
        Assert.assertEquals(4691, ChainIdUtils.toEvmChainId(3));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testToEvmChainId_Zero() {
        ChainIdUtils.toEvmChainId(0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testToEvmChainId_TooLarge() {
        ChainIdUtils.toEvmChainId(4);
    }
}
