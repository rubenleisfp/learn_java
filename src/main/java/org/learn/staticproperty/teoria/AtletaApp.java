package org.learn.staticproperty.teoria;

import java.util.Random;

public class AtletaApp {
    public static void main(String[] args) throws InterruptedException {
        Atleta iago = new Atleta("Iago");
        Atleta juan = new Atleta("Juan");
        //Diez avances para todos los atletas
        while (!Atleta.haFinalizadoCarrera()) {
            iago.avanzar(new Random().nextInt(4));
            juan.avanzar(new Random().nextInt(4));
            System.out.println("Avance:");
            System.out.println("Kms de Iago:" + iago.getKms());
            System.out.println("Kms de Juan:" + juan.getKms());
            Thread.sleep(2000);
        }
        System.out.println("Carrera finalizada");
    }
}
