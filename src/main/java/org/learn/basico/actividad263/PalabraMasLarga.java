package org.learn.basico.actividad263;

public class PalabraMasLarga {

    public static void main(String[] args) {
        System.out.println(palabraMasLarga("me gusta muchisimo Java"));
    }

    private static String palabraMasLarga(String palabra) {
        String[] palabras = palabra.split(" ");
        String palabraMasLarga = palabras[0];
        for (int i = 1; i < palabras.length; i++) {
            if (palabras[i].length() > palabraMasLarga.length()) {
                palabraMasLarga = palabras[i];
            }
        }
        return palabraMasLarga;
    }
}
