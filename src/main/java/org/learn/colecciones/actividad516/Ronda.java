package org.learn.colecciones.actividad516;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Ronda {

    private final List<Jugador> jugadores;
    private Jugador jugadorGanador;
    private Carta cartaGanadora;
    private final int numRonda;
    private Baraja baraja;

    public Ronda(int numRonda, List<Jugador> jugadores) {
        this.numRonda = numRonda;
        this.jugadores = jugadores;
        this.baraja = new Baraja();
        //inicia la baraja cada vez que creamos una nueva ronda
        this.baraja.crearBaraja();
    }

    public Carta getCartaGanadora() {
        return cartaGanadora;
    }

    public Jugador getJugadorGanador() {
        return jugadorGanador;
    }

    public int getNumRonda() {
        return numRonda;
    }

    /**
     * Reparte una carta a cada jugador y evalua el ganador
     */
    public void jugarRonda() {
        Map<Jugador,Carta> cartasJugadores = repartirCarta();
        evaluarGanador(cartasJugadores);

    }

    /**
     * Revisa todas las cartas de los jugadores y asigna el rol de ganador a la carta mas alta
     *
     * Ante cartas iguales, ganará el primero
     *
     * @param cartasJugadores
     */
    private void evaluarGanador(Map<Jugador,Carta> cartasJugadores ) {
        for (Jugador jugador:cartasJugadores.keySet()) {
            Carta carta = cartasJugadores.get(jugador);
            if (cartaGanadora == null || carta.getNumero()>cartaGanadora.getNumero()) {
                cartaGanadora = carta;
                jugadorGanador = jugador;
            }
        }
    }

    /**
     * Reparte una carta a cada jugador
     * @return
     */
    private Map<Jugador, Carta> repartirCarta() {
        System.out.println("Repartimos cartas entre jugadores:");
        Map<Jugador, Carta> cartasJugadores = new HashMap<>();
        for (Jugador jugador : jugadores) {
            Carta carta = baraja.repartirCarta();
            System.out.println("El jugador " + jugador + " ha extraido la carta " + carta);
            cartasJugadores.put(jugador,carta);
        }
        return cartasJugadores;
    }

}
