package org.learn.clases.actividad301;

public class Circulo {
    // Atributo
    private double radio;

    // Constructor
    public Circulo(double radio) {
        this.radio = radio;
    }

    // Método para calcular el perímetro (circunferencia)
    public double calcularPerimetro() {
        return 2 * Math.PI * radio;
    }

    // Método para calcular el área
    public double calcularArea() {
        return Math.PI * Math.pow(radio, 2);
    }

    // Método getter para obtener el radio
    public double getRadio() {
        return radio;
    }

    // Método setter para establecer el radio
    public void setRadio(double radio) {
        this.radio = radio;
    }
}
