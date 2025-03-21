package org.learn.basico.actividad260;

public class RepetirPalabra {

    public static void main(String[] args) {
        System.out.println(repetirPalabra("hola", 5));
    }

    private static String repetirPalabra(String palabra, int numVeces) {
        String palabraRepetida = "";
        for (int i=0; i<numVeces;i++) {
            palabraRepetida = palabraRepetida + " " + palabra;
        }
        return palabraRepetida;
    }
}
