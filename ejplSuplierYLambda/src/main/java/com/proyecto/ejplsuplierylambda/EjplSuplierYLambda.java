package com.proyecto.ejplsuplierylambda;

import java.util.UUID;
import java.util.function.Supplier;

public class EjplSuplierYLambda {

    public static void main(String[] args) {
        Supplier<String> generarId = ()-> UUID.randomUUID().toString();
        System.out.println("Primer id generado: "+ generarId.get());
        System.out.println("Segundo id generado: "+ generarId.get());
    }
}
