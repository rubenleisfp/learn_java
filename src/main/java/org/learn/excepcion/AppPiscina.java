package org.learn.excepcion;

public class AppPiscina {
    public static void main(String[] args) {
        Piscina piscina = new Piscina(1000);
        try {
            piscina.anhadirLitros(500);
            System.out.println(piscina.getCapacidadActual());
            piscina.anhadirLitros(600);
            System.out.println(piscina.getCapacidadActual());
            piscina.quitarLitros(500);
            System.out.println(piscina.getCapacidadActual());
            piscina.quitarLitros(700);
            System.out.println(piscina.getCapacidadActual());
        } catch (PiscinaException e) {
            System.out.println(e.getMessage());
        }
    }
}
