package org.learn.colecciones.actividad516;

public class Jugador {

    private String nombre;

    public Jugador(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Jugador{" +
                "nombre=" + nombre +
                '}';
    }
}
