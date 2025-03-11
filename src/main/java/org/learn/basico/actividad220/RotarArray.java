package org.learn.basico.actividad220;
public class RotarArray {
    public static void main(String[] args) {
        // Definir el vector inicial de forma hardcodeada
        int[] vectorInicial = {1, 2, 3, 4};

        System.out.println("Vector original:");
        imprimirVector(vectorInicial);

        // Rotar el vector
        int[] vectorRotado = rotarVector(vectorInicial);

        System.out.println("\nVector rotado:");
        imprimirVector(vectorRotado);
    }

    // Función para rotar el vector
    public static int[] rotarVector(int[] vector) {
        int longitud = vector.length;
        int[] vectorRotado = new int[longitud];


        // Los demás elementos se mueven una posición hacia la derecha
        for (int i = 0; i < longitud; i++) {
        	int j = longitud-i-1;
        	//System.out.println(indice);
            vectorRotado[j] = vector[i];
        }

        return vectorRotado;
    }

    // Función para imprimir el vector
    public static void imprimirVector(int[] vector) {
        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i] + " ");
        }
        System.out.println();
    }
}
