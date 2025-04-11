package com.proyecto.ejemplo05miniapp;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class Ejemplo05Miniapp {

    public static void main(String[] args) {
        
        // creamos la lista de usuarios
        List<Persona> personas = List.of(
                new Persona("Ana", 23, "Madrid"),
                new Persona("Luisa", 21,"Esmaraldas"),
                new Persona("Nathali", 17,"Machala"),
                new Persona("Julia", 30,"Quito")
        );
        
        BuscarPersona buscar = (lista, nombre)->
            lista.stream()
                    .filter(u -> u.getNombre().equalsIgnoreCase(nombre))
                    .findFirst();
        
        // buscamos
        Optional<Persona> personaEncontrada = buscar.buscar(personas, "Ana");
        
        
        Function<Persona, String> saludoPers = u -> 
                "El es "+u.getNombre()+" de "+u.getCiudad()+" Bienvenido";
        
        
        String mensaje = personaEncontrada
                .map(saludoPers)
                .orElse("Usuario no encontrado");
        
        System.out.println(mensaje);
        
    }
}
