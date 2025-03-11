package org.learn.staticproperty.actividad402;

public class App {

	public static void main(String[] args) {
        Producto producto1 = new Producto("Laptop", 800);
        Producto producto2 = new Producto("Teléfono", 500);
        Producto producto3 = new Producto("Tablet", 300);

        Tienda.realizarVenta(producto1);
        Tienda.realizarVenta(producto2);
        Tienda.realizarVenta(producto3);

        System.out.println("Numero de ventas: " + Tienda.getNumeroVentas());
        System.out.println("Total de ventas: " + Tienda.getTotalImporteVendido());

	}

}
