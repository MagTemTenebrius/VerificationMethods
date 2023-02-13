package ru.tenebrius;

import java.math.BigDecimal;

public class Task3 {
    private static boolean isNumeric(String number) {
        for (int i = 0; i < number.length(); i++)
            if (!Character.isDigit(number.charAt(i)))
                return false;
        return true;
    }

    public static String startGame(String a, String b) {
        if (!isNumeric(a) || !isNumeric(b))
            return null;
        BigDecimal first = new BigDecimal(a);
        BigDecimal second = new BigDecimal(b);
        return first.compareTo(second) > 0 ? "loose" : "win";
    }
}
