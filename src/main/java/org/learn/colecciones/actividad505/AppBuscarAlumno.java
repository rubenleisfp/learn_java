package org.learn.colecciones.actividad505;

import java.util.ArrayList;

public class AppBuscarAlumno {
    public static void main(String[] args) {
        ArrayList<Alumno> alumnos = new ArrayList<>();
        alumnos.add(new Alumno("Juan", 101));
        alumnos.add(new Alumno("Ana", 102));
        alumnos.add(new Alumno("Pedro", 103));

        int idBuscado = 102;
        boolean encontrado = false;
        
        for (Alumno alumno : alumnos) {
            if (alumno.id == idBuscado) {
                encontrado = true;
                break;
            }
        }

        System.out.println("¿Alumno con ID " + idBuscado + " encontrado? " + encontrado);
    }
}
