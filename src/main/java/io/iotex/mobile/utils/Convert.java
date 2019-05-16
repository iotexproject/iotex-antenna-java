package io.iotex.mobile.utils;

import java.math.BigDecimal;

/**
 * convert utils.
 *
 * @author Yang XuePing
 */
public final class Convert {
    private Convert() {
    }

    public static BigDecimal fromRau(String number, Unit unit) {
        return fromRau(new BigDecimal(number), unit);
    }

    public static BigDecimal fromRau(BigDecimal number, Unit unit) {
        return number.divide(unit.getWeiFactor());
    }

    public static BigDecimal toRau(String number, Unit unit) {
        return toRau(new BigDecimal(number), unit);
    }

    public static BigDecimal toRau(BigDecimal number, Unit unit) {
        return number.multiply(unit.getWeiFactor());
    }

    public enum Unit {
        Rau("Rau", 0),
        KRau("KRau", 3),
        MRau("MRau", 6),
        GRau("GRau", 9),
        Qev("Qev", 12),
        Jing("Jing", 15),
        Iotx("Iotx", 18);

        private String name;
        private BigDecimal weiFactor;

        Unit(String name, int factor) {
            this.name = name;
            this.weiFactor = BigDecimal.TEN.pow(factor);
        }

        public static Unit fromString(String name) {
            if (name != null) {
                for (Unit unit : Unit.values()) {
                    if (name.equalsIgnoreCase(unit.name)) {
                        return unit;
                    }
                }
            }
            return Unit.valueOf(name);
        }

        public BigDecimal getWeiFactor() {
            return weiFactor;
        }

        @Override
        public String toString() {
            return name;
        }
    }
}
}
