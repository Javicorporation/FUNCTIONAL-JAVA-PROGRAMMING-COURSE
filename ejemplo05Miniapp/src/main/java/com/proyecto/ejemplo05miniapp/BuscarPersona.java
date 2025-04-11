package com.proyecto.ejemplo05miniapp;

import java.util.List;
import java.util.Optional;

@FunctionalInterface
public interface BuscarPersona {
    
    Optional<Persona> buscar(List<Persona> usuarios, String nombre);
    
}
