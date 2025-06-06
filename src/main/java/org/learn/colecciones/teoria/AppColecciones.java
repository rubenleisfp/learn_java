package org.learn.colecciones.teoria;

import org.learn.basico.teoria.Persona;

import java.util.*;

public class AppColecciones {

    public static void main(String[] args) {

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
}
