package org.learn.staticproperty.teoria;

import java.util.Objects;

public class Atleta {

    private String nombre;
    private int kms;
    private static int kmTotal = 0;

    public Atleta(String nombre) {
        this.nombre = nombre;
        this.kms = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public int getKms() {
        return kms;
    }

    public void avanzar(int kms) {
        kmTotal = kmTotal + kms;
        this.kms = this.kms + kms;
    }

    public static int getKmTotal() {
        return kmTotal;
    }

    public static boolean haFinalizadoCarrera() {
        return (kmTotal >= 20);
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Atleta atleta = (Atleta) o;
        return kms == atleta.kms && Objects.equals(nombre, atleta.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, kms);
    }

    @Override
    public String toString() {
        return "Atleta{" +
                "nombre='" + nombre + '\'' +
                ", kms=" + kms +
                '}';
    }
}
