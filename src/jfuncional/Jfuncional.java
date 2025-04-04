package jfuncional;

public class Jfuncional {

    public static void main(String[] args) {
        
        //tipos de lambdas
        
        // sin parametros
        ()-> System.out.println("Hola");
        
        //tiene un parametro y un bloque de codigo
        x -> x*x
          
        // varios parametros        
        (a,b) ->a+b
         
        // con tipo explicito        
        (String nombre) -> {return nombre.length}
        
    }
    
}
