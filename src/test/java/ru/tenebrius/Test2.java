package ru.tenebrius;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class Test2 {
    @Test
    public void TestTriangle() {
        // Bad Args
        assertNull(Task2.checkTriangle("-3", "3", "3"));
        assertNull(Task2.checkTriangle("3z", "3", "3"));
        assertNull(Task2.checkTriangle("3 ", "3", "3"));
        assertNull(Task2.checkTriangle(" 3", "3", "3"));

        assertEquals(true, Task2.checkTriangle("5", "5", "5"));
        assertEquals(true, Task2.checkTriangle("10", "7", "6"));

        assertEquals(false, Task2.checkTriangle("1000000000000000", "7", "6"));
        assertEquals(false, Task2.checkTriangle("0", "1", "2"));
        assertEquals(false, Task2.checkTriangle("1", "1", "2"));
    }
}
