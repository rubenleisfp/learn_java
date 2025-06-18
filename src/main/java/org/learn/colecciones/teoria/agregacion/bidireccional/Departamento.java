package org.learn.colecciones.teoria.agregacion.bidireccional;

import java.util.List;

class Departamento {
    private String nombre;
    private List<Profesor> profesores; // agregación

    public Departamento(String nombre,List<Profesor> profesores) {
        this.nombre = nombre;
        this.profesores = profesores;
    }

    public List<Profesor> getProfesores() {
        return profesores;
    }

    @Override
    public String toString() {
        return "Departamento{" +
                "nombre='" + nombre + '\'' +
                ", profesores=" + profesores +
                '}';
    }
}