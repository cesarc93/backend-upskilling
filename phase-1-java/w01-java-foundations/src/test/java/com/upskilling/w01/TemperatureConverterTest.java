package com.upskilling.w01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TemperatureConverterTest {

    private final TemperatureConverter converter = new TemperatureConverter();

    @Test
    void shouldConvertCelsiusToFahrenheit() {
        double result = converter.celsiusToFahrenheit(25.0);
        assertEquals(77.0, result, 0.0001);
    }

    @Test
    void shouldConvertFahrenheitToCelsius() {
        double result = converter.fahrenheitToCelsius(32.0);
        assertEquals(0.0, result, 0.0001);
    }
}