package com.upskilling.w01;

public class BmiCalculator {

    public double calculateBmi(double weightKg, double heightMeters) {
        if (weightKg <= 0 || heightMeters <= 0) {
            throw new IllegalArgumentException("Weight and height must be positive");
        }
        var heightSquared = heightMeters * heightMeters;
        return weightKg / heightSquared;
    }
}