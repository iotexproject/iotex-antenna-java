package com.github.iotexproject.antenna.action;

import java.io.ByteArrayOutputStream;

final class IoAddressConverter {
    private static final String CHARSET = "qpzry9x8gf2tvdw0s3jn54khce6mua7l";

    // Converts an io1... bech32 address or a 0x... hex address to lowercase 0x hex.
    static String toHex(String addr) {
        if (addr == null || addr.isEmpty()) {
            throw new IllegalArgumentException("null or empty address");
        }
        if (addr.startsWith("0x") || addr.startsWith("0X")) {
            return addr.toLowerCase();
        }
        // bech32: hrp "io" + separator "1" + 32 data chars + 6 checksum chars = 41 chars total
        int sepIdx = addr.lastIndexOf('1');
        if (sepIdx < 1) {
            throw new IllegalArgumentException("invalid bech32 address: " + addr);
        }
        String hrp = addr.substring(0, sepIdx);
        if (!"io".equals(hrp)) {
            throw new IllegalArgumentException("unexpected bech32 hrp '" + hrp + "', expected 'io'");
        }
        String rest = addr.substring(sepIdx + 1); // data + checksum (38 chars for 20-byte payload)
        if (rest.length() < 38) {
            throw new IllegalArgumentException("invalid io address length: " + addr);
        }
        // take first 32 5-bit data chars (ignore 6-char checksum)
        String dataChars = rest.substring(0, 32);
        byte[] fiveBit = new byte[32];
        for (int i = 0; i < 32; i++) {
            int idx = CHARSET.indexOf(dataChars.charAt(i));
            if (idx < 0) {
                throw new IllegalArgumentException("invalid bech32 char '" + dataChars.charAt(i) + "' in: " + addr);
            }
            fiveBit[i] = (byte) idx;
        }
        byte[] bytes = convertBits(fiveBit, 5, 8, false);
        StringBuilder sb = new StringBuilder("0x");
        for (byte b : bytes) {
            sb.append(String.format("%02x", b & 0xff));
        }
        return sb.toString();
    }

    private static byte[] convertBits(byte[] data, int fromBits, int toBits, boolean pad) {
        int acc = 0, bits = 0;
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        int maxv = (1 << toBits) - 1;
        for (byte value : data) {
            acc = (acc << fromBits) | (value & ((1 << fromBits) - 1));
            bits += fromBits;
            while (bits >= toBits) {
                bits -= toBits;
                out.write((acc >> bits) & maxv);
            }
        }
        if (pad && bits > 0) {
            out.write((acc << (toBits - bits)) & maxv);
        }
        return out.toByteArray();
    }

    private IoAddressConverter() {}
}
