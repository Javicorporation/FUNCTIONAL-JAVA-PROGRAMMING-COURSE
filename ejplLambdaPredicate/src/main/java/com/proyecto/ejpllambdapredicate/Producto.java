package com.proyecto.ejpllambdapredicate;

public class Producto {
    
    String nombre;
    double precio;

    Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String toString() {
        return nombre + ": $" + precio;
    }
    
}
