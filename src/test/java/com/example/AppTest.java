package com.example;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AppTest {
    @Test
    public void testAdd() {
        App app = new App();
        int result = app.add(5, 3);
        assertEquals(8, result); // Verifica que 5 + 3 = 8
    }

    @Test
    public void testDiv() {
        App app = new App();
        int result = app.div(10, 2);
        assertEquals(5, result); // Verifica que 10 / 2 = 5
    }
}
