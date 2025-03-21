package org.learn.colecciones.actividad503;

import java.util.HashSet;

public class AppSet {
    public static void main(String[] args) {
        HashSet<Integer> numeros = new HashSet<>();
        numeros.add(10);
        numeros.add(20);
        numeros.add(30);
        numeros.add(20);
        numeros.add(10);
        numeros.add(40);
        numeros.add(50);

        System.out.println("Elementos del HashSet: " + numeros);
        // Los valores duplicados no se almacenan porque HashSet no permite duplicados
    }
}