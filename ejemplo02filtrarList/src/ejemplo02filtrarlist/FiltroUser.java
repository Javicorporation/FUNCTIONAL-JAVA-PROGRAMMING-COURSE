package ejemplo02filtrarlist;

import java.util.List;

@FunctionalInterface
public interface FiltroUser {
    
    List<Usuario> filtar(List<Usuario> lista, int edadMin);
    
}
