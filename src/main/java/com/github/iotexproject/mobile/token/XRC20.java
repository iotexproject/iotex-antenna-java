package com.github.iotexproject.mobile.token;

import com.github.iotexproject.mobile.account.Account;
import com.github.iotexproject.mobile.rpc.RPCMethod;

import java.math.BigInteger;
import java.util.List;

/**
 * xrc20 contract.
 *
 * @author Yang XuePing
 */
public class XRC20 extends Token {
    private String name;
    private String symbol;
    private Long decimals;
    private BigInteger totalSupply;

    public XRC20(RPCMethod provider, String contractAddress) {
        super(provider, contractAddress, Abis.XRC20);
    }

    public String name() {
        if (name != null) {
            return name;
        }
        List result = this.contract.read(this.contract.getAddress(), "name");
        if (result.size() > 0) {
            this.name = result.get(0).toString();
            return this.name;
        }
        return "";
    }

    public String symbol() {
        if (symbol != null) {
            return symbol;
        }
        List result = this.contract.read(this.contract.getAddress(), "symbol");
        if (result.size() > 0) {
            this.symbol = result.get(0).toString();
            return this.symbol;
        }
        return "";
    }

    public Long decimals() {
        List result = this.contract.read(this.contract.getAddress(), "decimals");
        if (result.size() > 0) {
            BigInteger bgValue = (BigInteger) result.get(0);
            this.decimals = bgValue.longValue();
            return this.decimals;
        }
        return 0l;
    }

    public BigInteger totalSupply() {
        List result = this.contract.read(this.contract.getAddress(), "totalSupply");
        if (result.size() > 0) {
            this.totalSupply = (BigInteger) result.get(0);
            return this.totalSupply;
        }
        return BigInteger.ZERO;
    }

    public BigInteger balanceOf(String owner) {
        List result = this.contract.read(this.contract.getAddress(), "balanceOf", owner);
        if (result.size() > 0) {
            return (BigInteger) result.get(0);
        }
        return BigInteger.ZERO;
    }

    public String transfer(
            String to,
            BigInteger value,
            Account account,
            String gasPrice,
            Long gasLimit
    ) {
        return this.contract.execute(null, gasLimit, gasPrice, account, "transfer", "0", to, value);
    }

    public String allowance(
            String owner,
            String spender,
            Account account,
            String gasPrice,
            Long gasLimit
    ) {
        return this.contract.execute(null, gasLimit, gasPrice, account, "allowance", "0", owner, spender);
    }

    public String approve(
            String spender,
            BigInteger value,
            Account account,
            String gasPrice,
            Long gasLimit
    ) {
        return this.contract.execute(null, gasLimit, gasPrice, account, "approve", "0", spender, value);
    }

    public String transferFrom(
            String from,
            String to,
            BigInteger value,
            Account account,
            String gasPrice,
            Long gasLimit
    ) {
        return this.contract.execute(null, gasLimit, gasPrice, account, "transferFrom", "0", from, to, value);
    }
}
