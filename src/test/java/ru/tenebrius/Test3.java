package ru.tenebrius;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class Test3 {
    @Test
    public void TestTriangle() {
        assertNull(Task3.startGame("a", "0"));
        assertNull(Task3.startGame("123a", "0"));

        assertEquals("win", Task3.startGame("0", "0"));
        assertEquals("win", Task3.startGame("10", "100"));
        assertEquals("win", Task3.startGame("10", "1000000000000000000000000000000000000000000"));
        assertEquals("win", Task3.startGame("1", "9"));

        assertEquals("loose", Task3.startGame("10", "9"));
        assertEquals("loose", Task3.startGame("11", "0"));
        assertEquals("loose", Task3.startGame("111111111111111111111111111111111111111111111111111", "0"));

    }
}
