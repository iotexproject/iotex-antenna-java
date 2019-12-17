package com.github.iotexproject.antenna.jwt;

import com.google.gson.Gson;
import org.junit.Assert;
import org.junit.Test;

import java.util.LinkedHashMap;
import java.util.Map;

public class EK256KTest {
    static Gson gson = new Gson();

    @Test
    public void testSign() {
        Map<String, Object> payload = new LinkedHashMap<>();
        payload.put("iss", "044e18306ae9ef4ec9d07bf6e705442d4d1a75e6cdf750330ca2d880f2cc54607c9c33deb9eae9c06e06e04fe9ce3d43962cc67d5aa34fbeb71270d4bad3d648d9");
        payload.put("jti", "5d76d2e9ff7cf238522ef71e");
        payload.put("sub", "5b7a6d21dc6e35e14574d052");
        payload.put("exp", 1575844329);
        payload.put("iat", 1568068329);

        String payloadJson = gson.toJson(payload);

        String token = EK256K.sign(payloadJson, "0806c458b262edd333a191e92f561aff338211ee3e18ab315a074a2d82aa343f");

        Assert.assertEquals("eyJhbGciOiJFSzI1NksiLCJ0eXAiOiJKV1QifQ.eyJpc3MiOiIwNDRlMTgzMDZhZTllZjRlYzlkMDdiZjZlNzA1NDQyZDRkMWE3NWU2Y2RmNzUwMzMwY2EyZDg4MGYyY2M1NDYwN2M5YzMzZGViOWVhZTljMDZlMDZlMDRmZTljZTNkNDM5NjJjYzY3ZDVhYTM0ZmJlYjcxMjcwZDRiYWQzZDY0OGQ5IiwianRpIjoiNWQ3NmQyZTlmZjdjZjIzODUyMmVmNzFlIiwic3ViIjoiNWI3YTZkMjFkYzZlMzVlMTQ1NzRkMDUyIiwiZXhwIjoxNTc1ODQ0MzI5LCJpYXQiOjE1NjgwNjgzMjl9.rC2Vh6J-Xk0N2iHTfzuthVdejQtD_HnV770eLAMBGGgS4YZfW7F_i4pR2FusINtlXxhss5XKYL-NFYCuh_2N0gA",
                token);
    }

    @Test
    public void testVerify() {
        Map<String, Object> payload = new LinkedHashMap<>();
        payload.put("iss", "044e18306ae9ef4ec9d07bf6e705442d4d1a75e6cdf750330ca2d880f2cc54607c9c33deb9eae9c06e06e04fe9ce3d43962cc67d5aa34fbeb71270d4bad3d648d9");
        payload.put("jti", "5d76d2e9ff7cf238522ef71e");
        payload.put("sub", "5b7a6d21dc6e35e14574d052");
        payload.put("exp", 1575844329);
        payload.put("iat", 1568068329);

        String payloadJson = gson.toJson(payload);

        Assert.assertEquals(payloadJson, EK256K.verify("eyJhbGciOiJFSzI1NksiLCJ0eXAiOiJKV1QifQ.eyJpc3MiOiIwNDRlMTgzMDZhZTllZjRlYzlkMDdiZjZlNzA1NDQyZDRkMWE3NWU2Y2RmNzUwMzMwY2EyZDg4MGYyY2M1NDYwN2M5YzMzZGViOWVhZTljMDZlMDZlMDRmZTljZTNkNDM5NjJjYzY3ZDVhYTM0ZmJlYjcxMjcwZDRiYWQzZDY0OGQ5IiwianRpIjoiNWQ3NmQyZTlmZjdjZjIzODUyMmVmNzFlIiwic3ViIjoiNWI3YTZkMjFkYzZlMzVlMTQ1NzRkMDUyIiwiZXhwIjoxNTc1ODQ0MzI5LCJpYXQiOjE1NjgwNjgzMjl9.rC2Vh6J-Xk0N2iHTfzuthVdejQtD_HnV770eLAMBGGgS4YZfW7F_i4pR2FusINtlXxhss5XKYL-NFYCuh_2N0gA"));
    }
}
