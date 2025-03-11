package org.learn.interfaz.ejemplo.clase;

public class Cabra implements Animal, Mamifero{
    @Override
    public void animalSound() {
        System.out.println("Beee beee!");
    }

    @Override
    public int tiempoGestacion() {
        return 150;
    }
}
