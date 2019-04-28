package io.iotex.mobile.wallet;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
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
    private static final ObjectMapper objectMapper = new ObjectMapper();

    static {
        objectMapper.configure(JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES, true);
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
    }

    public static String generateWalletFileJson(String password, ECKeyPair keyPair) {
        WalletFile walletFile = Wallet.createStandard(password, keyPair);
        return toWalletFileJson(walletFile);
    }

    public static String toWalletFileJson(WalletFile walletFile) {
        try {
            return objectMapper.writeValueAsString(walletFile);
        } catch (JsonProcessingException e) {
            throw new RuntimeException("write wallet file to json error", e);
        }
    }

    public static ECKeyPair loadKeystore(String password, String keystore) {
        try {
            WalletFile walletFile = objectMapper.readValue(keystore, WalletFile.class);
            return Wallet.decrypt(password, walletFile);
        } catch (IOException e) {
            throw new RuntimeException("read keystore json error", e);
        }
    }
}
