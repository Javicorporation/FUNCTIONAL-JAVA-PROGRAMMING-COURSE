package com.proyecto.ejplfunctionylambda;

import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;

public class EjplFunctionYLambda {

    public static void main(String[] args) {
        
        BiFunction<Double, Double, Double> clclSalarioOfil = (salario, bono) ->
                salario +(salario*bono);
        
        Double resultado = clclSalarioOfil.apply(1000.0, 0.15);
        
        System.out.println("El salario Final es: "+resultado);
        
        
//        List<Estudiante> estudiantes = List.of(
//            new Estudiante("Ana", 80, 90),
//            new Estudiante("Luis", 60, 70)
//        );
//        
//        
//        //
//        Function<Estudiante, String> calcularNTF = est ->{
//            int promedio = (est.examen1 + est.examen2);        
//            return est.nombre+" -> nota final: "+promedio;
//        };
//        
//        estudiantes.stream()
//                .map(calcularNTF)
//                .forEach(System.out::println);
        
    }
}
