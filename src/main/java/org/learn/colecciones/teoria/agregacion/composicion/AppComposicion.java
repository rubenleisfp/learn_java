package org.learn.colecciones.teoria.agregacion.composicion;

public class AppComposicion {
    public static void main(String[] args) {
        Casa casa = new Casa();
        casa.mostrarHabitacion();
        
        // No se puede acceder a Habitacion sin pasar por Casa.
        // Si se destruye casa, la habitacion también desaparece.
    }
}
