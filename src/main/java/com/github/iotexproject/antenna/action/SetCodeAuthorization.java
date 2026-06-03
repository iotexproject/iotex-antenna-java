package com.github.iotexproject.antenna.action;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigInteger;

/**
 * EIP-7702 authorization tuple using IoTeX chain IDs (1=mainnet, 2=testnet, 3=nightly).
 * The chain ID is mapped to the EVM network ID before submission.
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SetCodeAuthorization {
    private int chainID;  // IoTeX chain ID: 1=mainnet, 2=testnet, 3=nightly
    private byte[] address;
    private long nonce;
    private int v;        // EIP-7702 recovery ID: 0 or 1
    private BigInteger r;
    private BigInteger s;
}
