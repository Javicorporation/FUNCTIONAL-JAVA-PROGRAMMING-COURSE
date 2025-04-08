package jfuncional;

import java.util.function.Function;

public class Princip {
    public static void main(String[] args) {
        
        // ejemplo de obtener la longitud de una cadena
        Function<String, Integer> conversion = precio -> precio.length();
        System.out.println(conversion.apply("Java"));
        System.out.println(conversion.apply("Juanin"));
//        
        //
        Function<Integer,String> conver = nota ->{
            if (nota >= 90)return "exelente";
            else if (nota >= 70)return "bueno";    
            else return "Insuficiente";
        };
        
        System.out.println(conver.apply(95)); // Excelente
        System.out.println(conver.apply(65)); // Insuficiente
                
    }
    
}
