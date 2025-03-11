package org.learn.basico.actividad221;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] matriz1 = {1, 3, -5, 4};
        int[] matriz2 = {1, 4, -5, -2};
        int[] resultado = new int[4];

        for (int i = 0; i < matriz1.length; i++) {
            resultado[i] = matriz1[i] * matriz2[i];
        }

        System.out.println("Matriz1: " + Arrays.toString(matriz1));
        System.out.println("Matriz2: " + Arrays.toString(matriz2));
        System.out.print("Resultado: ");
        for (int valor : resultado) {
            System.out.print(valor + " ");
        }
    }
}
