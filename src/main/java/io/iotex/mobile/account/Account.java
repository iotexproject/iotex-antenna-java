package io.iotex.mobile.account;

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
    String privateKey();

    /**
     * get public key hex.
     *
     * @return
     */
    String publicKey();

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
