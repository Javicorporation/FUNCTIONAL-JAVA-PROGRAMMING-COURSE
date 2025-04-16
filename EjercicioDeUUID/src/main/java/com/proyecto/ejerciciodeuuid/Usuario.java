package com.proyecto.ejerciciodeuuid;

public class Usuario {
    
    private String id;
    private String nombre;
    private String email;

    public Usuario(String id, String nombre, String email) {
        this.id = id;
        this.nombre = nombre;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Usuario: " + nombre + "\nEmail: " + email + "\nID: " + id + "\n";
    }
    
}
