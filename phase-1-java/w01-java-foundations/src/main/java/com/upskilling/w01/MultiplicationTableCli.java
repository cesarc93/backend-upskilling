package com.upskilling.w01;

import java.util.Scanner;

public class MultiplicationTableCli {

    public static void main(String[] args) {
        MultiplicationTable table = new MultiplicationTable();

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Ingresa el numero base de la tabla: ");
            if (!scanner.hasNextInt()) {
                System.out.println("Entrada invalida: debes ingresar un numero entero.");
                return;
            }
            int number = scanner.nextInt();

            System.out.print("Hasta que numero deseas multiplicar (mayor que 0): ");
            if (!scanner.hasNextInt()) {
                System.out.println("Entrada invalida: debes ingresar un numero entero.");
                return;
            }
            int upTo = scanner.nextInt();

            try {
                for (String line : table.generateLines(number, upTo)) {
                    System.out.println(line);
                }
            } catch (IllegalArgumentException ex) {
                System.out.println("Error: " + ex.getMessage());
            }
        }
    }
}