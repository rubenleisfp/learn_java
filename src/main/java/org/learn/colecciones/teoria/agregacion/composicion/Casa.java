package org.learn.colecciones.teoria.agregacion.composicion;

class Casa {
    private Habitacion habitacion;

    public Casa() {
        // La Casa crea su propia habitación.
        this.habitacion = new Habitacion("Dormitorio principal");
    }

    public void mostrarHabitacion() {
        habitacion.mostrar();
    }
}
