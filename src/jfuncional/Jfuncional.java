package jfuncional;

import java.util.List;
import java.util.function.BinaryOperator;

public class Jfuncional {

    public static void main(String[] args) {
        
        // definimos una lambda que emplemente BinaryOperator<>
        BinaryOperator<Integer> max = (a,b)-> a > b ?a:b;
        System.out.println(max.apply(10,05));
        
        // Strings
        BinaryOperator<String> cadena = (c,d)-> c+""+d;
        System.out.println(cadena.apply("pu", "erta"));
        
        // reducir elementos de una lista 
        List<Integer> numeros =List.of(9,7,5,6,7);
        BinaryOperator<Integer> suma = (j, s) -> j + s;
        
        int resultado = numeros.stream().reduce(0, suma);
        System.out.println(resultado);
        
        
        
       
        //tipos de lambdas
        
//        //tipos de lambdas
//        
//        // sin parametros
//        ()-> System.out.println("Hola");
//        
//        //tiene un parametro y un bloque de codigo
//        x -> x*x
//          
//        // varios parametros        
//        (a,b) ->a+b
//         
//        // con tipo explicito        
//        (String nombre) -> {return nombre.length}
        
    }
    
}
