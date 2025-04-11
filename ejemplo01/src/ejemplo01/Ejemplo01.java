package ejemplo01;

public class Ejemplo01 {

    public static void main(String[] args) {
        
        CreateUser creador = (nombre, edad, ciudad) -> 
                new Usuario(nombre, edad, ciudad);
        
        Usuario u = creador.crear("Juana", 32, "Quito");
        
        System.out.println("Se creo: "+u);
    }
    
}
