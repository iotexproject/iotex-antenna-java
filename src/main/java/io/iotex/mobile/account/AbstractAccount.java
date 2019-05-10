package io.iotex.mobile.account;

import io.iotex.mobile.utils.Numeric;

import java.math.BigInteger;

/**
 * abstract account.
 *
 * @author Yang XuePing
 */
public abstract class AbstractAccount implements Account {
    protected BigInteger privateKey;
    protected BigInteger publicKey;
    protected String address;

    @Override
    public byte[] privateKey() {
        return Numeric.toBytesPadded(privateKey, 32);
    }

    @Override
    public String address() {
        return address;
    }
}
