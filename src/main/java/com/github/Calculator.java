package com.github;

public final class Calculator {

    private Calculator() {
    }

    public static int modulo(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Divisor b must not be zero");
        }
        return Math.floorMod(a, b);
    }
}
