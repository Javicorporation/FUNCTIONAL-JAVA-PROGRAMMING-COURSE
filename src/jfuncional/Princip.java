package jfuncional;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class Princip {
    public static void main(String[] args) {
        
        CalcularDescuento calcDes = (precio, porc, codi) ->{
            double descuento = precio*(porc/100);
            if ("VIP".equalsIgnoreCase(codi)) {
                descuento +=10;
            }
            return precio-descuento;
        };
        
//        List<Persona> perosonas = new ArrayList<>();
//        
//        Random random = new Random();
//        
//        Supplier<Persona> genPerso = () ->{
//            int id = random.nextInt(1000);
//            return new Persona("user"+ id);
//        };
//        
//        Predicate<Persona> validaN = n -> n.getNombre().length() > 7;
//        
//        
//        for (int i = 0; i < 3; i++) {
//            Persona p = genPerso.get();
//            if (validaN.test(p)) {
//                perosonas.add(p);
//                System.out.println("Agregado: "+p.getNombre());
//            }else{
//                System.out.println("Descartado: "+p.getNombre());
//            }
//        }
//        
//        System.out.println("Usarios validos: "+perosonas.size());
        
        // guarda los nombres de las personas mayores
//       
//        List<Persona> personas = List.of(
//                new Persona("Ana", 20),
//                new Persona("Carla", 17),
//                new Persona("Carla", 30)
//        );
//        List<String> auditoria = new ArrayList<>();
//        
//        // verificamos la edad
//        Predicate<Persona> esMayor = p -> p.getEdad() >=18;
//        
//        // imprimimos 
//        Consumer<Persona> imprimir = p -> System.out.println("Registrado "+p.getNombre());
//        // agrgamos a la nueva lista
//        Consumer<Persona> guardar = p -> auditoria.add(p.getNombre());
//        
//        // combinamos los Consumer
//        Consumer<Persona> registrar = imprimir.andThen(guardar);
//        
//        personas.stream()
//                .filter(esMayor)
//                .forEach(registrar);
//        
//        System.out.println("Auditoria "+ auditoria);
        
        
        
        
        
        
//        // creamos la lista y insertamos personas con .of
//        List<Persona> personitas = List.of(
//                new Persona("Juana", 12),
//                new Persona("Carla", 19),
//                new Persona("Alicia", 22),
//                new Persona("Araceli", 12)
//         
//        );
//        
//        // validamos las condiciones
//         Predicate<Persona> esMa = p -> p.getEdad()>=18;
//        Predicate<Persona> comiA = p -> p.getNombre().startsWith("A");
//        
//        // creamos una nueva lista con las personas ya filtrandas
//        List<Persona> filtradas = personitas.stream()
//                .filter(esMa.and(comiA))
//                .collect(Collectors.toList());
//        
//        // recorremos la lista
//        filtradas.forEach(p -> System.out.println(p.getNombre()));
        
        
        
        
//        List<Persona> personas = List.of(
//                new Persona("Ana", 25),
//                new Persona("Juan", 30),
//                new Persona("Luisa", 20)
//        );
//        
//        Function<Persona,String> obtenerNo = Persona::getNombre;
//        
//        
//        List<String> nombres = personas.stream()
//                .map(obtenerNo)
//                .collect(Collectors.toList());
//        System.out.println(nombres);
        
        
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
