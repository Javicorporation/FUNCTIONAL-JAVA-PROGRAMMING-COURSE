package jfuncional;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Princip {
    public static void main(String[] args) {
        
        
        List<Persona> personas = List.of(
                new Persona("Ana", 25),
                new Persona("Juan", 30),
                new Persona("Luisa", 20)
        );
        
        Function<Persona,String> obtenerNo = Persona::getNombre;
        
        
        List<String> nombres = personas.stream()
                .map(obtenerNo)
                .collect(Collectors.toList());
        System.out.println(nombres);
        
        
        // aplicacamos la primera funcion y luego aplica otro
        
        //F1
//        Function<Integer, Integer> doble = n -> n*2;
        //F2
//        Function<Integer, String> convertir = n -> "resultado: "+n;
        //F3 esta tercera funcion combina las 2 funciones anteriores
//        Function<Integer, String> combinado = doble.andThen(convertir);
//        
//        System.out.println(combinado.apply(5));
        
        
        // aplicamos primero la segunda funcion y despues la primera funcion
//        Function<String, String> quitarEspacios = s -> s.trim();
//        Function<String, Integer> contarCaract = s -> s.length();
//        
//        Function<String, Integer> limpiaYCuenta = contarCaract.compose(quitarEspacios);
//        System.out.println(limpiaYCuenta.apply("Hola que"));
//        
        
        
        
        // ejemplo de obtener la longitud de una cadena
//        Function<String, Integer> conversion = precio -> precio.length();
//        System.out.println(conversion.apply("Java"));
//        System.out.println(conversion.apply("Juanin"));
//        
        //presentacion de un mensaje en un determinado rango
//        Function<Integer,String> conver = nota ->{
//            if (nota >= 90)return "exelente";
//            else if (nota >= 70)return "bueno";    
//            else return "Insuficiente";
//        };
        
//        System.out.println(conver.apply(95)); // Excelente
//        System.out.println(conver.apply(65)); // Insuficiente
                
    }
    
}
