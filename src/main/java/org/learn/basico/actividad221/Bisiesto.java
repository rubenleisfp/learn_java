package org.learn.basico.actividad221;

public class Bisiesto {

    public static void main(String[] args) {
        esBisiesto(2024);
        esBisiesto(2025);
    }

    private static void esBisiesto(int anho) {

        if ((anho % 4 == 0 && anho % 100 != 0) || (anho % 400 == 0)) {
            System.out.println("El año es bisiesto");
        } else {
            System.out.println("El año no es bisiesto");
        }

    }
}
