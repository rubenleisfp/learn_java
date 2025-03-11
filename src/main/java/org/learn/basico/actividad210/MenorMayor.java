package org.learn.basico.actividad210;

import java.util.Scanner;

public class MenorMayor {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int[] numero = new int[4];
		int maximo = Integer.MIN_VALUE;
		int minimo = Integer.MAX_VALUE;
		int posicionMaximo = 0;
		int posicionMinimo = 0;
		System.out.println("Introduzca 10 números");
		for (int i = 0; i < numero.length; i++) {
			numero[i] = s.nextInt();
			if (numero[i] <= minimo) {
				minimo = numero[i];
				posicionMinimo = i;
			}
			if (numero[i] >= maximo) {
				maximo = numero[i];
				posicionMaximo = i;
			}
		}
		System.out.println("El máximo es: " + maximo + " y la posición es: " + (posicionMaximo));
		System.out.println("El mínimo es: " + minimo + " y la posición es: " + (posicionMinimo));
	}
}