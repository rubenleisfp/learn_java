package org.learn.colecciones.teoria.relaciones.asociacion;

public class AppAsociacion {
    public static void main(String[] args) {
        Alumno alumno = new Alumno();
        alumno.setNombre("Paco");
        Profesor profesor = new Profesor(1);
        //Recibimos el alumno como parametro en mi funcion
        profesor.evaluar(alumno);
    }
}
