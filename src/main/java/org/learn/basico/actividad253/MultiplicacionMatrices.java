package org.learn.basico.actividad253;
public class MultiplicacionMatrices {
    public static void main(String[] args) {
        // Definir las matrices de una dimensión de forma hardcodeada
        int[] matriz1 = {1, 3, -5, 4};
        int[] matriz2 = {1, 4, -5, -2};

        System.out.println("Matriz1: ");
        imprimirMatriz(matriz1);

        System.out.println("\nMatriz2: ");
        imprimirMatriz(matriz2);

        // Realizar la multiplicación de las matrices
        int[] resultado = multiplicarMatrices(matriz1, matriz2);

        System.out.println("\nResultado: ");
        imprimirMatriz(resultado);
    }

    // Función para multiplicar las matrices
    public static int[] multiplicarMatrices(int[] matriz1, int[] matriz2) {
        int[] resultado = new int[matriz1.length];

        for (int i = 0; i < matriz1.length; i++) {
            resultado[i] = matriz1[i] * matriz2[i];
        }

        return resultado;
    }

    // Función para imprimir la matriz
    public static void imprimirMatriz(int[] matriz) {
        System.out.print("[");
        for (int i = 0; i < matriz.length; i++) {
            System.out.print(matriz[i]);
            if (i != matriz.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
