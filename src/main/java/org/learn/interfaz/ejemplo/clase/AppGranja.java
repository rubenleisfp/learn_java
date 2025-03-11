package org.learn.interfaz.ejemplo.clase;

import java.util.ArrayList;
import java.util.List;

public class AppGranja {

    public static void main(String[] args) {
        Lobo lobo = new Lobo();
        Pato pato = new Pato();
        Cabra cabra= new Cabra();

        List<Animal> granja = new ArrayList<>();
        granja.add(lobo);
        granja.add(pato);
        granja.add(cabra);

        for (Animal animal: granja) {
            animal.animalSound();
            //
        }



        List<Mamifero> mamiferos = new ArrayList<>();
        mamiferos.add(lobo);
        mamiferos.add(cabra);

        for (Mamifero mamifero: mamiferos) {
            System.out.println(mamifero.tiempoGestacion());
            //
        }


    }
}
