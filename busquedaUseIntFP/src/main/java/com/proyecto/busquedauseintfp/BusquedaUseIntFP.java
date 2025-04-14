package com.proyecto.busquedauseintfp;

import java.util.List;

public class BusquedaUseIntFP {

    public static void main(String[] args) {
        
        List<Usuario> usuarios = List.of(
            new Usuario("Carlos", 22),
            new Usuario("Laura", 17),
            new Usuario("Pedro", 31)
        );
        
        EvaluadorUsuario evaluador = u -> {
            if (u.getEdad() >= 18)return "usuario mayor de edad";
            else return "Usuario menor de edad";
        };
        
        BuscarYEvaluar.busYEva("Laura", usuarios, evaluador);
        BuscarYEvaluar.busYEva("Carlos", usuarios, evaluador);
        BuscarYEvaluar.busYEva("Luis", usuarios, evaluador);
        
        
        
        
    }
}
