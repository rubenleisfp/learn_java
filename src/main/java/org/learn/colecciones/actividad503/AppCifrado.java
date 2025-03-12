package org.learn.colecciones.actividad503;

import java.util.Scanner;

public class AppCifrado {

    public static void main(String[] args) {
        ServicioCifrador servicioCifrador = new ServicioCifrador();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduzca el modo de funcionamiento (C para cifrar, D para descifrar):");
        char modo = scanner.next().charAt(0);
        scanner.nextLine(); // Consumir el salto de línea

        System.out.println("Introduzca el teléfono:");
        String telefono = scanner.nextLine();

        String resultado;
        if (modo == 'C') {
            resultado = servicioCifrador.cifrarTelefono(telefono);
            System.out.println("Teléfono cifrado: " + resultado);
        } else if (modo == 'D') {
            resultado = servicioCifrador.descifrarTelefono(telefono);
            System.out.println("Teléfono descifrado: " + resultado);
        } else {
            System.out.println("Modo de funcionamiento no válido.");
        }
    }
}
