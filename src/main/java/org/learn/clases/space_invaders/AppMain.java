package org.learn.clases.space_invaders;

public class AppMain {

    public static void main(String[] args) {
        Nave n1 = new Nave("misterio",50, 10);
        Nave n2 = new Nave("halcon milenario", 30, 30);

        System.out.println(n1);
        System.out.println(n2);

        System.out.println("Comenzando guerra");
        while (n1.getVida()>0 && n2.getVida()>0) {
            n1.atacar(n2);
            n2.atacar(n1);
            System.out.println(n1);
            System.out.println(n2);
            System.out.println("________________");
        }



    }
}
