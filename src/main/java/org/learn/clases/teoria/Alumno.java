package org.learn.clases.teoria;

public class Alumno {

    private int id;
    private String nombre;
    private int edad;

    public Alumno() {

    }

    public Alumno(int id, String nombre, int edad) {
        //This hace referencia al objeto actual que esta construyendose: juan, iago..., etc
        //this.id = id; la parte de la izquierda se refiere al atributo de Alumno, la de la derecha es el argumento
        //que recibimos en el constructor
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                '}';
    }
}
