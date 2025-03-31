package org.learn.colecciones.actividad516;

import java.util.ArrayList;
import java.util.List;

public class Baraja {

    private List<Carta> cartas = new ArrayList<>();
    private static final int NUM_MAXIMO_CARTA = 12;
    private static final int NUM_PALOS = 4;


    /**
     * Creamos una mano nueva de la baraja
     */
    public void crearBaraja() {
        cartas.clear();
        cartas.addAll(crearPalo("ESPADAS"));
        cartas.addAll(crearPalo("BASTOS"));
        cartas.addAll(crearPalo("COPAS"));
        cartas.addAll(crearPalo("OROS"));
    }

    /**
     * Rellenamos todas las cartas de la baraja para cada palo
     *
     * @return
     */
    public List<Carta> crearPalo(String palo) {
        List<Carta> cartas = new ArrayList<>();
        for (int i=1;i<=NUM_MAXIMO_CARTA;i++) {
            cartas.add(new Carta(palo,i));
        }
        return cartas;
    }

    /**
     * Repartimos una carta de la baraja, quitandola de la misma
     * @return
     */
    public Carta repartirCarta() {
        int randomNum = (int)(Math.random() * (NUM_MAXIMO_CARTA*NUM_PALOS));
        Carta carta = cartas.get(randomNum);
        cartas.remove(randomNum);
        return carta;
    }
}
