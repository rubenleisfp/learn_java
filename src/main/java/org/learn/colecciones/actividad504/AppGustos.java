package org.learn.colecciones.actividad504;

import java.util.*;

public class AppGustos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<Integer, List<String>> gustos = new HashMap<>();

        // Bucle para ingresar gustos y puntuaciones
        while (true) {
            System.out.print("Ingrese una tarea (o escriba 'SALIR' para finalizar): ");
            String tarea = scanner.nextLine();

            if (tarea.equalsIgnoreCase("SALIR")) {
                break;
            }

            System.out.print("Ingrese la puntuación del 0 al 10 para '" + tarea + "': ");
            int puntuacion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer

            // Verificar si la puntuación está en el rango válido
            if (puntuacion < 0 || puntuacion > 10) {
                System.out.println("La puntuación debe estar entre 0 y 10. Inténtelo de nuevo.");
                continue;
            }

            // Agregar la tarea a la lista correspondiente a la puntuación
            List<String> tareas = gustos.get(puntuacion);
            if (tareas == null) {
                tareas = new ArrayList<>();
                gustos.put(puntuacion, tareas);
            }
            tareas.add(tarea);
        }

        // Mostrar las tareas asignadas a cada puntuación
        System.out.println("\n--- Tareas por Puntuación ---");
        for (Map.Entry<Integer, List<String>> entry : gustos.entrySet()) {
            System.out.println("Puntuación " + entry.getKey() + ": " + entry.getValue());
        }
    }
}

