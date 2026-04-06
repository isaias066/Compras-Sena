package com.mycompany.carritocompras;

import java.util.ArrayList;

public class Carrito {
    private final ArrayList<Producto> items;

    // Constructor
    public Carrito() {
        items = new ArrayList<>();
    }

    // Agregar producto al carrito
    public void agregarProducto(Producto producto) {
        items.add(producto);
        System.out.println(producto.getNombre() + " fue agregado al carrito.");
    }

    // Sumar total
    public double sumarTotal() {
        double total = 0;
        for (Producto producto : items) {
            total += producto.getPrecio();
        }
        return total;
    }

    // Listar productos
    public void listarProductos() {
        System.out.println("-----PRODUCTOS EN EL CARRITO-----");
        for (Producto producto : items) {
            System.out.println("Nombre: " + producto.getNombre() +
                               " | Precio: $" + producto.getPrecio() +
                               " | Stock: " + producto.getCantidadStock());
        }
    }
}
