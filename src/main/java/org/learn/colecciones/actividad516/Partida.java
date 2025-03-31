package org.learn.colecciones.actividad516;

import java.util.ArrayList;
import java.util.List;

public class Partida {

    private List<Ronda> rondas = new ArrayList<>();

    public Partida (int numRondas, List<Jugador> jugadores) {
        crearRondas(numRondas,jugadores);
    }

    /**
     * Crea las rondas de la partida asignandole los jugadores participantes
     *
     * @param numRondas
     * @param jugadores
     */
    private void crearRondas( int numRondas,List<Jugador> jugadores) {
        for (int i=0;i<numRondas;i++) {
            this.rondas.add(new Ronda(i,jugadores));
        }
    }

    /**
     * Juega las rondas estipuladas en la partida
     */
    public void comenzar() {
        for(Ronda ronda : rondas) {
            ronda.jugarRonda();
            System.out.println("Jugador ganador: " + ronda.getJugadorGanador());
            System.out.println("Carta ganadora: " + ronda.getCartaGanadora());

        }
    }
}
