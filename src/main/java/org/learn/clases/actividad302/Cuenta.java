package org.learn.clases.actividad302;
public class Cuenta {
    private String titular;
    private double cantidad;



    // Constructor con titular obligatorio y cantidad opcional
    public Cuenta(String titular) {
        throw new UnsupportedOperationException("A implementar por el alumno");
    }

    // Constructor con titular y cantidad
    public Cuenta(String titular, double cantidad) {
        throw new UnsupportedOperationException("A implementar por el alumno");
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

    }

    // Método para ingresar dinero en la cuenta
    public void ingresar(double cantidad) {
        throw new UnsupportedOperationException("A implementar por el alumno");
    }

    // Método para retirar dinero de la cuenta
    public void retirar(double cantidad) {
        throw new UnsupportedOperationException("A implementar por el alumno");
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
