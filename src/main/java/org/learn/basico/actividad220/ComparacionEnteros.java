package org.learn.basico.actividad220;
import java.util.Scanner;

public class ComparacionEnteros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese los números
        System.out.print("Ingrese el primer número: ");
        int primerNumero = scanner.nextInt();

        System.out.print("Ingrese el segundo número: ");
        int segundoNumero = scanner.nextInt();

        // Determinar cuál número es mayor
        if (primerNumero > segundoNumero) {
            System.out.println("El número mayor es: " + primerNumero);
        } else if (segundoNumero > primerNumero) {
            System.out.println("El número mayor es: " + segundoNumero);
        } else {
            System.out.println("Ambos números son iguales.");
        }

        // Determinar si el primer número es par o impar
        if (primerNumero % 2 == 0) {
            System.out.println("El primer número (" + primerNumero + ") es par.");
        } else {
            System.out.println("El primer número (" + primerNumero + ") es impar.");
        }

        // Determinar si el segundo número es par o impar
        if (segundoNumero % 2 == 0) {
            System.out.println("El segundo número (" + segundoNumero + ") es par.");
        } else {
            System.out.println("El segundo número (" + segundoNumero + ") es impar.");
        }

        // Cerrar el scanner
        scanner.close();
    }
}
