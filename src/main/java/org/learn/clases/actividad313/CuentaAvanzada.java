package org.learn.clases.actividad313;
public class CuentaAvanzada {
    private String titular;
    private double saldo;

    // Constructor con titular obligatorio y cantidad opcional
    public CuentaAvanzada(String titular) {
        this.titular = titular;
        this.saldo = 0;
    }

    // Constructor con titular y cantidad
    public CuentaAvanzada(String titular, double saldo) {
        this.titular = titular;
        if (saldo >= 0) {
            this.saldo = saldo;
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

    public double getCantidad() {
        return saldo;
    }

    public void setCantidad(double cantidad) {
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
    
    // Método para ingresar dinero en la cuenta
    public void transferencia(double cantidad, CuentaAvanzada cuentaDestino) {
       if (this.tieneSaldo(cantidad)) {
    	   this.retirar(cantidad);
       	   cuentaDestino.ingresar(cantidad);
       }
    }

    // Método para retirar dinero de la cuenta
    public void retirar(double cantidad) {
        if (tieneSaldo(cantidad)) {
            this.saldo -= cantidad;
        } else {
            this.saldo = 0;
        }
    }

	private boolean tieneSaldo(double cantidad) {
        return this.saldo - cantidad >= 0;
	}


    // Método toString para imprimir los datos de la cuenta
    @Override
    public String toString() {
        return "Cuenta{" +
                "titular='" + titular + '\'' +
                ", cantidad=" + saldo +
                '}';
    }

 
}
