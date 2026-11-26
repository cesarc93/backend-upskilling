package com.upskilling.w01;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class FizzBuzzTest {

    private final FizzBuzz fizzBuzz = new FizzBuzz();

    @Test
    void shouldReturnNumberWhenNotDivisibleByThreeOrFive() {
        assertEquals("1", fizzBuzz.evaluate(1));
        assertEquals("7", fizzBuzz.evaluate(7));
    }

    @Test
    void shouldReturnFizzForMultiplesOfThreeOnly() {
        assertEquals("Fizz", fizzBuzz.evaluate(3));
        assertEquals("Fizz", fizzBuzz.evaluate(9));
    }

    @Test
    void shouldReturnBuzzForMultiplesOfFiveOnly() {
        assertEquals("Buzz", fizzBuzz.evaluate(5));
        assertEquals("Buzz", fizzBuzz.evaluate(20));
    }

    @Test
    void shouldReturnFizzBuzzForMultiplesOfThreeAndFive() {
        assertEquals("FizzBuzz", fizzBuzz.evaluate(15));
        assertEquals("FizzBuzz", fizzBuzz.evaluate(30));
    }

    @Test
    void shouldGenerateSequenceUpToLimit() {
        List<String> expected = List.of("1", "2", "Fizz", "4", "Buzz");
        assertEquals(expected, fizzBuzz.generateUpTo(5));
    }

    @Test
    void shouldThrowExceptionWhenNumberIsZeroOrNegative() {
        assertThrows(IllegalArgumentException.class, () -> fizzBuzz.evaluate(0));
        assertThrows(IllegalArgumentException.class, () -> fizzBuzz.generateUpTo(-3));
    }
}