package org.learn.basico.actividad233;

import java.util.Scanner;

public class SumaNPrimerosNumeros {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        
        // Pedir al usuario que ingrese los números
        System.out.println("Ingrese un número entero:");
        int num = scanner.nextInt();
        int suma=0;
        
        for (int i=0; i<num; i++) {
        	suma=suma+i;
        }
        System.out.println("suma:" + suma);
        
        // Cerrar el objeto Scanner
        scanner.close();
    }
}
