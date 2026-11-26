package com.upskilling.w01;

import java.util.Scanner;

public class PrimeCheckerCli {

    public static void main(String[] args) {
        PrimeChecker primeChecker = new PrimeChecker();

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Ingresa un numero entero para verificar si es primo: ");
            if (!scanner.hasNextInt()) {
                System.out.println("Entrada invalida: debes ingresar un numero entero.");
                return;
            }

            int number = scanner.nextInt();
            if (primeChecker.isPrime(number)) {
                System.out.println(number + " es un numero primo.");
            } else {
                System.out.println(number + " no es un numero primo.");
            }
        }
    }
}