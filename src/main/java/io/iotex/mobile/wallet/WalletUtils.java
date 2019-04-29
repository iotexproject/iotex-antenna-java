package io.iotex.mobile.wallet;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.iotex.mobile.crypto.ECKeyPair;

import java.io.IOException;

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

    public static WalletFile createWalletFileByKey(String password, ECKeyPair keyPair) {
        return Wallet.createStandard(password, keyPair);
    }

    public static ECKeyPair loadKeyFromWalletFile(String password, String keystore) {
        try {
            WalletFile walletFile = objectMapper.readValue(keystore, WalletFile.class);
            return Wallet.decrypt(password, walletFile);
        } catch (IOException e) {
            throw new RuntimeException("read keystore json error", e);
        }
    }
}
