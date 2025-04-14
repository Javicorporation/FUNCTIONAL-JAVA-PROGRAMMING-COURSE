package com.proyecto.busquedauseintfp;

import java.util.List;
import java.util.Optional;

public class BuscarYEvaluar {
    
    public static void busYEva(String nombre, List<Usuario>lista, EvaluadorUsuario evaluador ){
        System.out.println("Buscar: "+nombre);
        
        Optional<Usuario> usuario = lista.stream()
                .filter(u -> u.getNombre().equalsIgnoreCase(nombre))
                .findFirst();
        
        usuario.ifPresentOrElse(u -> {
            System.out.println("Usuario encontrado: "+u);
            System.out.println("Evaluacion: "+ evaluador.evaluar(u));
            
            String enMayus = Optional.of(u)
                    .map(Usuario::getNombre)
                    .map(String::toUpperCase)
                    .orElse("Sin nombre");
            System.out.println("Nombre en mayuscula: "+ enMayus);
        }, () -> {
            System.out.println("Usuario no encontrado");
            Usuario porDefecto = new Usuario("Desconocido", 0);
            System.out.println("Usuario por defecto: "+ evaluador);
        
        });
        System.out.println("------------------");
    }
    
    
}
