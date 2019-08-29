package com.github.iotexproject.antenna.token;

import java.util.Map;

/**
 * decoded method result.
 *
 * @author Yang XuePing
 */
public final class DecodedMethod {
    private String method;

    private Map<String, Object> data;

    public DecodedMethod(String method, Map<String, Object> data) {
        this.method = method;
        this.data = data;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public Map<String, Object> getData() {
        return data;
    }

    public void setData(Map<String, Object> data) {
        this.data = data;
    }
}
