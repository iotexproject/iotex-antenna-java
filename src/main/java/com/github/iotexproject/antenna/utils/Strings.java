package com.github.iotexproject.antenna.utils;

import java.util.Iterator;
import java.util.List;

/**
 * String utils.
 *
 * @author Yang XuePing
 */
public class Strings {
    public static String zeros(int n) {
        return repeat('0', n);
    }

    public static String repeat(char value, int n) {
        return new String(new char[n]).replace("\0", String.valueOf(value));
    }

    public static boolean isEmpty(String s) {
        return s == null || s.length() == 0;
    }

    public static String join(final List list, final String separator) {
        Iterator<?> iterator = list.iterator();

        final Object first = iterator.next();
        if (!iterator.hasNext()) {
            return first.toString();
        }

        final StringBuilder buf = new StringBuilder();
        if (first != null) {
            buf.append(first.toString());
        }

        while (iterator.hasNext()) {
            buf.append(separator);
            final Object obj = iterator.next();
            if (obj != null) {
                buf.append(obj.toString());
            }
        }

        return buf.toString();
    }

    public static String stripEnd(final String str, final String stripChars) {
        int end;
        if (str == null || (end = str.length()) == 0) {
            return str;
        }

        if (stripChars == null) {
            while (end != 0 && Character.isWhitespace(str.charAt(end - 1))) {
                end--;
            }
        } else if (stripChars.isEmpty()) {
            return str;
        } else {
            while (end != 0 && stripChars.indexOf(str.charAt(end - 1)) != -1) {
                end--;
            }
        }
        return str.substring(0, end);
    }
}
