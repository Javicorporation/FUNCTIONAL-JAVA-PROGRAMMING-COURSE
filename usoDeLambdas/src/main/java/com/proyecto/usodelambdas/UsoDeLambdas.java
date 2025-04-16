package com.proyecto.usodelambdas;

public class UsoDeLambdas {

    public static void main(String[] args) {
        
        Runnable c = new Runnable() {
            @Override
            public void run() {
                System.out.println("hola");
            }
        };
        
        // mismo ejemplo con lambda
        Runnable r2 = () -> System.out.println("holaaaa");
        
        
        
        
//        (int x, int y) -> x + y              // Suma dos números
//        (a, b) -> a > b ? a : b              // Devuelve el mayor
//        () -> System.out.println("Hola")    // No recibe parámetros
//        s -> s.length()                      // Devuelve la longitud


        

    }
}
