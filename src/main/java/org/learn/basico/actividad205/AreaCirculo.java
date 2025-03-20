package org.learn.basico.actividad205;

public class AreaCirculo {

    public static void main(String[] args) {
        double area = calcularArea(4);
        System.out.println("Area:" + area);
    }

    private static double calcularArea(int radio) {
        double area = Math.PI * Math.pow(radio, 2);
        return area;
    }
}
