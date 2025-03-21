package org.learn.basico.actividad261;

public class TotalCaracteres {

    public static void main(String[] args) {
        System.out.println(totalCaracteres("hola"));
    }

    private static int totalCaracteres(String palabra) {
        return palabra.length();
    }
}
