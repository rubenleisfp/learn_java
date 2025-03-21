package org.learn.staticproperty.actividad402;
public class Tienda {
	private static	int numeroVentas;
    private static double totalImporteVendido;

    public static void realizarVenta(Producto producto) {
        throw new UnsupportedOperationException("A implementar por el alumno");
    }

    public static double getNumeroVentas() {
        return numeroVentas;
    }
    
    public static double getTotalImporteVendido() {
        return totalImporteVendido;
    }
}
