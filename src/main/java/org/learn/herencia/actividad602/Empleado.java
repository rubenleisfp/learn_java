package org.learn.herencia.actividad602;
public class Empleado {
    protected String nombre;
    protected double salario;

    public Empleado(String nombre, double salario) {
        this.nombre = nombre;
        this.salario = salario;
    }

    public double calcularSalarioAnual() {
        return salario * 12;
    }
}
