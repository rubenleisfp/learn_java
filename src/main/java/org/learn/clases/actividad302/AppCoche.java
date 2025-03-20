package org.learn.clases.actividad302;

public class AppCoche {
    public static void main(String[] args) {
        Motor motor = new Motor(150, "Gasolina");
        Coche coche = new Coche("Toyota", "Corolla", motor);
        coche.mostrarInfo();
    }
}