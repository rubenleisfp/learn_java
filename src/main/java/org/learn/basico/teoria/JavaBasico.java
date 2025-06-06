package org.learn.basico.teoria;

import java.math.BigDecimal;
import java.util.*;


public class JavaBasico {

    public static void main(String[] args) {
        // TIPOS BASICO
        //tiposBasicos();

        // CASTING
        // casting();

        // OPERADORES
        // operadores();

        // CONDICIONALES
        // condicionales();

        // STRING
        // tipoString();

        // BUCLES
        // bucles();

        // METODOS
        // metodos();

        // ARRAYS
        //arrays();

        // COLLECTION
        //collectionsList();

        //collectionsListPersona();

        //collectionsSet();

        // MAP
        //collectionsMap();
        //collectionsMapPersona();

    }



    private static void arrays() {


        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        //System.out.println(cars[1]);
        //System.out.println(cars[4]);


        // String[] cars = {"Volvo", "BMW", "KIA", "Mazda"};
        cars[2] = "KIA";
        System.out.println(Arrays.toString(cars));
        System.out.println(cars.length);

        for (String coche : cars) {
            System.out.println(coche);
        }

        int loteria[] = new int[4];

        // int loteria2[] = new int[4];

        loteria[0] = 7;
        loteria[1] = 13;
        loteria[2] = 2313;

        loteria[3] = 5;

        for (int i = 0; i < loteria.length; i++) {
            System.out.println(loteria[i]);
        }

        for (int i : loteria) {
            System.out.println(i);
        }

        System.out.println(Arrays.toString(loteria));

    }

    private static void bucles() {
        // while
        int i = 0;
        while (i < 5) {
            System.out.println(i);
            i++;
        }

        // do while
        int j = 4;
        do {
            System.out.println(j);
            j++;
        } while (i < 5);

        // for
        for (int h = 0; h <= 3; i++) {
            System.out.println(h);
        }

        for (int h = 0; h < 10; h++) {
            if (h == 4) {
                break;
            }
            System.out.println(h);
        }

    }

    // STRING
    private static void tipoString() {


        // Cadenas de texto

        // Declaración

        String name = "Ruben";
        var surname = new String("Leis");

        // Operaciones básicas

        // Concatenación
        System.out.println(name + " " + surname);

        // Longitud
        System.out.println(name.length());

        // Obtener caracter
        System.out.println(name.charAt(name.length() - 1));

        // Subcadena
        System.out.println(name.substring(2));
        System.out.println(name.substring(1, 3));

        // Mayúsculas y minúsculas
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());

        System.out.println(name);

        // Comprobar si contiene
        System.out.println("Hola, Java".contains("Brais"));
        System.out.println("Hola, Java".toUpperCase().contains("AVA"));

        // Comparación
        System.out.println(name.equals("Ruben"));
        System.out.println(name.equals("ruben"));
        System.out.println(name.equalsIgnoreCase("ruben"));

        // == vs. equals

        var a = "Ruben";
        var b = "Ruben";
        var c = new String("Ruben");

        System.out.println(a == b);
        System.out.println(a == c);
        System.out.println(a.equals(c));

        // Trim
        System.out.println(" Hola, me llamo Ruben ".trim());

        // Replace
        System.out.println(" Hola, me llamo Ruben ".replace("Ruben", "Leis"));

        // Format
        var age = 37;
        System.out.println(String.format("Hola, %s. Tengo %d.", name, age));

		//Split
		String[] names = "Ruben,Leis".split(",");
		for (String valor : names) {
			System.out.println(valor);
		}

    }

    private static void condicionales() {
        int a = 4;
        int b = 5;

        if (b > a) {
            System.out.println("b es mayor que a");
        } else {
            System.out.println("a es mayor b");
        }

        if (a == b) {
            System.out.println("a == b");
        } else {
            System.out.println("a y b no son iguales");
        }

        if (a != b) {
            System.out.println("a y b no son iguales");
        } else {
            System.out.println("a == b");
        }

        int c = 5;
        if (a > b && b == c) {
            System.out.println("Se cumple la condicion");
        } else {
            System.out.println("No se cumple la condicion");
        }

    }

    private static void casting() {
        double myDouble = 9.78;
        int myInt = (int) myDouble; // Manual casting: double to int

        System.out.println(myDouble); // 9.78
        System.out.println(myInt); // Ponce-Cristian-Ruben: 9 / Kiara: 9.78 / Mou: Excepcion / Oscar:10

//	    String palabra = "a";
//	    myInt = (int) palabra; 

        char ch = 'A';
        myInt = (int) ch; // Manual casting: double to int
        System.out.println(myInt);
    }

    private static void tiposBasicos() {
        String nombre = "John Doe";

        int edad = 5;
        Integer altura = 177;
        double precio = 5.50;
        boolean esHombre = true;
    }

    private static void operadores() {

        // Recomendado para decimales
        BigDecimal precio = new BigDecimal("3.56");
        precio = precio.divide(new BigDecimal(2));
        precio = precio.multiply(new BigDecimal(2));
        System.out.println("Precio con bigDecimal: " + precio);

        double importe = Double.parseDouble("20.5");
        importe = importe / 2;
        System.out.println("Importe con double" + importe);

        // Enteros
        int edad = 3;
        System.out.println(edad);
        edad = edad + 3;
        edad = edad + 5;
        edad += 5;
        System.out.println(edad);

        boolean esHombre = false;
        esHombre = true;
        System.out.println(esHombre);

    }

}
