package jfuncional;

import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class Jfuncional {

    public static void main(String[] args) {
        
        // BiFuntion
        // concatenar un string que se repite una sierta cantidad de veces
         BiFunction<String, Integer, String> union = (str , veces) -> str.repeat(veces);
         System.out.println(union.apply("BMW", 4));
         
         
         // calcular con precio y cantidad
         BiFunction<Double,Integer,Double> total = (preci, cant) -> preci * cant;
         System.out.println(total.apply(3.33, 3));
        
    
         // combina 2 objetos
         class  Persona{
            String nombre;
            int edad;

            Persona(String nombre, int edad){
                this.nombre = nombre;
                this.edad = edad;
            }
            public String toString(){
                return nombre+ " tiene "+edad+" años";
            }
         }
         
         BiFunction<String, Integer, Persona> crearPersona =(nom , eda)-> 
                 new Persona(nom, eda);
         System.out.println(crearPersona.apply("Juanin", 23));
        
         // uso de andThen para encadenar 2 funciones
         
         BiFunction<Integer, Integer, Integer> suma = (g, j) -> g+j;
         Function<Integer, String> aTexto = resultado -> "Resultado: "+ resultado;
        
         String mensaje = suma.andThen(aTexto).apply(4,5);
         System.out.println(mensaje);
        // definimos una lambda que emplemente BinaryOperator<>
//        BinaryOperator<Integer> max = (a,b)-> a > b ?a:b;
//        System.out.println(max.apply(10,05));
        
        // Strings
//        BinaryOperator<String> cadena = (c,d)-> c+""+d;
//        System.out.println(cadena.apply("pu", "erta"));
        
        // reducir elementos de una lista 
//        List<Integer> numeros =List.of(9,7,5,6,7);
//        BinaryOperator<Integer> suma = (j, s) -> j + s;
        
//        int resultado = numeros.stream().reduce(0, suma);
//        System.out.println(resultado);
        
        
       
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
