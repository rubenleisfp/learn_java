package org.learn.basico.actividad203;

public class IntercambiarVariables {

    public static void main(String[] args) {
        int a = 5;
        int b = 10;

        System.out.println("Variables Iniciales");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        int aux = a;
        a = b;
        b = aux;

        System.out.println("Variables Intercambiadas");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
