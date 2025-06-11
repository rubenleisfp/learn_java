package org.learn.clases.actividad315;

public class Coche {
    private String marca;
    private String modelo;
    private Motor motor;

    public Coche(String marca, String modelo, Motor motor) {
        this.marca = marca;
        this.modelo = modelo;
        this.motor = motor;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public Motor getMotor() {
        return motor;
    }

    @Override
    public String toString() {
        return "Coche: " + marca + " " + modelo + "\nMotor: " + motor;
    }
}
