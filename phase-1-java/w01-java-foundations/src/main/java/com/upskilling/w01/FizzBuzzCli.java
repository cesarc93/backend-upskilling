package com.upskilling.w01;

import java.util.Scanner;

public class FizzBuzzCli {

    public static void main(String[] args) {
        FizzBuzz fizzBuzz = new FizzBuzz();

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Ingresa un numero entero positivo: ");
            if (!scanner.hasNextInt()) {
                System.out.println("Entrada invalida: debes ingresar un numero entero.");
                return;
            }

            int limit = scanner.nextInt();
            try {
                for (String item : fizzBuzz.generateUpTo(limit)) {
                    System.out.println(item);
                }
            } catch (IllegalArgumentException ex) {
                System.out.println("Error: " + ex.getMessage());
            }
        }
    }
}