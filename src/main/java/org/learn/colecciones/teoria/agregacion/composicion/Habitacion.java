package org.learn.colecciones.teoria.agregacion.composicion;

class Habitacion {
    private String nombre;

    public Habitacion(String nombre) {
        this.nombre = nombre;
    }

    public void mostrar() {
        System.out.println("Habitación: " + nombre);
    }
}
