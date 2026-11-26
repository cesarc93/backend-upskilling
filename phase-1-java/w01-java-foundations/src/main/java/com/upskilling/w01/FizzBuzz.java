package com.upskilling.w01;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {

    public String evaluate(int number) {
        if (number <= 0) {
            throw new IllegalArgumentException("Number must be greater than 0");
        }
        if (number % 15 == 0) {
            return "FizzBuzz";
        }
        if (number % 3 == 0) {
            return "Fizz";
        }
        if (number % 5 == 0) {
            return "Buzz";
        }
        return String.valueOf(number);
    }

    public List<String> generateUpTo(int limit) {
        if (limit <= 0) {
            throw new IllegalArgumentException("Limit must be greater than 0");
        }
        List<String> result = new ArrayList<>();
        for (int i = 1; i <= limit; i++) {
            result.add(evaluate(i));
        }
        return result;
    }
}