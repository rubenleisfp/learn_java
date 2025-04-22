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

    private static void collectionsListPersona() {

        Persona izan = new Persona("11111111T", "Izan");
        Persona brais = new Persona("22222222T", "Brais");
        Persona ruben = new Persona("33333333T", "Ruben");

        List<Persona> personas = new ArrayList<>();
        personas.add(izan);
        personas.add(brais);
        personas.add(ruben);

        String nifABuscar = "222222223T";
        Persona personaBuscada = buscarPorNifList(personas, nifABuscar);
        System.out.println("PersonaBuscada: " + personaBuscada);
    }

    private static void collectionsMapPersona() {

        Persona izan = new Persona("11111111T", "Izan");
        Persona brais = new Persona("22222222T", "Brais");
        Persona ruben = new Persona("33333333T", "Ruben");

        Map<String, Persona> personas = new HashMap<>();
        personas.put(izan.getNif(), izan);
        personas.put(brais.getNif(), brais);
        personas.put(ruben.getNif(), ruben);


        String nifABuscar = "22222222T";
        Persona personaBuscada = personas.get(nifABuscar);
        System.out.println("PersonaBuscada: " + personaBuscada);

    }

    public static Persona buscarPorNifList(List<Persona> personas, String nifABuscar) {
        Persona personaBuscada = null;
        for (Persona p : personas) {
            if (p.getNif().equals(nifABuscar)) {
                personaBuscada = p;
                break;
            }
        }
        return personaBuscada;
    }

    private static void collectionsSet() {

        Set<String> cars = new HashSet<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("BMW");
        cars.add("Mazda");
        System.out.println(cars);

        boolean exists = cars.contains("Mazda");
        System.out.println(exists);

        cars.remove("BMW");
        System.out.println(cars);
        System.out.println(cars.size());

        //cars.clear();
        System.out.println(cars);

        for (String i : cars) {
            System.out.println(i);
        }

    }

    private static void collectionsMap() {

        // Create a HashMap object called capitalCities
        HashMap<String, String> capitalCities = new HashMap<String, String>();

        // Add keys and values (Country, City)
        capitalCities.put("England", "London");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("USA", "Washington DC");
        capitalCities.put("Montenegro", "Podgorica");
        System.out.println(capitalCities);

        String capital = capitalCities.get("Norway");
        System.out.println(capital);
        capital = capitalCities.remove("USA");
        System.out.println(capitalCities);

        System.out.println(capitalCities.size());

        //Print keys
        System.out.println(capitalCities.keySet());
        //Print values
        System.out.println(capitalCities.values());

        // Print keys and values
        for (String country : capitalCities.keySet()) {
            System.out.println("key: " + country + " value: " + capitalCities.get(country));
        }


    }

    private static void collectionsList() {
        //
        List<String> coches = new LinkedList<>();

        coches.add("Kia");
        coches.add("Polo");
        coches.add("Daewoo");
        coches.add("Toyota");
        coches.add("Opel");
        coches.add("Aston Martin");
        coches.add("Kia");

        System.out.println(coches);

        // Añadimos el elemento
        coches.add(3, "Seat");
        // Sobreescribemos el elemento
        coches.set(3, "Seat Leon");

        System.out.println(coches.get(1));
        System.out.println(coches.get(3));
        System.out.println(coches.get(4));
        System.out.println(coches.size());

        System.out.println("################");
        for (String coche : coches) {
            System.out.println(coche);
        }

        System.out.println("################");
        for (int i = 0; i < coches.size(); i++) {
            System.out.println(coches.get(i));
        }

        System.out.println("################");
        coches.remove(5);
        for (String coche : coches) {
            System.out.println(coche);
        }

//		List<String> coches = new ArrayList();
//		List<String> coches = new LinkedList<String>();

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
