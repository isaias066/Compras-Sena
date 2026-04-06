package com.mycompany.carritocompras;

public class Producto {
    private final String nombre;
    private final double precio;
    private int cantidadStock;
    
    public Producto(String nombre, double precio, int cantidadStock) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidadStock = cantidadStock;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getCantidadStock() {
        return cantidadStock;
    }

    // Método vender
    public void vender(int cantidad) {
        if (cantidad < 1) {
            System.out.println("Error: la cantidad debe ser mayor a 0.");
        } else if (cantidad > cantidadStock) {
            System.out.println("Error: no hay suficiente stock de " + nombre);
        } else {
            cantidadStock -= cantidad;
            System.out.println("Se vendieron " + cantidad + " unidades de " + nombre);
        }
    }
}
