package org.learn.clases.actividad314;

public class App {

    public static void main(String[] args) {
        // Crear una instancia de NaveEspacial con límites definidos
        NaveEspacial nave = new NaveEspacial(10, 0, 0, 10);
        System.out.println(nave.toString());
        	
        // Imprimir la posición inicial de la nave
        System.out.println("Posición inicial: (" + nave.getX() + ", " + nave.getY() + ")");

        // Movimientos de la nave y prueba de límites
        System.out.println("Moviendo la nave hacia la derecha: " + nave.moverDerecha());
        System.out.println("Posición después de mover derecha: (" + nave.getX() + ", " + nave.getY() + ")");

        System.out.println("Moviendo la nave hacia la izquierda: " + nave.moverIzquierda());
        System.out.println("Posición después de mover izquierda: (" + nave.getX() + ", " + nave.getY() + ")");

        System.out.println("Moviendo la nave hacia arriba: " + nave.moverArriba());
        System.out.println("Posición después de mover arriba: (" + nave.getX() + ", " + nave.getY() + ")");

        System.out.println("Moviendo la nave hacia abajo: " + nave.moverAbajo());
        System.out.println("Posición después de mover abajo: (" + nave.getX() + ", " + nave.getY() + ")");

        // Intentar mover más allá de los límites
        System.out.println("Intentando mover la nave hacia la izquierda más allá del límite: " + nave.moverIzquierda());
        System.out.println("Intentando mover la nave hacia la abajo más allá del límite: " + nave.moverAbajo());

        // Imprimir la posición final de la nave
        System.out.println("Posición final: (" + nave.getX() + ", " + nave.getY() + ")");
    }
}
