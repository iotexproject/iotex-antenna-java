package com.github.iotexproject.antenna.action;

public final class ChainIdUtils {
    private static final int OFFSET = 4688;

    public static int toEvmChainId(int iotexChainId) {
        if (iotexChainId < 1 || iotexChainId > 3) {
            throw new IllegalArgumentException("invalid IoTeX chain id: " + iotexChainId);
        }
        return iotexChainId + OFFSET;
    }

    private ChainIdUtils() {}
}
