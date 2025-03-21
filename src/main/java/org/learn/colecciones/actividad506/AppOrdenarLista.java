package org.learn.colecciones.actividad506;

import java.util.ArrayList;
import java.util.Collections;

public class AppOrdenarLista {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(5);
        numeros.add(1);
        numeros.add(8);
        numeros.add(3);
        numeros.add(2);

        System.out.println("Lista antes de ordenar: " + numeros);

        Collections.sort(numeros);

        System.out.println("Lista ordenada: " + numeros);
    }
}
