package org.learn.basico.actividad202;
import java.util.Scanner;

public class OperacionesAritmeticas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese los números
        System.out.print("Ingrese el primer número: ");
        int primerNumero = scanner.nextInt();

        System.out.print("Ingrese el segundo número: ");
        int segundoNumero = scanner.nextInt();

        // Realizar las operaciones aritméticas
        int suma = primerNumero + segundoNumero;
        int resta = primerNumero - segundoNumero;
        int multiplicacion = primerNumero * segundoNumero;
        int division = primerNumero / segundoNumero;
        int modulo = primerNumero % segundoNumero;

        // Imprimir los resultados
        System.out.println(primerNumero + " + " + segundoNumero + " = " + suma);
        System.out.println(primerNumero + " - " + segundoNumero + " = " + resta);
        System.out.println(primerNumero + " x " + segundoNumero + " = " + multiplicacion);
        System.out.println(primerNumero + " / " + segundoNumero + " = " + division);
        System.out.println(primerNumero + " mod " + segundoNumero + " = " + modulo);

        // Cerrar el scanner
        scanner.close();
    }
}
