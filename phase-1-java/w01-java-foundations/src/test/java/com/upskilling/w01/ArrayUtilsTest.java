package com.upskilling.w01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class ArrayUtilsTest {

    private final ArrayUtils arrayUtils = new ArrayUtils();

    @Test
    void shouldReverseArrayWithoutMutatingOriginal() {
        int[] original = {1, 2, 3, 4};
        int[] reversed = arrayUtils.reverse(original);

        assertArrayEquals(new int[]{4, 3, 2, 1}, reversed);
        assertArrayEquals(new int[]{1, 2, 3, 4}, original);
    }

    @Test
    void shouldRotateRightAndLeftHandlingWrapAroundAndNegativeSteps() {
        int[] values = {10, 20, 30, 40, 50};

        assertArrayEquals(new int[]{40, 50, 10, 20, 30}, arrayUtils.rotateRight(values, 2));
        assertArrayEquals(new int[]{40, 50, 10, 20, 30}, arrayUtils.rotateRight(values, 7));
        assertArrayEquals(new int[]{30, 40, 50, 10, 20}, arrayUtils.rotateLeft(values, 2));
        assertArrayEquals(new int[]{40, 50, 10, 20, 30}, arrayUtils.rotateRight(values, -3));
    }

    @Test
    void shouldReturnMaxForIntAndDoubleArrays() {
        assertEquals(42, arrayUtils.max(new int[]{-10, 42, 0, 15}));
        assertEquals(9.75, arrayUtils.max(new double[]{1.5, 9.75, -3.2, 4.0}), 0.0001);
    }

    @Test
    void shouldThrowExceptionWhenMaxIsCalledOnNullOrEmptyArray() {
        assertThrows(IllegalArgumentException.class, () -> arrayUtils.max(new int[]{}));
        assertThrows(IllegalArgumentException.class, () -> arrayUtils.max((int[]) null));
        assertThrows(IllegalArgumentException.class, () -> arrayUtils.max(new double[]{}));
    }

    @Test
    void shouldMergeTwoSortedArrays() {
        int[] merged = arrayUtils.mergeSorted(new int[]{1, 3, 5}, new int[]{2, 3, 6, 8});
        assertArrayEquals(new int[]{1, 2, 3, 3, 5, 6, 8}, merged);
        assertArrayEquals(new int[]{2, 4}, arrayUtils.mergeSorted(new int[]{}, new int[]{2, 4}));
    }

    @Test
    void shouldThrowExceptionWhenArrayInputIsNull() {
        assertThrows(IllegalArgumentException.class, () -> arrayUtils.reverse(null));
        assertThrows(IllegalArgumentException.class, () -> arrayUtils.rotateRight(null, 1));
        assertThrows(IllegalArgumentException.class, () -> arrayUtils.mergeSorted(null, new int[]{1}));
    }
}