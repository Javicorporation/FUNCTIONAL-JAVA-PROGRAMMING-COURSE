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
        
        // orElse
        Usuario u1 = usuario.orElse(new Usuario("Invitado", 0));
        System.out.println("Usuario final (orElseGet): "+u1);
        
        
        // orElseGet
        Usuario u2 = usuario.orElseGet(() -> new Usuario("Por defecto", 0));
        System.out.println("Usuario Final (orElseGet)"+u2);
        
        
        // orElseThrow
        try{
            Usuario u3 = usuario.orElseThrow(() -> new RuntimeException("Usuario no encontrado"));
            System.out.println("usuario con orElseThrow"+u3);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        // isPresent y get
        if(usuario.isPresent()){
            Usuario u = usuario.get();
            System.out.println("acceso con get(): "+u);
        }
        
        System.out.println("------------------------------");
        
    }
    
}
