package ejemplo03;

@FunctionalInterface
public interface CalcularPedido {
    double calcular(double price, int cantidad, double impue, double desc, boolean  envio);
    
}
