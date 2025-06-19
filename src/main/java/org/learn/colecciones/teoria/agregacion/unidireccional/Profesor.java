package org.learn.colecciones.teoria.agregacion.unidireccional;


public class Profesor {

    private String nombre;
    private int clave;


    Profesor(int clave, String nombre) {
        this.clave = clave;
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Profesor{" +
                "nombre='" + nombre + '\'' +
                ", clave=" + clave +
                '}';
    }
}