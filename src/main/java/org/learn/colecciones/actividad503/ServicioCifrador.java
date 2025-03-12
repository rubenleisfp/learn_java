package org.learn.colecciones.actividad503;

import java.util.HashMap;
import java.util.Map;

public class ServicioCifrador {

    private Map<Character, Character> cifrado;
    private Map<Character, Character> descifrado;

    public ServicioCifrador() {
        // Mapa para cifrar y descifrar
        this.cifrado = new HashMap<>();
        this.cifrado.put('0', '1');
        this.cifrado.put('1', '9');
        this.cifrado.put('2', '3');
        this.cifrado.put('3', '7');
        this.cifrado.put('4', '8');
        this.cifrado.put('5', '6');
        this.cifrado.put('6', '2');
        this.cifrado.put('7', '4');
        this.cifrado.put('8', '5');
        this.cifrado.put('9', '0');

        // Mapa para descifrar
        Map<Character, Character> descifrado = new HashMap<>();
        for (Map.Entry<Character, Character> entry : this.cifrado.entrySet()) {
            descifrado.put(entry.getValue(), entry.getKey());
        }
    }


    public String cifrarTelefono(String telefono) {
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

    public String descifrarTelefono(String telefono) {
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
