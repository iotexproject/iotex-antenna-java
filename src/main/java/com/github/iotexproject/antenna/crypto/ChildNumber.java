package com.github.iotexproject.antenna.crypto;

import java.util.Locale;

/**
 * ChildNumber
 *
 * @author Yang XuePing
 */
public class ChildNumber implements Comparable<ChildNumber> {
    public static final int HARDENED_BIT = 0x80000000;

    public static final ChildNumber ZERO = new ChildNumber(0);
    public static final ChildNumber ZERO_HARDENED = new ChildNumber(0, true);
    public static final ChildNumber ONE = new ChildNumber(1);
    public static final ChildNumber ONE_HARDENED = new ChildNumber(1, true);

    private final int i;

    public ChildNumber(int childNumber, boolean isHardened) {
        if (hasHardenedBit(childNumber))
            throw new IllegalArgumentException("Most significant bit is reserved and shouldn't be set: " + childNumber);
        i = isHardened ? (childNumber | HARDENED_BIT) : childNumber;
    }

    public ChildNumber(int i) {
        this.i = i;
    }

    private static boolean hasHardenedBit(int a) {
        return (a & HARDENED_BIT) != 0;
    }

    public int getI() {
        return i;
    }

    public int i() {
        return i;
    }

    public boolean isHardened() {
        return hasHardenedBit(i);
    }

    public int num() {
        return i & (~HARDENED_BIT);
    }

    @Override
    public String toString() {
        return String.format(Locale.US, "%d%s", num(), isHardened() ? "H" : "");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        return i == ((ChildNumber) o).i;
    }

    @Override
    public int hashCode() {
        return i;
    }

    @Override
    public int compareTo(ChildNumber other) {
        // note that in this implementation compareTo() is not consistent with equals()
        return Integer.compare(this.num(), other.num());
    }
}
