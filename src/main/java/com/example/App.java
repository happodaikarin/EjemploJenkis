package com.example;

public class App {
    // Método que suma dos números
    public int add(int a, int b) {
        return a + b;
    }

    public int div(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("División por cero no es posible");
        }
        return a / b;
    }
}
