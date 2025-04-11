
import java.util.List;
import java.util.Optional;

public class Ejemplo04 {

    public static void main(String[] args) {
        
        List<User> usuarios = List.of(
                new User("Juana", 32, "Azuay"),
                new User("Maria", 0, "Santa Elena"),
                new User("Carla", 0, "Machala"),
                new User("Karen", 0, "Manabi")
        );
        
        BuscarUser buscar = (lista, nombre) ->
                lista.stream().filter(u -> u.getNombre().equalsIgnoreCase(nombre))
                .findFirst();
        
        
        Optional<User> resultado = buscar.buscar(usuarios,"Carla");
        
        String ciudad = resultado.map(User::getCiudad).orElse("No encontrado");
        System.out.println("Ciudad: "+ciudad);
        
    }
    
}
