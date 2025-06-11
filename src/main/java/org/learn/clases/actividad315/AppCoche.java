package org.learn.clases.actividad315;

public class AppCoche {
    public static void main(String[] args) {
        Motor m1 = new Motor("Gasolina", 110);
        Motor m2 = new Motor("Eléctrico", 136);

        Coche coche1 = new Coche("Toyota", "Yaris", m1);
        Coche coche2 = new Coche("Renault", "ZOE", m2);

        System.out.println(coche1);
        System.out.println();
        System.out.println(coche2);
    }
}
