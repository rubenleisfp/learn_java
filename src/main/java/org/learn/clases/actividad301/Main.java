package org.learn.clases.actividad301;

public class Main {
    public static void main(String[] args) {
        // Crear un objeto de tipo Circulo con un radio de 5
        Circulo circulo = new Circulo(5.0);

        // Calcular y mostrar el perímetro
        double perimetro = circulo.calcularPerimetro();
        System.out.println("Perímetro del círculo: " + perimetro);

        // Calcular y mostrar el área
        double area = circulo.calcularArea();
        System.out.println("Área del círculo: " + area);
    }
}
