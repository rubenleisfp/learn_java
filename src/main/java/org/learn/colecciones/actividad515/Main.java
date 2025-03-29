package org.learn.colecciones.actividad515;

import java.util.*;
import java.util.stream.Collectors;



public class Main {
    public static void main(String[] args) {
        List<Pelicula> peliculas = Arrays.asList(
                new Pelicula("Mad Max: Fury Road", "Acción", 8.1),
                new Pelicula("The Dark Knight", "Acción", 9.0),
                new Pelicula("Pulp Fiction", "Crimen", 8.9),
                new Pelicula("Forrest Gump", "Drama", 8.8),
                new Pelicula("Gladiator", "Acción", 8.5),
                new Pelicula("Titanic", "Romance", 7.9),
                new Pelicula("John Wick", "Acción", 7.4),
                new Pelicula("Inception", "Ciencia Ficción", 8.7)
        );

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el género de películas a filtrar: ");
        String generoFiltrado = scanner.nextLine();

        System.out.print("Ingrese cuántas películas desea ver: ");
        int n = scanner.nextInt();

        // Filtrar por género sin usar streams
        List<Pelicula> peliculasFiltradas = new ArrayList<>();
        for (Pelicula pelicula : peliculas) {
            if (pelicula.getGenero().equalsIgnoreCase(generoFiltrado)) {
                peliculasFiltradas.add(pelicula);
            }
        }

        // Ordenar de mayor a menor calificación sin usar streams
        Collections.sort(peliculasFiltradas, new Comparator<Pelicula>() {
            @Override
            public int compare(Pelicula p1, Pelicula p2) {
                return Double.compare(p2.getCalificacion(), p1.getCalificacion()); // Orden descendente
            }
        });

        // Seleccionar las n mejores películas
        List<Pelicula> mejoresPeliculas = new ArrayList<>();
        for (int i = 0; i < Math.min(n, peliculasFiltradas.size()); i++) {
            mejoresPeliculas.add(peliculasFiltradas.get(i));
        }

        // Mostrar el resultado
        System.out.println("\nLas " + n + " mejores películas de " + generoFiltrado + " son:");
        for (Pelicula pelicula : mejoresPeliculas) {
            System.out.println(pelicula);
        }

    }
}
