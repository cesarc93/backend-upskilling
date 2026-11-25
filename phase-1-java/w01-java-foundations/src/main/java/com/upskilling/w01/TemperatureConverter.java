package com.upskilling.w01;

public class TemperatureConverter {

    public double celsiusToFahrenheit(double celsius) {
        var factor = 9.0 / 5.0;
        var offset = 32.0;
        return (celsius * factor) + offset;
    }

    public double fahrenheitToCelsius(double fahrenheit) {
        var offset = 32.0;
        var factor = 5.0 / 9.0;
        return (fahrenheit - offset) * factor;
    }
}