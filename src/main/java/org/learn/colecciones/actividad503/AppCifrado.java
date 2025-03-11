package org.learn.colecciones.actividad503;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AppCifrado {
	public static void main(String[] args) {
		// Mapa para cifrar y descifrar
		Map<Character, Character> cifrado = new HashMap<>();
		cifrado.put('0', '1');
		cifrado.put('1', '9');
		cifrado.put('2', '3');
		cifrado.put('3', '7');
		cifrado.put('4', '8');
		cifrado.put('5', '6');
		cifrado.put('6', '2');
		cifrado.put('7', '4');
		cifrado.put('8', '5');
		cifrado.put('9', '0');

		// Mapa para descifrar
		Map<Character, Character> descifrado = new HashMap<>();
		for (Map.Entry<Character, Character> entry : cifrado.entrySet()) {
			descifrado.put(entry.getValue(), entry.getKey());
		}

		Scanner scanner = new Scanner(System.in);
		System.out.println("Introduzca el modo de funcionamiento (C para cifrar, D para descifrar):");
		char modo = scanner.next().charAt(0);
		scanner.nextLine(); // Consumir el salto de línea

		System.out.println("Introduzca el teléfono:");
		String telefono = scanner.nextLine();

		String resultado;
		if (modo == 'C') {
			resultado = cifrarTelefono(telefono, cifrado);
			System.out.println("Teléfono cifrado: " + resultado);
		} else if (modo == 'D') {
			resultado = descifrarTelefono(telefono, descifrado);
			System.out.println("Teléfono descifrado: " + resultado);
		} else {
			System.out.println("Modo de funcionamiento no válido.");
		}
	}

	private static String cifrarTelefono(String telefono, Map<Character, Character> cifrado) {
		StringBuilder cifradoTelefono = new StringBuilder();
		for (char c : telefono.toCharArray()) {
			if (cifrado.containsKey(c)) {
				cifradoTelefono.append(cifrado.get(c));
			} else {
				cifradoTelefono.append(c);
			}
		}
		return cifradoTelefono.toString();
	}

	private static String descifrarTelefono(String telefono, Map<Character, Character> descifrado) {
		StringBuilder descifradoTelefono = new StringBuilder();
		for (char c : telefono.toCharArray()) {
			if (descifrado.containsKey(c)) {
				descifradoTelefono.append(descifrado.get(c));
			} else {
				descifradoTelefono.append(c);
			}
		}
		return descifradoTelefono.toString();
	}
}
