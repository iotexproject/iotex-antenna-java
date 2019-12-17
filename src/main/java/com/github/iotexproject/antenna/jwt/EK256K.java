package com.github.iotexproject.antenna.jwt;

import com.github.iotexproject.antenna.account.Account;
import com.github.iotexproject.antenna.account.IotexAccount;
import com.github.iotexproject.antenna.utils.Numeric;
import com.google.common.base.Charsets;
import com.google.gson.Gson;
import org.apache.commons.codec.binary.Base64;

import java.util.Map;

public class EK256K {
    private static Gson gson = new Gson();
    private static String header = "{\"alg\":\"EK256K\",\"typ\":\"JWT\"}";

    public static String sign(String payloadJson, String privateKey) {
        Account account = IotexAccount.create(privateKey);

        String headerEnc = base64URLDecode(header.getBytes(Charsets.UTF_8));
        String payloadEnc = base64URLDecode(payloadJson.getBytes(Charsets.UTF_8));
        String signature = base64URLDecode(account.sign((headerEnc + "." + payloadEnc).getBytes(Charsets.UTF_8)));

        return headerEnc + "." + payloadEnc + "." + signature;
    }

    public static String verify(String token) {
        String[] segments = token.split("\\.");

        if (segments.length != 3) {
            throw new RuntimeException("token invalid");
        }

        String header = new String(Base64.decodeBase64(segments[0]));
        if (!header.contains("\"alg\":\"EK256K\"")) {
            throw new RuntimeException("alg should be EK256K");
        }

        String payload = new String(Base64.decodeBase64(segments[1]));
        byte[] signature = Base64.decodeBase64(segments[2]);

        IotexAccount empty = (IotexAccount) IotexAccount.create("");
        String recoveredAddress = empty.recover(signature, (segments[0] + "." + segments[1]).getBytes());

        String secretOrPublicKey = extractFromPayload(payload, "iss").toString();
        String expectedAddress = IotexAccount.computeAddress(Numeric.toBigInt(secretOrPublicKey));
        if (!recoveredAddress.equals(expectedAddress)) {
            throw new RuntimeException(recoveredAddress + " signed the signature but we are expecting " + expectedAddress);
        }

        return payload;
    }

    private static String base64URLDecode(byte[] data) {
        return new String(Base64.encodeBase64URLSafe(data));
    }

    public static Object extractFromPayload(String payloadJson, String key) {
        Map<String, Object> payload = gson.fromJson(payloadJson, Map.class);
        return payload.get(key);
    }
}
