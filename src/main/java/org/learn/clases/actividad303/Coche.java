package org.learn.clases.actividad303;

class Coche {
    private String marca;
    private String modelo;
    private int velocidad;
    private Motor motor;

    public Coche(String marca, String modelo, Motor motor) {
        this.marca = marca;
        this.modelo = modelo;
        this.motor = motor;
    }

    public void mostrarInfo() {
        System.out.println("Marca: " + marca + ", Modelo: " + modelo + ", " + motor.getInfoMotor());
    }

    public void acelerar() {
        velocidad = velocidad+10;
    }
    public void acelerar(int incremento) {
        velocidad = velocidad + incremento;
    }

}
