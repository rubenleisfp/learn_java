package org.learn.colecciones.actividad516;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AppCartaMasAlta {
    public static void main(String[] args) {
        AppCartaMasAlta appCartaMasAlta = new AppCartaMasAlta();
        appCartaMasAlta.run();
    }

    private void run() {
        Scanner scanner = new Scanner(System.in);

        //Obtener el numero de rondas
        System.out.println("Introduza el numero de rondas: " );
        String numRondasStr = scanner.nextLine();
        int numRondas = Integer.parseInt(numRondasStr);


        //Obtener los jugadores
        String nombreJugador = "";
        List<Jugador> jugadores = new ArrayList<>();

        do {
            System.out.println("Introduza un nombre de jugador: " );

            nombreJugador= scanner.nextLine();

            // Solo añade el jugador si el nombre no es "FIN"
            if (!nombreJugador.equalsIgnoreCase("FIN")) {
                jugadores.add(new Jugador(nombreJugador));
            }
        } while (!nombreJugador.equals("FIN"));

        //Arrancar partida
        Partida partida = new Partida(numRondas,jugadores);
        partida.comenzar();
    }
}
