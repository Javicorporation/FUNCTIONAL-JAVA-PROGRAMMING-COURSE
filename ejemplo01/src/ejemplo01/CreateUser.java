package ejemplo01;

@FunctionalInterface
public interface CreateUser {
    Usuario crear(String nombre, int edad, String ciudad);   
}
