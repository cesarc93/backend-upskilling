package com.upskilling.w01;

import java.util.ArrayList;
import java.util.List;

public class MultiplicationTable {

    public List<String> generateLines(int number, int upTo) {
        if (upTo <= 0) {
            throw new IllegalArgumentException("Limit 'upTo' must be greater than 0");
        }

        List<String> lines = new ArrayList<>();
        for (int i = 1; i <= upTo; i++) {
            int product = number * i;
            lines.add(number + " x " + i + " = " + product);
        }
        return lines;
    }
}