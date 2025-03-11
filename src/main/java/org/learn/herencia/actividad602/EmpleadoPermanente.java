package org.learn.herencia.actividad602;
// Clase EmpleadoPermanente
public class EmpleadoPermanente extends Empleado {
    private double beneficios;

    public EmpleadoPermanente(String nombre, double salario, double beneficios) {
        super(nombre, salario);
        this.beneficios = beneficios;
    }

    @Override
    public double calcularSalarioAnual() {
        return salario*12 + beneficios;
    }
}