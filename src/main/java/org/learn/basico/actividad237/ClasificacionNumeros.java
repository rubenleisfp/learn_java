package org.learn.basico.actividad237;
import java.util.Scanner;

public class ClasificacionNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce la cantidad de números a ingresar: ");
        int cantidadNumeros = scanner.nextInt();

        int mayoresQueCero = 0;
        int menoresQueCero = 0;
        int igualesACero = 0;

        for (int i = 0; i < cantidadNumeros; i++) {
            System.out.print("Ingrese el número " + (i + 1) + ": ");
            int numero = scanner.nextInt();

            if (numero > 0) {
                mayoresQueCero++;
            } else if (numero < 0) {
                menoresQueCero++;
            } else {
                igualesACero++;
            }
        }

        System.out.println("Cantidad de números mayores que 0: " + mayoresQueCero);
        System.out.println("Cantidad de números menores que 0: " + menoresQueCero);
        System.out.println("Cantidad de números iguales a 0: " + igualesACero);

        scanner.close();
    }
}
