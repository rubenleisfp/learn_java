package org.learn.clases.actividad312;
public class Cuenta {
    private String titular;
    private double saldo;



    // Constructor con titular obligatorio y cantidad opcional
    public Cuenta(String titular) {
        this.titular = titular;
        this.saldo = 0;
    }

    // Constructor con titular y cantidad
    public Cuenta(String titular, double cantidad) {
        this.titular = titular;
        if (cantidad >= 0) {
            this.saldo = cantidad;
        } else {
            this.saldo = 0;
        }
    }

    // Métodos getter y setter
    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double cantidad) {
        if (cantidad >= 0) {
            this.saldo = cantidad;
        }
    }

    // Método para ingresar dinero en la cuenta
    public void ingresar(double cantidad) {
        if (cantidad > 0) {
            this.saldo += cantidad;
        }
    }

    // Método para retirar dinero de la cuenta
    public void retirar(double cantidad) {
        if (this.saldo - cantidad >= 0) {
            this.saldo -= cantidad;
        } else {
            this.saldo = 0;
        }
    }

    // Método toString para imprimir los datos de la cuenta
    @Override
    public String toString() {
        return "Cuenta{" +
                "titular='" + titular + '\'' +
                ", saldo=" + saldo +
                '}';
    }
}
