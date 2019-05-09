package io.iotex.mobile.wallet;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.math.BigInteger;

/**
 * wallet file utils.
 *
 * @author Yang XuePing
 */
public class WalletUtils {
    static final ObjectMapper objectMapper = new ObjectMapper();

    static {
        objectMapper.configure(JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES, true);
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
    }

    /**
     * create wallet file by private key.
     *
     * @param password   keystore password
     * @param privateKey private key
     * @return
     */
    public static WalletFile createWalletFileByKey(String password, BigInteger privateKey) {
        return Wallet.createStandard(password, privateKey);
    }

    /**
     * load private key from keystore.
     *
     * @param password keystore password
     * @param keystore keystore content
     * @return private key.
     */
    public static BigInteger loadKeyFromWalletFile(String password, String keystore) {
        try {
            WalletFile walletFile = objectMapper.readValue(keystore, WalletFile.class);
            return Wallet.decrypt(password, walletFile);
        } catch (IOException e) {
            throw new RuntimeException("read keystore json error", e);
        }
    }
}
