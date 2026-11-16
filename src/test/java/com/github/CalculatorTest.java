package com.github;

import junit.framework.TestCase;

public class CalculatorTest extends TestCase {

    public void testModuloNormalCase() {
        assertEquals(1, Calculator.modulo(7, 3));
        assertEquals(0, Calculator.modulo(9, 3));
    }

    public void testModuloZeroDivisorThrows() {
        try {
            Calculator.modulo(7, 0);
            fail("Expected IllegalArgumentException for zero divisor");
        } catch (IllegalArgumentException expected) {
            assertEquals("Divisor b must not be zero", expected.getMessage());
        }
    }

    public void testModuloNegativeDividendIsNonNegative() {
        assertEquals(2, Calculator.modulo(-7, 3));
        assertEquals(0, Calculator.modulo(-9, 3));
    }
}
