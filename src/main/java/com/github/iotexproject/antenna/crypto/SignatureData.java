package com.github.iotexproject.antenna.crypto;

/**
 * signature data.
 *
 * @author Yang XuePing
 */
public class SignatureData {
    private final byte v;
    private final byte[] r;
    private final byte[] s;

    public SignatureData(byte v, byte[] r, byte[] s) {
        this.v = v;
        this.r = r;
        this.s = s;
    }

    public byte getV() {
        return v;
    }

    public byte[] getR() {
        return r;
    }

    public byte[] getS() {
        return s;
    }
}
