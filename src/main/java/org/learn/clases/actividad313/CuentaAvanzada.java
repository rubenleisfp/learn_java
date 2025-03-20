package org.learn.clases.actividad313;
public class CuentaAvanzada {
    private String titular;
    private double cantidad;

    // Constructor con titular obligatorio y cantidad opcional
    public CuentaAvanzada(String titular) {
        this.titular = titular;
        this.cantidad = 0;
    }

    // Constructor con titular y cantidad
    public CuentaAvanzada(String titular, double cantidad) {
        this.titular = titular;
        if (cantidad >= 0) {
            this.cantidad = cantidad;
        } else {
            this.cantidad = 0;
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
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        if (cantidad >= 0) {
            this.cantidad = cantidad;
        }
    }

    // Método para ingresar dinero en la cuenta
    public void ingresar(double cantidad) {
        if (cantidad > 0) {
            this.cantidad += cantidad;
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
            this.cantidad -= cantidad;
        } else {
            this.cantidad = 0;
        }
    }

	private boolean tieneSaldo(double cantidad) {
		return this.cantidad - cantidad >= 0;
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
