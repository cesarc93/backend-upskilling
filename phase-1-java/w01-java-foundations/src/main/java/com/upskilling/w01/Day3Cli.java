package com.upskilling.w01;

import java.util.Arrays;
import java.util.Scanner;

public class Day3Cli {

    private final ArrayUtils arrayUtils = new ArrayUtils();
    private final MatrixUtils matrixUtils = new MatrixUtils();
    private final RecursionUtils recursionUtils = new RecursionUtils();

    public static void main(String[] args) {
        new Day3Cli().run();
    }

    public void run() {
        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                printMenu();
                int option = readInt(scanner, "Elige una opcion: ");

                switch (option) {
                    case 1 -> handleArrayDemo(scanner);
                    case 2 -> handleMatrixDemo(scanner);
                    case 3 -> handleRecursionDemo(scanner);
                    case 0 -> {
                        System.out.println("Saliendo del CLI del Dia 3...");
                        return;
                    }
                    default -> System.out.println("Opcion no valida.");
                }
            }
        }
    }

    private void printMenu() {
        System.out.println("\n=== Dia 3 CLI: Arrays, Matrices y Recursion ===");
        System.out.println("1. Probar ArrayUtils (reverse, rotateRight, max, mergeSorted)");
        System.out.println("2. Probar MatrixUtils (sum y transpose)");
        System.out.println("3. Probar RecursionUtils (factorial, fibonacci, power, gcd)");
        System.out.println("0. Salir");
    }

    private void handleArrayDemo(Scanner scanner) {
        int[] base = readIntArray(scanner, "Cuantos elementos tendra el arreglo? ");
        int steps = readInt(scanner, "Pasos para rotar a la derecha: ");
        int[] sortedExtra = readIntArray(scanner, "Cuantos elementos tendra un segundo arreglo ordenado para fusionar? ");

        int[] reversed = arrayUtils.reverse(base);
        int[] rotated = arrayUtils.rotateRight(base, steps);
        int[] merged = arrayUtils.mergeSorted(Arrays.copyOf(base, base.length), Arrays.copyOf(sortedExtra, sortedExtra.length));

        System.out.println("Original:    " + Arrays.toString(base));
        System.out.println("Invertido:   " + Arrays.toString(reversed));
        System.out.println("Rotado:      " + Arrays.toString(rotated));
        if (base.length > 0) {
            System.out.println("Maximo:      " + arrayUtils.max(base));
        }
        System.out.println("Fusionados:  " + Arrays.toString(merged));
    }

    private void handleMatrixDemo(Scanner scanner) {
        int rows = readInt(scanner, "Numero de filas: ");
        int cols = readInt(scanner, "Numero de columnas: ");
        int[][] a = readMatrix(scanner, rows, cols, "Matriz A");
        int[][] b = readMatrix(scanner, rows, cols, "Matriz B");

        try {
            int[][] sum = matrixUtils.sum(a, b);
            int[][] transposedA = matrixUtils.transpose(a);

            System.out.println("Suma A + B:");
            printMatrix(sum);
            System.out.println("Transpuesta de A:");
            printMatrix(transposedA);
        } catch (IllegalArgumentException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }

    private void handleRecursionDemo(Scanner scanner) {
        int n = readInt(scanner, "Ingresa un entero n (para factorial/fibonacci): ");
        long base = readInt(scanner, "Base para potencia: ");
        int exp = readInt(scanner, "Exponente (>= 0) para potencia: ");
        int a = readInt(scanner, "Primer numero para MCD (gcd): ");
        int b = readInt(scanner, "Segundo numero para MCD (gcd): ");

        try {
            System.out.println("factorial(" + n + ") = " + recursionUtils.factorial(n));
            System.out.println("fibonacci(" + n + ") = " + recursionUtils.fibonacci(n));
            System.out.println("power(" + base + ", " + exp + ") = " + recursionUtils.power(base, exp));
            System.out.println("gcd(" + a + ", " + b + ") = " + recursionUtils.gcd(a, b));
        } catch (IllegalArgumentException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }

    private int[] readIntArray(Scanner scanner, String prompt) {
        int size = Math.max(0, readInt(scanner, prompt));
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = readInt(scanner, "Elemento [" + i + "]: ");
        }
        return arr;
    }

    private int[][] readMatrix(Scanner scanner, int rows, int cols, String name) {
        System.out.println("Captura " + name + " (" + rows + "x" + cols + "):");
        int[][] matrix = new int[rows][cols];
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                matrix[r][c] = readInt(scanner, name + "[" + r + "][" + c + "]: ");
            }
        }
        return matrix;
    }

    private void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
    }

    private int readInt(Scanner scanner, String prompt) {
        while (true) {
            System.out.print(prompt);
            if (scanner.hasNextInt()) {
                return scanner.nextInt();
            }
            System.out.println("Entrada invalida. Escribe un numero entero.");
            scanner.next();
        }
    }
}