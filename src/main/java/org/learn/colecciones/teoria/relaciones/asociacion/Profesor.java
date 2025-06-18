package org.learn.colecciones.teoria.relaciones.asociacion;

public class Profesor {

    private int clave;

    Profesor (int clave) {
        this.clave = clave;
    }

    void evaluar(Alumno alumno) {
        System.out.println("Profesor con id " + this.clave + " Evaluando a " + alumno.getNombre());
    }

    @Override
    public String toString() {
        return "Profesor{" +
                "clave=" + clave +
                '}';
    }
}