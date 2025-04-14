package com.proyecto.busquedauseop;

import java.util.List;
import java.util.Optional;

public class Opera {
    
    
    public static void buscarUsuario(String nombre, List<Usuario> lista){
        
        System.out.println("Buscamos a: "+ nombre);
        
        Optional<Usuario> usuario = lista.stream()
                .filter(u -> u.getNombre().equalsIgnoreCase(nombre))
                .findFirst();
        
        // ifPresent
        usuario.ifPresent(u -> System.out.println("Encontrado: "+u));
        
        // map para transformar el nombre
        Optional<String> mayusculas = usuario
                .map(u -> u.getNombre().toUpperCase());
        
        // filter para ver si es mayor
        usuario.filter(u -> u.getEdad() >= 18)
                .ifPresent(u -> System.out.println("Es mayor De Edad"));
    }
    
}
