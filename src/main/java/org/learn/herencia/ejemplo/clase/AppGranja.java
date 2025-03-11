package org.learn.herencia.ejemplo.clase;

import java.util.ArrayList;
import java.util.List;

public class AppGranja {
    public static void main(String[] args) {
        Animal animal1 = new Lobo();
        Animal animal2 = new Pato();
        Animal animal3 = new Cabra();

        List<Animal> granja = new ArrayList<>();
        granja.add(animal1);
        granja.add(animal2);
        granja.add(animal3);

        for (Animal animal:  granja) {
           animal.animalSound();
           animal.sleep();
        }
    }
}
