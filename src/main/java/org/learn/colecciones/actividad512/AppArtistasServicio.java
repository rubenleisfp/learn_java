package org.learn.colecciones.actividad512;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AppArtistasServicio {


    public static void main(String[] args) {

        ServicioArtistas servicioArtistas = new ServicioArtistas();
        List<String> artistas = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("1. Nuevo artista");
            System.out.println("2. Consultar artistas");
            System.out.println("3. Eliminar artista");
            System.out.println("4. Actualizar artista");
            System.out.println("5. Salir del programa");
            System.out.print("Introduzca una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Consume left over newline: https://stackoverflow.com/questions/13102045/scanner-is-skipping-nextline-after-using-next-or-nextfoo

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el nombre del nuevo artista: ");
                    // Utiliza nextLine() para leer la línea completa
                    String nuevoArtista = scanner.nextLine();
                    servicioArtistas.agregarArtista(nuevoArtista);
                    break;
                case 2:
                    System.out.println("Lista de artistas:");
                    servicioArtistas.mostrarArtistas();
                    break;
                case 3:
                    System.out.print("Ingrese el nombre del artista a eliminar: ");
                    String artistaEliminar = scanner.nextLine();
                    boolean fueEliminado = servicioArtistas.eliminarArtista(artistaEliminar);
                    if (fueEliminado) {
                        System.out.println("Artista eliminado correctamente.");
                    } else {
                        System.out.println("Artista no encontrado");
                    }
                    break;
                case 4:
                    System.out.print("Ingrese el nombre del artista a actualizar: ");
                    String artistaActualizar = scanner.nextLine();
                    System.out.print("Ingrese el nuevo nombre del artista: ");
                    String nuevoNombre = scanner.nextLine();
                    boolean fueActualizado = servicioArtistas.actualizarArtista(artistaActualizar, nuevoNombre);
                    if (fueActualizado) {
                        System.out.println("Artista actualizado correctamente.");
                    } else {
                        System.out.println("Artista no encontrado");
                    }
                    break;
                case 5:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
                    break;
            }
        } while (opcion != 5);
    }
}
