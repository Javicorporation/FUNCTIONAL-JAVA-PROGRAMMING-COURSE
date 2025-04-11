package ejemplo02filtrarlist;

import java.util.List;

public class Ejemplo02filtrarList {

    public static void main(String[] args) {
        
        List<Usuario> usuarios = List.of(
                new Usuario("Juana", 23, "Quito"),
                new Usuario("Carla", 17, "Loja"),
                new Usuario("Camila", 21, "Guayas")
        );
        
        // instanciamos la interfaz
        FiltroUser namen = (lista, edadMin) ->
                lista.stream()
                .filter(u -> u.getEdad() >= edadMin)
                .toList();
        
        List<Usuario> mayores = namen.filtar(usuarios, 18);
        mayores.forEach(u -> System.out.println("Aprobado: "+u));
    }
    
}
