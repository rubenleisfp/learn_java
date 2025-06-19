package org.learn.colecciones.teoria;

import org.learn.basico.teoria.Persona;

import java.util.*;

public class AppColecciones {

  

    public static void main(String[] args) {
        //listBasic();
        //collectionsListPersona();
        //collectionsSet();
     //   collectionsMap();
        collectionsMapPersona();
    }

    private static void listBasic() {
        


        //List<String> cars = new ArrayList<>();
        //ArrayList<String> cars = new ArrayList<>();
        //List<String> cars = Arrays.asList("Buenos Aires", "Córdoba", "La Plata");
        ArrayList<String> cars = new ArrayList<>();
        //cars = new LinkedList<>();
        cars = new ArrayList<>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");

        cars.add(0, "Seat");
        cars.add(4, "Cualquiera");
        System.out.println(cars);

        System.out.println(cars);
        try {
            String car = cars.get(7);
            System.out.println(car);
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Animal! te fuiste fuera de rango");
        }
        cars.set(2, "Audi");
        System.out.println(cars);
        cars.clear();
        System.out.println(cars);
        //cars.get(0);

        cars.add("Lambo");
        System.out.println(cars);

       //cars = new ArrayList<>();

       System.out.println(cars);

        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        System.out.println(cars.size());

     
        
        for (int i = 0; i < cars.size(); i++) {
            System.out.println(cars.get(i));
        }


        for (String car : cars) {
            System.out.println(car);
        }

        boolean estaFord = cars.contains("Ford");
        System.out.println("EstaFord? " + estaFord);

        cars.remove("Mazda");

        for (String car : cars) {
            System.out.println(car);
        }

        System.out.println("########");
        List<String> subcoches = cars.subList(0,1);
        for (String subcoch : subcoches) {
            System.out.println(subcoch);
        }
//
//        System.out.println("#################");
//        int index = cars.indexOf("BMW");
//        System.out.println(index);
//        cars.remove(index);
//
//        cars.add("Volvo");
//        for (String car : cars) {
//            System.out.println(car);
//        }


//        index = cars.indexOf("FERRARI");
//        System.out.println(index);
//




    }

    private static void collectionsListPersona() {

        Persona aida = new Persona("11111111T", "Aida");
        Persona borja = new Persona("22222222T", "Borja");
        Persona iago = new Persona("33333333T", "Iago");
        Persona juan = new Persona("44444444T", "Juan");

        List<Persona> personas = new ArrayList<>();
        personas.add(aida);
        personas.add(borja);
        personas.add(iago);
        personas.add(juan);

        String nifABuscar = "44444444T";
        Persona personaBuscada = buscarPorNifList(personas, nifABuscar);
        if (personaBuscada != null) {
            System.out.println("PersonaBuscada: " + personaBuscada.getNif());
        }
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


    private static void collectionsMapPersona() {

        Persona aida = new Persona("11111111T", "Aida");
        Persona borja = new Persona("22222222T", "Borja");
        Persona iago = new Persona("33333333T", "Iago");
        Persona juan = new Persona("44444444T", "Juan");

        Map<String,Persona> personas = new HashMap();
        personas.put(aida.getNif(), aida);
        personas.put(borja.getNif(), borja);
        personas.put(iago.getNif(),iago);
        personas.put(juan.getNif(),juan);


        String nifABuscar = "44444444T";
        Persona personaBuscada = personas.get(nifABuscar);
        System.out.println("PersonaBuscada: " + personaBuscada);

    }



    private static void collectionsSet() {

        Set<String> cars = new HashSet<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("BMW");
        cars.add("Mazda");
        System.out.println(cars);
        

//        boolean exists = cars.contains("Mazda");
//        System.out.println(exists);
//
//        cars.remove("BMW");
//        System.out.println(cars);
//        System.out.println(cars.size());
//
//        //cars.clear();
//        System.out.println(cars);
//
//        for (String i : cars) {
//            System.out.println(i);
//        }

    }

    private static void collectionsMap() {

        // Create a HashMap object called capitalCities
        Map<String, String> capitalCities = new HashMap<String, String>();
        //Map<String, String> capitalCities = new LinkedHashMap<>();

        // Add keys and values (Country, City)
        capitalCities.put("England", "London");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("USA", "Washington DC");
        capitalCities.put("Montenegro", "Podgorica");
        capitalCities.put("Galiza", "Coruña");
        capitalCities.put("Peru", "Lima");
        System.out.println(capitalCities);

        String capitalEngland = capitalCities.get("England");
        System.out.println(capitalEngland);

        String capital = capitalCities.get("Norway");
        System.out.println(capital);
        capital = capitalCities.remove("USA");
        System.out.println(capital);
        System.out.println(capitalCities);

        System.out.println(capitalCities.size());
//
//        //Print keys
       System.out.println(capitalCities.keySet());
//        //Print values
        System.out.println(capitalCities.values());
////
////        // Print keys and values
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
