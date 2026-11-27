package com.upskilling.w01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class MatrixUtilsTest {

    private final MatrixUtils matrixUtils = new MatrixUtils();

    @Test
    void shouldSumTwoMatricesOfSameDimensions() {
        int[][] a = {{1, 2}, {3, 4}};
        int[][] b = {{5, 6}, {7, 8}};

        int[][] result = matrixUtils.sum(a, b);
        assertArrayEquals(new int[][]{{6, 8}, {10, 12}}, result);
    }

    @Test
    void shouldThrowExceptionWhenSummingMatricesWithDifferentDimensions() {
        int[][] a = {{1, 2}, {3, 4}};
        int[][] b = {{1, 2, 3}, {4, 5, 6}};

        assertThrows(IllegalArgumentException.class, () -> matrixUtils.sum(a, b));
    }

    @Test
    void shouldTransposeRectangularMatrix() {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6}
        };

        int[][] expected = {
                {1, 4},
                {2, 5},
                {3, 6}
        };

        assertArrayEquals(expected, matrixUtils.transpose(matrix));
    }

    @Test
    void shouldThrowExceptionForInvalidOrJaggedMatrix() {
        int[][] jagged = {
                {1, 2},
                {3}
        };

        assertThrows(IllegalArgumentException.class, () -> matrixUtils.transpose(jagged));
        assertThrows(IllegalArgumentException.class, () -> matrixUtils.transpose(new int[][]{}));
    }
}