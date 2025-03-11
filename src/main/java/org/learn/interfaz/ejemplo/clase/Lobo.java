package org.learn.interfaz.ejemplo.clase;

public class Lobo implements Animal, Mamifero {
    @Override
    public void animalSound() {
        System.out.println("Auuuu! auuuu!");
    }

    @Override
    public int tiempoGestacion() {
        return 63;
    }
}
