package org.learn.herencia.actividad602;
// Clase EmpleadoTemporal
public class EmpleadoTemporal extends Empleado {
    private int duracionContrato;

    public EmpleadoTemporal(String nombre, double salario, int duracionContrato) {
        super(nombre, salario);
        this.duracionContrato = duracionContrato;
    }

    @Override
    public double calcularSalarioAnual() {
        return salario * duracionContrato;
    }
}