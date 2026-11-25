package com.upskilling.w01;

public class NumberSwapper {

    public int[] swapWithTemp(int a, int b) {
        var temp = a;
        a = b;
        b = temp;
        return new int[]{a, b};
    }

    public int[] swapWithoutTemp(int a, int b) {
        a = a + b;
        b = a - b;
        a = a - b;
        return new int[]{a, b};
    }
}