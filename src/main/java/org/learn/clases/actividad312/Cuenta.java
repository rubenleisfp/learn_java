package org.learn.clases.actividad312;
public class Cuenta {
    private String titular;
    private double cantidad;



    // Constructor con titular obligatorio y cantidad opcional
    public Cuenta(String titular) {
        //TODO a completar por el alumno
    }

    // Constructor con titular y cantidad
    public Cuenta(String titular, double cantidad) {
        //TODO a completar por el alumno
    }

    // Métodos getter y setter
    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        //TODO a completar por el alumno
    }

    // Método para ingresar dinero en la cuenta
    public void ingresar(double cantidad) {
        //TODO a completar por el alumno
    }

    // Método para retirar dinero de la cuenta
    public void retirar(double cantidad) {
        //TODO a completar por el alumno
    }

    // Método toString para imprimir los datos de la cuenta
    @Override
    public String toString() {
        return "Cuenta{" +
                "titular='" + titular + '\'' +
                ", cantidad=" + cantidad +
                '}';
    }
}
