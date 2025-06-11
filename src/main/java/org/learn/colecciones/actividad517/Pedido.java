package org.learn.colecciones.actividad517;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private Cliente cliente;
    private List<Producto> productos;
    private LocalDate fecha;

    public Pedido(Cliente cliente) {
        this.cliente = cliente;
        this.fecha = LocalDate.now();
        this.productos = new ArrayList<>();
    }

    public void añadirProducto(Producto p) {
        productos.add(p);
    }

    public double calcularTotal() {
        double total = 0;
        for (Producto p : productos) {
            total += p.getPrecio();
        }
        return total;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Pedido de ").append(cliente).append(" - Fecha: ").append(fecha).append("\n");
        sb.append("Productos:\n");
        for (Producto p : productos) {
            sb.append("  - ").append(p).append("\n");
        }
        sb.append("Total: ").append(calcularTotal()).append("€");
        return sb.toString();
    }
}
