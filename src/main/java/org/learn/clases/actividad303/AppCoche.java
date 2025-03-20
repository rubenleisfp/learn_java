package org.learn.clases.actividad303;

public class AppCoche {
    public static void main(String[] args) {
        Motor motor1 = new Motor(150, "Gasolina");
        Coche coche1 = new Coche("Toyota", "Corolla", motor1);

        Motor motor2 = new Motor(100, "Gasolina");
        Coche coche2 = new Coche("Kia", "Ceed", motor2);

        coche1.mostrarInfo();
        coche1.acelerar();
        coche2.acelerar();
        coche2.mostrarInfo();

        coche1.mostrarInfo();
        coche1.acelerar((int) (Math.random() * 10));
        coche1.acelerar((int) (Math.random() * 10));
        coche2.mostrarInfo();
    }
}