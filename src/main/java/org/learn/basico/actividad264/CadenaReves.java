package org.learn.basico.actividad264;

public class CadenaReves {
    public static void main(String[] args) {
        System.out.println(cadenaReves("Me gusta mucho la programación"));
    }

    private static String cadenaReves(String frase) {
        String[] palabras= frase.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i= palabras.length-1;i>=0;i--) {
            sb.append(palabras[i]);
            sb.append(" ");
        }
        return sb.toString();
    }
}
