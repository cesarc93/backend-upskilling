package com.upskilling.w01;

public class PriceCalculator {

    public double calculateFinalPrice(double basePrice, double discountPercent, double taxPercent) {
        var discounted = basePrice * (1.0 - (discountPercent / 100.0));
        return discounted * (1.0 + (taxPercent / 100.0));
    }
}