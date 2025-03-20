package org.learn.clases.actividad302;

class Coche {
    private String marca;
    private String modelo;
    private Motor motor;

    public Coche(String marca, String modelo, Motor motor) {
        this.marca = marca;
        this.modelo = modelo;
        this.motor = motor;
    }

    public void mostrarInfo() {
        System.out.println("Marca: " + marca + ", Modelo: " + modelo + ", " + motor.getInfoMotor());
    }
}
