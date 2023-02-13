package ru.tenebrius;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Task1 {
    private static boolean isNumeric(String number) {
        for (int i = 0; i < number.length(); i++)
            if (!Character.isDigit(number.charAt(i)))
                return false;
        return true;
    }

    private static boolean isDoubleNumeric(String number) {
        boolean flag = false;
        for (int i = 0; i < number.length(); i++)
            if (!Character.isDigit(number.charAt(i))) {
                if (number.charAt(i) == '.' && !flag) {
                    flag = true;
                    continue;
                }
                return false;
            }
        return true;
    }

    private static String getResult(boolean a, boolean b, boolean c) {
        char result = 0;
        if (a)
            result++;
        if (b)
            result++;
        if (c)
            result++;
        switch (result) {
            case 0 -> {
                return "разносторонний";
            }
            case 1 -> {
                return "равнобедренный";
            }
            case 2 -> throw new RuntimeException("Impossible");
            case 3 -> {
                return "равносторонний";
            }
        }
        return null;
    }

    public static String checkTriangle(String a, String b, String c) {
        if (!isNumeric(a) || !isNumeric(b) || !isNumeric(c))
            return null;
        BigInteger first = new BigInteger(a);
        BigInteger second = new BigInteger(b);
        BigInteger third = new BigInteger(c);
        if (first.add(second).compareTo(third) <= 0 || second.add(third).compareTo(first) <= 0 || third.add(first).compareTo(second) <= 0)
            return null;
        return getResult(first.equals(second), first.equals(third), second.equals(third));
    }

    public static String checkAngleTriangle(String a, String b, String c) {
        if (!isDoubleNumeric(a) || !isDoubleNumeric(b) || !isDoubleNumeric(c))
            return null;
        BigDecimal first = new BigDecimal(a);
        BigDecimal second = new BigDecimal(b);
        BigDecimal third = new BigDecimal(c);
        if (first.equals(BigDecimal.ZERO) || second.equals(BigDecimal.ZERO) || third.equals(BigDecimal.ZERO))
            return null;
        if (first.add(second).add(third).compareTo(BigDecimal.valueOf(180)) != 0)
            return null;
        return getResult(first.compareTo(second) == 0, first.compareTo(third) == 0, second.compareTo(third) == 0);
    }
}
