package ru.tenebrius;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class Test1 {
    @Test
    public void TestSide() {
        // > 0
        assertNull(Task1.checkTriangle("-3", "3", "3"));
        // is not double
        assertNull(Task1.checkTriangle("1.1", "1", "1"));
        assertNull(Task1.checkTriangle("0.1", "1", "1"));
        assertNull(Task1.checkTriangle("123123123123123.1", "123123123123123", "123123123123123"));
        // without alphabet char
        assertNull(Task1.checkTriangle("1111111111111a1111", "11111111111111111", "11111111111111111"));
        assertNull(Task1.checkTriangle("1111111111111(1111", "11111111111111111", "11111111111111111"));
        assertNull(Task1.checkTriangle("1111111111111Z1111", "11111111111111111", "11111111111111111"));
        assertNull(Task1.checkTriangle("1111111111111111 11", "11111111111111111", "11111111111111111"));
        assertNull(Task1.checkTriangle(" 111111111111111111", "11111111111111111", "11111111111111111"));
        // a + b > c
        assertNull(Task1.checkTriangle("1", "2", "3"));
        assertNull(Task1.checkTriangle("1", "3", "2"));
        assertNull(Task1.checkTriangle("3", "1", "2"));
        assertNull(Task1.checkTriangle("3", "2", "1"));
        assertNull(Task1.checkTriangle("2", "3", "1"));
        assertNull(Task1.checkTriangle("2", "1", "3"));

        // разносторонний
        assertEquals("разносторонний",
                Task1.checkTriangle("1000000000000000000000000",
                        "1000000000000000000000001",
                        "1000000000000000000000003"));
        assertEquals("разносторонний", Task1.checkTriangle("13", "14", "15"));
        assertEquals("разносторонний", Task1.checkTriangle("5", "3", "4"));

        // равнобедренный
        assertEquals("равнобедренный", Task1.checkTriangle("100000000000000", "100000000000000", "100000000000001"));
        assertEquals("равнобедренный", Task1.checkTriangle("5", "5", "3"));
        assertEquals("равнобедренный", Task1.checkTriangle("111", "70", "70"));
        assertEquals("равнобедренный", Task1.checkTriangle("9999", "10000", "9999"));

        // равносторонний
        assertEquals("равносторонний", Task1.checkTriangle("1", "1", "1"));
        assertEquals("равносторонний", Task1.checkTriangle("999999999999999999999999999999", "999999999999999999999999999999", "999999999999999999999999999999"));
    }
    @Test
    public void TestAngle() {
        // > 0
        assertNull(Task1.checkAngleTriangle("-2", "179", "179"));
        assertNull(Task1.checkAngleTriangle("-90", "89", "1"));
        // check alphabet
        assertNull(Task1.checkAngleTriangle("90.0.", "45", "45"));
        assertNull(Task1.checkAngleTriangle("90.0a", "45", "45"));
        assertNull(Task1.checkAngleTriangle("90.0Z", "45", "45"));
        assertNull(Task1.checkAngleTriangle("90.0 ", "45", "45"));
        assertNull(Task1.checkAngleTriangle(" 90.0", "45", "45"));
        // > 180
        assertNull(Task1.checkAngleTriangle("91", "45", "45"));
        assertNull(Task1.checkAngleTriangle("90", "46", "45"));
        assertNull(Task1.checkAngleTriangle("90", "45", "46"));
        assertNull(Task1.checkAngleTriangle("90", "40.1", "45"));

        // разносторонний
        assertEquals("разносторонний", Task1.checkAngleTriangle("90", "30", "60"));
        assertEquals("разносторонний", Task1.checkAngleTriangle("90", "40", "50"));
        assertEquals("разносторонний", Task1.checkAngleTriangle("63", "58", "59"));

        //равнобедренный
        assertEquals("равнобедренный", Task1.checkAngleTriangle("60.0000000000000000001", "60.0000000000000000001", "59.9999999999999999998"));
        assertEquals("равнобедренный", Task1.checkAngleTriangle("90", "45", "45"));
        assertEquals("равнобедренный", Task1.checkAngleTriangle("100", "40", "40"));
        assertEquals("равнобедренный", Task1.checkAngleTriangle("178", "1", "1"));

        //равносторонний
        assertEquals("равносторонний", Task1.checkAngleTriangle("60", "60", "60"));
        assertEquals("равносторонний", Task1.checkAngleTriangle("60.0", "60.0000000000", "60"));
        assertEquals("равносторонний", Task1.checkAngleTriangle("60.0", "60.0000000000", "60.0000000000000000000000000000000000000000000000000000000000000000000000"));
    }
}
