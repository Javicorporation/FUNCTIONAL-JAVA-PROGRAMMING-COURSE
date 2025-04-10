package jfuncional;

@FunctionalInterface
public interface CalcularDescuento {
    double aplicarDescu(double price, double porce, String codiPromo);
    
}
