package com.upskilling.w01;

public class RecursionUtils {

    public long factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n must be non-negative");
        }
        if (n == 0 || n == 1) {
            return 1L;
        }
        return n * factorial(n - 1);
    }

    public long fibonacci(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n must be non-negative");
        }
        if (n == 0) {
            return 0L;
        }
        if (n == 1) {
            return 1L;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public long power(long base, int exponent) {
        if (exponent < 0) {
            throw new IllegalArgumentException("Exponent must be non-negative");
        }
        if (exponent == 0) {
            return 1L;
        }
        if (exponent % 2 == 0) {
            long half = power(base, exponent / 2);
            return half * half;
        }
        return base * power(base, exponent - 1);
    }

    public int gcd(int a, int b) {
        int absA = Math.abs(a);
        int absB = Math.abs(b);
        if (absB == 0) {
            return absA;
        }
        return gcd(absB, absA % absB);
    }
}