package org.learn.colecciones.actividad504;

import java.util.HashMap;

public class AppDiccionario {
    public static void main(String[] args) {
        HashMap<String, String> diccionario = new HashMap<>();
        diccionario.put("gato", "cat");
        diccionario.put("perro", "dog");
        diccionario.put("casa", "house");

        System.out.println("Traducción de 'gato': " + diccionario.get("gato"));

        System.out.println("Diccionario completo:");
        for (String clave : diccionario.keySet()) {
            System.out.println(clave + " -> " + diccionario.get(clave));
        }
    }
}
