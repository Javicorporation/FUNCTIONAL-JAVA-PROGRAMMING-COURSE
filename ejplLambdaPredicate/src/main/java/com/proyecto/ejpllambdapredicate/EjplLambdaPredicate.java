package com.proyecto.ejpllambdapredicate;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class EjplLambdaPredicate {

    public static void main(String[] args) {
        List<Producto> productos = List.of(
            new Producto("Mouse", 25.99),
            new Producto("Teclado", 45.00),
            new Producto("Monitor", 199.99),
            new Producto("Cable", 5.49)
        );
        
        // mediante el predicate sabemos cuales son los productos caros
        Predicate<Producto> esCaro = p -> p.precio>30;
        
        // filtrar los productos que son caros
        List<Producto> caros = productos.stream()
                .filter(esCaro)
                .collect(Collectors.toList());
        
        
        caros.forEach(System.out::println);
        
        
        
    }
}
