package org.learn.clases.teoria;

public class Alumno {

    private static int numero=1;
    private int id;
    private int edad;
    private String nombre;
    private String apellido;



    public Alumno(int anhos) {
        this.id = numero++;
        this.edad = anhos;
    }

    public static int getNumero() {
        return numero;
    }

    public  String getNombreCompleto() {
        return nombre + " " + apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
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
                ", edad=" + edad +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                '}';
    }
}
