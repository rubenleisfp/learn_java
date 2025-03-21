package org.learn.basico.actividad205;

public class AreaCuadrado {

    public static void main(String[] args) {
        double area = calcularArea(4);
        System.out.println("Area:" + area);
    }

    private static double calcularArea(int lado) {
        double area = lado * lado;
        return area;
    }

    private static double calcularPerimetro(int lado) {
        double area = lado *4;
        return area;
    }
}
