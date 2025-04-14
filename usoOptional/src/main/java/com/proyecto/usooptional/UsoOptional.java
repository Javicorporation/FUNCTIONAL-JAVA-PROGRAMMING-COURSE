package com.proyecto.usooptional;

import java.util.Optional;

public class UsoOptional {

    public static void main(String[] args) {
        Optional<String>  nombre = Optional.of("Jun");
        
        nombre.ifPresent(n -> System.out.println("hola "+n));
        
        String resultado = nombre.map(n -> n.toUpperCase())
                .orElse("desconocido");
        
        System.out.println(resultado);
        
    }
}
