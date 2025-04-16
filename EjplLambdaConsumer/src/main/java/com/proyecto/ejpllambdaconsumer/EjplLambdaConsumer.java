package com.proyecto.ejpllambdaconsumer;

import java.util.List;
import java.util.function.Consumer;

public class EjplLambdaConsumer {

    public static void main(String[] args) {
        List<Usuario> usuarios = List.of(
            new Usuario("a@correo.com"),
            new Usuario("b@correo.com")
        );
        
        Consumer<Usuario> enviarCorreo = u ->
                System.out.println("enviar correo a: "+ u.email);
        
        
        usuarios.forEach(enviarCorreo);
    }
}
