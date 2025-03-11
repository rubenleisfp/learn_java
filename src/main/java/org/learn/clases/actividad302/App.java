package org.learn.clases.actividad302;

public class App {

	public static void main(String[] args) {

	     // Crear una cuenta con titular y cantidad
        Cuenta cuenta1 = new Cuenta("Juan", Double.parseDouble("100"));

        // Imprimir los datos de la cuenta
        System.out.println("Datos de la cuenta:");
        System.out.println(cuenta1);

        // Ingresar dinero en la cuenta
        cuenta1.ingresar(Double.parseDouble("50"));

        // Imprimir los datos de la cuenta después de ingresar dinero
        System.out.println("\nDatos de la cuenta después de ingresar dinero:");
        System.out.println(cuenta1);

        // Retirar dinero de la cuenta
        cuenta1.retirar(Double.parseDouble("100"));

        // Imprimir los datos de la cuenta después de retirar dinero
        System.out.println("\nDatos de la cuenta después de retirar dinero:");
        System.out.println(cuenta1);
        
        // Retirar dinero de la cuenta
        cuenta1.retirar(Double.parseDouble("100"));

        // Imprimir los datos de la cuenta después de retirar dinero
        System.out.println("\nDatos de la cuenta después de retirar dinero:");
        System.out.println(cuenta1);

	}

}
