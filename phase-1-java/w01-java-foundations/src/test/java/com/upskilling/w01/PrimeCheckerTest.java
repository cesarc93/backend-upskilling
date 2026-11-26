package com.upskilling.w01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class PrimeCheckerTest {

    private final PrimeChecker primeChecker = new PrimeChecker();

    @Test
    void shouldReturnFalseForZeroOneAndNegativeNumbers() {
        assertFalse(primeChecker.isPrime(-7));
        assertFalse(primeChecker.isPrime(0));
        assertFalse(primeChecker.isPrime(1));
    }

    @Test
    void shouldReturnTrueForTwoAndOddPrimes() {
        assertTrue(primeChecker.isPrime(2));
        assertTrue(primeChecker.isPrime(3));
        assertTrue(primeChecker.isPrime(17));
        assertTrue(primeChecker.isPrime(97));
    }

    @Test
    void shouldReturnFalseForEvenAndOddCompositeNumbers() {
        assertFalse(primeChecker.isPrime(4));
        assertFalse(primeChecker.isPrime(9));
        assertFalse(primeChecker.isPrime(25));
        assertFalse(primeChecker.isPrime(49));
    }
}