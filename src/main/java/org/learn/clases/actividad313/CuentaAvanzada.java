package org.learn.clases.actividad313;
public class CuentaAvanzada {
    private String titular;
    private double cantidad;

    // Constructor con titular obligatorio y cantidad opcional
    public CuentaAvanzada(String titular) {
        //TODO a completar por el alumno
    }

    // Constructor con titular y cantidad
    public CuentaAvanzada(String titular, double cantidad) {
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
    
    // Método para ingresar dinero en la cuenta
    public void transferencia(double cantidad, CuentaAvanzada cuentaDestino) {
        //TODO a completar por el alumno
    }

    // Método para retirar dinero de la cuenta
    public void retirar(double cantidad) {
        //TODO a completar por el alumno
    }

	private boolean tieneSaldo(double cantidad) {
        //TODO a completar por el alumno
        return true;
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
