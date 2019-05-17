package io.iotex.mobile.utils;

import org.junit.Assert;
import org.junit.Test;

/**
 * convert test.
 *
 * @author Yang XuePing
 */
public class ConvertTest {
    @Test
    public void testFromRau() {
        String rau = "2002000000000000000";
        Assert.assertEquals(Convert.fromRau(rau, Convert.Unit.Rau), "2002000000000000000");
        Assert.assertEquals(Convert.fromRau(rau, Convert.Unit.KRau), "2002000000000000");
        Assert.assertEquals(Convert.fromRau(rau, Convert.Unit.MRau), "2002000000000");
        Assert.assertEquals(Convert.fromRau(rau, Convert.Unit.GRau), "2002000000");
        Assert.assertEquals(Convert.fromRau(rau, Convert.Unit.Qev), "2002000");
        Assert.assertEquals(Convert.fromRau(rau, Convert.Unit.Jing), "2002");
        Assert.assertEquals(Convert.fromRau(rau, Convert.Unit.Iotx), "2.002");
    }

    @Test
    public void testToRau() {
        String rau = "2002000000000000000";
        Assert.assertEquals(Convert.toRau("2002000000000000000", Convert.Unit.Rau), rau);
        Assert.assertEquals(Convert.toRau("2002000000000000", Convert.Unit.KRau), rau);
        Assert.assertEquals(Convert.toRau("2002000000000", Convert.Unit.MRau), rau);
        Assert.assertEquals(Convert.toRau("2002000000", Convert.Unit.GRau), rau);
        Assert.assertEquals(Convert.toRau("2002000", Convert.Unit.Qev), rau);
        Assert.assertEquals(Convert.toRau("2002", Convert.Unit.Jing), rau);
        Assert.assertEquals(Convert.toRau("2.002", Convert.Unit.Iotx), rau);
        Assert.assertEquals(Convert.toRau("10000.002", Convert.Unit.Iotx), "10000002000000000000000");
    }
}
