package jfuncional;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class Jfuncional {

    public static void main(String[] args) {
        
        
        // ejemplo de unir palabras
//        BiConsumer<String, Integer> imprimirP = (nombre, edad) ->
//                System.out.println(nombre+" tiene "+edad+" años");
//        
//        imprimirP.accept("Juanin", 12);
        
        
        // ejemplo de insertar elementos en un map
        
        Map<String, Integer>mapa = new HashMap<>();
        BiConsumer<String, Integer> agregarAlMapa = (clave, valor) ->
                mapa.put(clave, valor);
        
        agregarAlMapa.accept("a",1);        
        agregarAlMapa.accept("A",2);
        
        System.out.println(mapa);

        
        
//        BiPredicate<String, Integer> accesoPermitido = (nombre, edad) -> edad >= 18;
//        System.out.println(accesoPermitido.test("Ana", 20)); // true
//        System.out.println(accesoPermitido.test("Luis", 19)); // false
//        
//        
//        //
//        BiPredicate<String, Integer> empiezaConA = (palabras, _) -> palabras.startsWith("A");
//        BiPredicate<String, Integer> longitudMayorA5 = (palabra, _) -> palabra.length() > 5;
//
//        BiPredicate<String, Integer> combinada = empiezaConA.and(longitudMayorA5);
//
//        System.out.println(combinada.test("Animales", 0)); // true
//        System.out.println(combinada.test("Ave", 0));      // false
        
        
        
//        BiPredicate<String, String> empiezaCon = (cadena, prefijo) -> cadena.startsWith(prefijo);
//        
//        System.out.println(empiezaCon.test("programacion", "pro"));        System.out.println(empiezaCon.test("programacion", "pro"));
//        System.out.println(empiezaCon.test("java", "va"));

        
        
        
//        TriFuntion<String, Double, Integer, String> resumenProducto =
//                (nombre, precio, cantidad) ->
//                        "Producto: "+nombre+", Total: "+(precio * cantidad);
//        
//        String resultado = resumenProducto.apply("Monitor", 1.50, 2);
//        
//        System.out.println(resultado);
        
        
        
        
//        Function<String, Function<Double, Function<Integer, String>>> infoProducto =
//                nombre -> precio -> cantidad -> "Producto: "+nombre+", Total: "+(precio*cantidad);
//        String resultado = infoProducto.apply("Mouse").apply(12.50).apply(2);
//        
//        System.out.println(resultado);
        
        
//        Function<Producto, Double> total = p -> p.precio * p.cantidad;
//        
//        Producto producto = new Producto("Teclado", 25.0, 2);
//        System.out.println(total.apply(producto));
        
        // BiFuntion
        // concatenar un string que se repite una sierta cantidad de veces
//         BiFunction<String, Integer, String> union = (str , veces) -> str.repeat(veces);
//         System.out.println(union.apply("BMW", 4));
//         
         
         // calcular con precio y cantidad
//         BiFunction<Double,Integer,Double> total = (preci, cant) -> preci * cant;
//         System.out.println(total.apply(3.33, 3));
        
    
         // combina 2 objetos
//         class  Persona{
//            String nombre;
//            int edad;
//
//            Persona(String nombre, int edad){
//                this.nombre = nombre;
//                this.edad = edad;
//            }
//            public String toString(){
//                return nombre+ " tiene "+edad+" años";
//            }
//         }
         
//         BiFunction<String, Integer, Persona> crearPersona =(nom , eda)-> 
//                 new Persona(nom, eda);
//         System.out.println(crearPersona.apply("Juanin", 23));
//        
         // uso de andThen para encadenar 2 funciones
         
//         BiFunction<Integer, Integer, Integer> suma = (g, j) -> g+j;
//         Function<Integer, String> aTexto = resultado -> "Resultado: "+ resultado;
//        
//         String mensaje = suma.andThen(aTexto).apply(4,5);
//         System.out.println(mensaje);
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
