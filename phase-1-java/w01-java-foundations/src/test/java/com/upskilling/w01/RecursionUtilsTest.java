package com.upskilling.w01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class RecursionUtilsTest {

    private final RecursionUtils recursionUtils = new RecursionUtils();

    @Test
    void shouldComputeFactorialIncludingBaseCases() {
        assertEquals(1L, recursionUtils.factorial(0));
        assertEquals(1L, recursionUtils.factorial(1));
        assertEquals(120L, recursionUtils.factorial(5));
        assertThrows(IllegalArgumentException.class, () -> recursionUtils.factorial(-1));
    }

    @Test
    void shouldComputeFibonacciSequenceValues() {
        assertEquals(0L, recursionUtils.fibonacci(0));
        assertEquals(1L, recursionUtils.fibonacci(1));
        assertEquals(5L, recursionUtils.fibonacci(5));
        assertEquals(55L, recursionUtils.fibonacci(10));
        assertThrows(IllegalArgumentException.class, () -> recursionUtils.fibonacci(-2));
    }

    @Test
    void shouldComputePowerRecursively() {
        assertEquals(1L, recursionUtils.power(7L, 0));
        assertEquals(1024L, recursionUtils.power(2L, 10));
        assertEquals(81L, recursionUtils.power(3L, 4));
        assertThrows(IllegalArgumentException.class, () -> recursionUtils.power(2L, -1));
    }

    @Test
    void shouldComputeGreatestCommonDivisor() {
        assertEquals(6, recursionUtils.gcd(54, 24));
        assertEquals(5, recursionUtils.gcd(-15, 25));
        assertEquals(12, recursionUtils.gcd(12, 0));
    }
}