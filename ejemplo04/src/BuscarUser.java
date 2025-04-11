
import java.util.List;
import java.util.Optional;

@FunctionalInterface
public interface BuscarUser {
    Optional<User> buscar(List<User> users, String nombre);
    
}
