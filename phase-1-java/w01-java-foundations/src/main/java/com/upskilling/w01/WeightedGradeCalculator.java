package com.upskilling.w01;

public class WeightedGradeCalculator {

    public double weightedAverage(double score1, double weight1, double score2, double weight2) {
        var totalWeight = weight1 + weight2;
        if (totalWeight <= 0) {
            throw new IllegalArgumentException("Total weight must be positive");
        }
        return ((score1 * weight1) + (score2 * weight2)) / totalWeight;
    }
}