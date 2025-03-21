package org.learn.basico.actividad262;

public class NumeroPalabras {

    public static void main(String[] args) {
        System.out.println(numPalabras("me gusta mucho Java"));
    }

    private static int numPalabras(String palabra) {
        return palabra.split(" ").length;
    }
}
