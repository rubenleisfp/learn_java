package org.learn.clases.space_invaders;

public class Nave {

    private String nombre;
    private int vida;
    private int ataque;

    public Nave(String nombre, int vida, int ataque) {
        this.nombre = nombre;
        this.vida = vida;
        this.ataque = ataque;
    }

    public String getNombre() {
        return nombre;
    }

    public int getVida() {
        return vida;
    }

    public int getAtaque() {
        return ataque;
    }

    public void atacar(Nave naveAtacada) {
        naveAtacada.vida = naveAtacada.vida - this.ataque;
    }

    @Override
    public String toString() {
        return "Nave{" +
                "nombre='" + nombre + '\'' +
                ", vida=" + vida +
                ", ataque=" + ataque +
                '}';
    }
}

