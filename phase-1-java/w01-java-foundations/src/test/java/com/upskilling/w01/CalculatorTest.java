package com.upskilling.w01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CalculatorTest {

    private final Calculator calculator = new Calculator();

    @Test
    void shouldAddTwoNumbers() {
        assertEquals(15.0, calculator.calculate(Calculator.Operation.ADD, 10.0, 5.0), 0.0001);
        assertEquals(-2.0, calculator.calculate(Calculator.Operation.ADD, 3.0, -5.0), 0.0001);
    }

    @Test
    void shouldSubtractTwoNumbers() {
        assertEquals(6.0, calculator.calculate(Calculator.Operation.SUBTRACT, 10.0, 4.0), 0.0001);
        assertEquals(-12.0, calculator.calculate(Calculator.Operation.SUBTRACT, -4.0, 8.0), 0.0001);
    }

    @Test
    void shouldMultiplyTwoNumbers() {
        assertEquals(24.0, calculator.calculate(Calculator.Operation.MULTIPLY, 6.0, 4.0), 0.0001);
        assertEquals(0.0, calculator.calculate(Calculator.Operation.MULTIPLY, 9.0, 0.0), 0.0001);
    }

    @Test
    void shouldDivideTwoNumbers() {
        assertEquals(2.5, calculator.calculate(Calculator.Operation.DIVIDE, 5.0, 2.0), 0.0001);
        assertEquals(-3.0, calculator.calculate(Calculator.Operation.DIVIDE, -9.0, 3.0), 0.0001);
    }

    @Test
    void shouldThrowExceptionWhenDividingByZero() {
        assertThrows(
                IllegalArgumentException.class,
                () -> calculator.calculate(Calculator.Operation.DIVIDE, 10.0, 0.0)
        );
    }

    @Test
    void shouldThrowExceptionWhenOperationIsNull() {
        assertThrows(
                IllegalArgumentException.class,
                () -> calculator.calculate(null, 2.0, 3.0)
        );
    }
}
