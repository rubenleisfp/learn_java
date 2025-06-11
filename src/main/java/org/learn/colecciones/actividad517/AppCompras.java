package org.learn.colecciones.actividad517;

public class AppCompras {
    public static void main(String[] args) {
        // Crear productos
        Producto p1 = new Producto("Ratón inalámbrico", 19.99);
        Producto p2 = new Producto("Teclado mecánico", 59.99);
        Producto p3 = new Producto("Monitor 24''", 129.50);
        Producto p4 = new Producto("USB 64GB", 12.00);

        // Crear clientes
        Cliente c1 = new Cliente("Laura García", "laura@example.com");
        Cliente c2 = new Cliente("Miguel Pérez", "miguel@example.com");

        // Crear pedidos
        Pedido pedido1 = new Pedido(c1);
        pedido1.añadirProducto(p1);
        pedido1.añadirProducto(p2);

        Pedido pedido2 = new Pedido(c2);
        pedido2.añadirProducto(p3);
        pedido2.añadirProducto(p4);
        pedido2.añadirProducto(p4); // dos USBs

        // Mostrar pedidos
        System.out.println(pedido1);
        System.out.println();
        System.out.println(pedido2);
    }
}
