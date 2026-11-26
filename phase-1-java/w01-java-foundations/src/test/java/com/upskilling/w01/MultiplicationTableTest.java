package com.upskilling.w01;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class MultiplicationTableTest {

    private final MultiplicationTable table = new MultiplicationTable();

    @Test
    void shouldGenerateTableForPositiveNumber() {
        List<String> expected = List.of(
                "5 x 1 = 5",
                "5 x 2 = 10",
                "5 x 3 = 15",
                "5 x 4 = 20"
        );
        assertEquals(expected, table.generateLines(5, 4));
    }

    @Test
    void shouldGenerateTableForNegativeAndZeroBaseNumbers() {
        assertEquals(
                List.of("-2 x 1 = -2", "-2 x 2 = -4"),
                table.generateLines(-2, 2)
        );
        assertEquals(
                List.of("0 x 1 = 0", "0 x 2 = 0", "0 x 3 = 0"),
                table.generateLines(0, 3)
        );
    }

    @Test
    void shouldThrowExceptionWhenLimitIsZeroOrNegative() {
        assertThrows(IllegalArgumentException.class, () -> table.generateLines(7, 0));
        assertThrows(IllegalArgumentException.class, () -> table.generateLines(7, -5));
    }
}