package com.github.iotexproject.antenna.account;

/**
 * Account interface.
 *
 * @author Yang XuePing
 */
public interface Account {
    /**
     * get private key hex.
     *
     * @return
     */
    byte[] privateKey();

    /**
     * get public key hex.
     *
     * @return
     */
    byte[] publicKey();

    /**
     * get account address.
     *
     * @return
     */
    String address();

    /**
     * sign data.
     *
     * @param data
     * @return
     */
    byte[] sign(byte[] data);
}
