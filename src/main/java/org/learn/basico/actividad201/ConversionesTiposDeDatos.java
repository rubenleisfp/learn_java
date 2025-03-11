package org.learn.basico.actividad201;

public class ConversionesTiposDeDatos {
	public static void main(String[] args) {
		// Declaración de variables de diferentes tipos de datos
		char caracter = 'A';
		String texto = "123";
		int numeroEntero = 42;
		double numeroDecimal = 3.14159;
		boolean booleano = true;

		// Impresión de los valores originales
		System.out.println("Valores originales:");
		System.out.println("char: " + caracter);
		System.out.println("String: " + texto);
		System.out.println("int: " + numeroEntero);
		System.out.println("double: " + numeroDecimal);
		System.out.println("boolean: " + booleano);

		// Conversión de String a int
		int textoAEntero = Integer.parseInt(texto);
		System.out.println("\nConversión de String a int: " + textoAEntero);

		// Conversión de int a String
		String enteroATexto = Integer.toString(numeroEntero);
		System.out.println("Conversión de int a String: " + enteroATexto);

		// Conversión de int a double
		double enteroADouble = numeroEntero;
		System.out.println("Conversión de int a double: " + enteroADouble);

		// Conversión de double a int
		int doubleAEntero = (int) numeroDecimal;
		System.out.println("Conversión de double a int: " + doubleAEntero);

		// Conversión de boolean a String
		String booleanoATexto = Boolean.toString(booleano);
		System.out.println("Conversión de boolean a String: " + booleanoATexto);

		// Conversión de String a boolean
		boolean textoABooleano = Boolean.parseBoolean("true");
		System.out.println("Conversión de String a boolean: " + textoABooleano);
	}
}
