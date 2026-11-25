package com.upskilling.w01;

public class InterestCalculator {

    public double simpleInterest(double principal, double annualRatePercent, int years) {
        return (principal * annualRatePercent * years) / 100.0;
    }

    public double compoundTotal(double principal, double annualRatePercent, int years) {
        var rate = annualRatePercent / 100.0;
        return principal * Math.pow(1.0 + rate, years);
    }
}