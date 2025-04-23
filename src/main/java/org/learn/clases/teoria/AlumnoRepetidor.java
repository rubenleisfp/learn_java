package org.learn.clases.teoria;

public class AlumnoRepetidor extends Alumno {
    private int aniosRepetidos;


    public AlumnoRepetidor(int id, String nombre, int edad, int aniosRepetidos) {
        super(id, nombre, edad);
        this.aniosRepetidos = aniosRepetidos;
    }

    @Override
    public String toString() {
        return "AlumnoRepetidor{" +
                "aniosRepetidos=" + aniosRepetidos +
                "} " + super.toString();
    }
}
