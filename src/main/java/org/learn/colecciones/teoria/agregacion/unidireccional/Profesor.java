package org.learn.colecciones.teoria.agregacion.unidireccional;

import org.learn.colecciones.teoria.relaciones.asociacion.Alumno;

public class Profesor {

    private String nombre;
    private int clave;


    Profesor(int clave, String nombre) {
        this.clave = clave;
        this.nombre = nombre;
    }

    void evaluar(Alumno alumno) {
        System.out.println("Profesor con id " + this.clave + " Evaluando a " + alumno.getNombre());
    }


    @Override
    public String toString() {
        return "Profesor{" +
                "nombre='" + nombre + '\'' +
                ", clave=" + clave +
                '}';
    }
}