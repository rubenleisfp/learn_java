package org.learn.basico.actividad222;

import java.util.Scanner;

public class AppCalificaciones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int entero = sc.nextInt();

        if (entero < 5) {
            System.out.println("Insuficiente");
        } else if (entero <= 6) {
            System.out.println("Suficiente");
        } else if (entero <= 8) {
            System.out.println("Bien");
        } else if (entero <= 10) {
            System.out.println("Notable");
        } else {
            System.out.println("SobreSaliente");
        }

        sc.close();
    }

}
