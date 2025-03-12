package org.learn.colecciones.actividad502;

import java.util.ArrayList;
import java.util.List;

public class ServicioArtistas {

    private List<String> artistaList;

    public ServicioArtistas() {
        artistaList = new ArrayList<>();
    }

    public void agregarArtista(String nuevoArtista) {
        artistaList.add(nuevoArtista);
    }

    public void mostrarArtistas() {
        for (String artista : artistaList) {
            System.out.println(artista);
        }
    }

    public boolean eliminarArtista(String artistaEliminar) {
        if (artistaList.contains(artistaEliminar)) {
            artistaList.remove(artistaEliminar);
            return true;
            //System.out.println("Artista eliminado correctamente.");
        } else {
            return false;
            //System.out.println("El artista no existe en la lista.");
        }
    }

    public boolean actualizarArtista(String artistaActualizar, String nuevoNombre) {
        if (artistaList.contains(artistaActualizar)) {
            int index = artistaList.indexOf(artistaActualizar);
            artistaList.set(index, nuevoNombre);
            return true;
        } else {
            return false;

        }
    }
}
