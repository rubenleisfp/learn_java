package org.learn.colecciones.actividad515;

class Pelicula {
    private String titulo;
    private String genero;
    private double calificacion;

    public Pelicula(String titulo, String genero, double calificacion) {
        this.titulo = titulo;
        this.genero = genero;
        this.calificacion = calificacion;
    }

    public String getGenero() {
        return genero;
    }

    public double getCalificacion() {
        return calificacion;
    }

    @Override
    public String toString() {
        return titulo + " (" + genero + ") - Calificación: " + calificacion;
    }
}