package org.learn.colecciones.actividad502;

import java.util.ArrayList;

public class AppList {
    public static void main(String[] args) {
        ArrayList<String> ciudades = new ArrayList<>();
        ciudades.add("Madrid");
        ciudades.add("Barcelona");
        ciudades.add("Sevilla");

        System.out.println("Lista inicial: " + ciudades);

        ciudades.add("Valencia");
        System.out.println("Después de añadir Valencia: " + ciudades);

        ciudades.remove(1);
        System.out.println("Después de eliminar la segunda ciudad: " + ciudades);
    }
}