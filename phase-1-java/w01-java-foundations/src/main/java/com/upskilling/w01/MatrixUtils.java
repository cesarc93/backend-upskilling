package com.upskilling.w01;

public class MatrixUtils {

    public int[][] sum(int[][] matrixA, int[][] matrixB) {
        validateRectangularMatrix(matrixA, "Matrix A");
        validateRectangularMatrix(matrixB, "Matrix B");

        int rows = matrixA.length;
        int cols = matrixA[0].length;

        if (rows != matrixB.length || cols != matrixB[0].length) {
            throw new IllegalArgumentException("Matrices must have the same dimensions");
        }

        int[][] result = new int[rows][cols];
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                result[r][c] = matrixA[r][c] + matrixB[r][c];
            }
        }
        return result;
    }

    public int[][] transpose(int[][] matrix) {
        validateRectangularMatrix(matrix, "Matrix");

        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] transposed = new int[cols][rows];

        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                transposed[c][r] = matrix[r][c];
            }
        }
        return transposed;
    }

    private void validateRectangularMatrix(int[][] matrix, String name) {
        if (matrix == null || matrix.length == 0 || matrix[0] == null || matrix[0].length == 0) {
            throw new IllegalArgumentException(name + " must not be null or empty");
        }
        int expectedCols = matrix[0].length;
        for (int r = 1; r < matrix.length; r++) {
            if (matrix[r] == null || matrix[r].length != expectedCols) {
                throw new IllegalArgumentException(name + " must be rectangular");
            }
        }
    }
}