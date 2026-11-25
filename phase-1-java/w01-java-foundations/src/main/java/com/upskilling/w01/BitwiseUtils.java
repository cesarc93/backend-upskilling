package com.upskilling.w01;

public class BitwiseUtils {

    public boolean isEven(int number) {
        return (number & 1) == 0;
    }

    public int multiplyByPowerOfTwo(int number, int shift) {
        if (shift < 0) {
            throw new IllegalArgumentException("Shift must be non-negative");
        }
        return number << shift;
    }
}