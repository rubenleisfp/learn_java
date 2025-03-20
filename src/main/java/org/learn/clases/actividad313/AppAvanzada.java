package org.learn.clases.actividad313;

public class AppAvanzada {
	// Método main para probar la funcionalidad de la clase
	public static void main(String[] args) {
		// Crear una cuenta con titular y cantidad
		CuentaAvanzada cuentaRuben = new CuentaAvanzada("Ruben", 1000);
		CuentaAvanzada cuentaBrais = new CuentaAvanzada("Brais", 0);

		// Imprimir los datos de la cuenta
		System.out.println("Datos de la cuenta:");
		cuentaRuben.transferencia(500, cuentaBrais);

		System.out.println("CuentaJuan: " + cuentaRuben.getCantidad());
		System.out.println("CuentaAna: " + cuentaBrais.getCantidad());

	}
}
