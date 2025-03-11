package org.learn.basico.actividad216;
public class Primos {
    public static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i < numero; i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int sumaPrimosHasta100() {
        int suma = 0;
        for (int i = 2; i <= 100; i++) {
            if (esPrimo(i)) {
                suma += i;
            }
        }
        return suma;
    }

}