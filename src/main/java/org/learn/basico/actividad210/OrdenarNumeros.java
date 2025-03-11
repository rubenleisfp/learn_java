package org.learn.basico.actividad210;

import java.util.Scanner;

public class OrdenarNumeros {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduzca 3 elementos:");
        
        System.out.print("A = ");
        int a = scanner.nextInt();
        
        System.out.print("B = ");
        int b = scanner.nextInt();
        
        System.out.print("C = ");
        int c = scanner.nextInt();
        
        System.out.print("Los elementos ordenados de mayor a menor son: ");
        
        if (a >= b && b >= c) {
            System.out.println("A, B, C");
        } else if (a >= c && c >= b) {
            System.out.println("A, C, B");
        } else if (b >= a && a >= c) {
            System.out.println("B, A, C");
        } else if (b >= c && c >= a) {
            System.out.println("B, C, A");
        } else if (c >= a && a >= b) {
            System.out.println("C, A, B");
        } else if (c >= b && b >= a) {
            System.out.println("C, B, A");
        }

        scanner.close();
    }
}
