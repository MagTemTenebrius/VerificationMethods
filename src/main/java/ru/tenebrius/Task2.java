package ru.tenebrius;

import java.math.BigInteger;

public class Task2 {
    private static boolean isNumeric(String number) {
        for (int i = 0; i < number.length(); i++)
            if (!Character.isDigit(number.charAt(i)))
                return false;
        return true;
    }

    public static Boolean checkTriangle(String a, String b, String c) {
        if (!isNumeric(a) || !isNumeric(b) || !isNumeric(c))
            return null;
        BigInteger first = new BigInteger(a);
        BigInteger second = new BigInteger(b);
        BigInteger third = new BigInteger(c);
        return first.add(second).compareTo(third) > 0 && second.add(third).compareTo(first) > 0 && third.add(first).compareTo(second) > 0;
    }
}
