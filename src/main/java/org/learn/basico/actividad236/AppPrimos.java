package org.learn.basico.actividad236;

public class AppPrimos {

    public static void main(String[] args) {
        boolean esPrimo = Primos.esPrimo(5);
        System.out.println("5 " + esPrimo);

        esPrimo = Primos.esPrimo(4);
        System.out.println("4 " + esPrimo);

        int sumaPrimosHasta100 = Primos.sumaPrimosHasta100();
        System.out.println(sumaPrimosHasta100);

    }
}
