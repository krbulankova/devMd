package org.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ArrayTest {
    ArrayHolder arrayHolder = new ArrayHolder();

    @Test
    public void shouldCreateDefaultArrayTest() {
        assertEquals(arrayHolder.toString(), "[1, 2, 3, 4, 5]");
    }
}
