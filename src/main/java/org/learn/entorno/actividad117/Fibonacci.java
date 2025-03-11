package org.learn.entorno.actividad117;

import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el número de la secuencia de Fibonacci que deseas ver: ");
        int n = scanner.nextInt();
        scanner.close();

        if (n <= 0) {
            System.out.println("Por favor, ingrese un número mayor que 0.");
        } else {
            int a = 1, b = 1;

            for (int i = 3; i <= n; i++) {
                int siguiente = a + b;
                a = b;
                b = siguiente;
            }

            // Si n es 1 o 2, ambos retornan 1 (el primer y segundo número de Fibonacci).
            int enesimoValor = (n == 1 || n == 2) ? 1 : b;
            System.out.println("El número " + n + " de la secuencia de Fibonacci es: " + enesimoValor);
        }
    }
}
