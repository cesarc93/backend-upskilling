package com.upskilling.w01;

import java.util.Scanner;

public class CalculatorCli {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        try (Scanner scanner = new Scanner(System.in)) {
            boolean running = true;

            while (running) {
                printMenu();
                System.out.print("Elige una opcion: ");

                if (!scanner.hasNextInt()) {
                    System.out.println("Entrada invalida: ingresa un numero de opcion.");
                    scanner.next();
                    continue;
                }

                int option = scanner.nextInt();
                Calculator.Operation operation = null;

                switch (option) {
                    case 1 -> operation = Calculator.Operation.ADD;
                    case 2 -> operation = Calculator.Operation.SUBTRACT;
                    case 3 -> operation = Calculator.Operation.MULTIPLY;
                    case 4 -> operation = Calculator.Operation.DIVIDE;
                    case 0 -> {
                        System.out.println("Saliendo de la calculadora...");
                        running = false;
                    }
                    default -> System.out.println("Opcion no valida. Intenta de nuevo.");
                }

                if (!running) {
                    break;
                }

                if (operation == null) {
                    continue;
                }

                Double firstNumber = readDouble(scanner, "Ingresa el primer numero: ");
                Double secondNumber = readDouble(scanner, "Ingresa el segundo numero: ");

                if (firstNumber == null || secondNumber == null) {
                    System.out.println("Operacion cancelada por entrada numerica invalida.");
                    continue;
                }

                try {
                    double result = calculator.calculate(operation, firstNumber, secondNumber);
                    System.out.println("Resultado: " + result);
                } catch (IllegalArgumentException ex) {
                    System.out.println("Error: " + ex.getMessage());
                }
            }
        }
    }

    private static void printMenu() {
        System.out.println("\n--- CALCULADORA ---");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.println("0. Salir");
    }

    private static Double readDouble(Scanner scanner, String prompt) {
        System.out.print(prompt);
        if (!scanner.hasNextDouble()) {
            scanner.next();
            return null;
        }
        return scanner.nextDouble();
    }
}