package com.proyecto.ejerciciodeuuid;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.function.Supplier;

public class EjercicioDeUUID {

    public static void main(String[] args) {
        
        // generamos el id unico
        Supplier<String> generateId = () -> UUID.randomUUID().toString();
        
        // Datos de usuarios simulados
        List<String[]> datos = List.of(
            new String[]{"Ana", "ana@gmail.com"},
            new String[]{"Luis", "luis@hotmail.com"},
            new String[]{"Marta", "marta@yahoo.com"}
        );
        
        List<Usuario> usuarios = new ArrayList<>();
        
        for(String[] dato: datos){
            String nombre = dato[0];
            String email = dato[1];
            String idGenerado = generateId.get();
            
            usuarios.add(new Usuario(idGenerado, nombre, email));
        }
        
        usuarios.forEach(System.out::println);
        
        
        
        
        
        
        
    }
}
