package com.proyecto.ejplfunctionylambda;

import java.util.List;
import java.util.function.Function;

public class EjplFunctionYLambda {

    public static void main(String[] args) {
        List<Estudiante> estudiantes = List.of(
            new Estudiante("Ana", 80, 90),
            new Estudiante("Luis", 60, 70)
        );
        
        
        //
        Function<Estudiante, String> calcularNTF = est ->{
            int promedio = (est.examen1 + est.examen2);        
            return est.nombre+" -> nota final: "+promedio;
        };
        
        estudiantes.stream()
                .map(calcularNTF)
                .forEach(System.out::println);
        
    }
}
