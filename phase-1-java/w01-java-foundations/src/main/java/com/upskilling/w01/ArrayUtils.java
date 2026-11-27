package com.upskilling.w01;

import java.util.Arrays;

public class ArrayUtils {

    public int[] reverse(int[] array) {
        validateNotNull(array, "Array must not be null");
        int[] copy = Arrays.copyOf(array, array.length);
        int left = 0;
        int right = copy.length - 1;

        while (left < right) {
            int temp = copy[left];
            copy[left] = copy[right];
            copy[right] = temp;
            left++;
            right--;
        }
        return copy;
    }

    public int[] rotateRight(int[] array, int steps) {
        validateNotNull(array, "Array must not be null");
        if (array.length == 0) {
            return new int[0];
        }

        int n = array.length;
        int shift = ((steps % n) + n) % n;
        if (shift == 0) {
            return Arrays.copyOf(array, n);
        }

        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            result[(i + shift) % n] = array[i];
        }
        return result;
    }

    public int[] rotateLeft(int[] array, int steps) {
        validateNotNull(array, "Array must not be null");
        return rotateRight(array, -steps);
    }

    public int max(int[] array) {
        validateNotEmpty(array, "Array must not be null or empty");
        int currentMax = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > currentMax) {
                currentMax = array[i];
            }
        }
        return currentMax;
    }

    public double max(double[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Array must not be null or empty");
        }
        double currentMax = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > currentMax) {
                currentMax = array[i];
            }
        }
        return currentMax;
    }

    public int[] mergeSorted(int[] first, int[] second) {
        validateNotNull(first, "First array must not be null");
        validateNotNull(second, "Second array must not be null");

        int[] merged = new int[first.length + second.length];
        int i = 0;
        int j = 0;
        int k = 0;

        while (i < first.length && j < second.length) {
            if (first[i] <= second[j]) {
                merged[k++] = first[i++];
            } else {
                merged[k++] = second[j++];
            }
        }

        while (i < first.length) {
            merged[k++] = first[i++];
        }

        while (j < second.length) {
            merged[k++] = second[j++];
        }

        return merged;
    }

    private void validateNotNull(int[] array, String message) {
        if (array == null) {
            throw new IllegalArgumentException(message);
        }
    }

    private void validateNotEmpty(int[] array, String message) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException(message);
        }
    }
}