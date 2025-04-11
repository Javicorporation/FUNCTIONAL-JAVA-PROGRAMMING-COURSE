package ejemplo03;
public class Ejemplo03 {

    public static void main(String[] args) {
        
         CalcularPedido calculo = (price, cantidad, impues, descu, envio)->{
                 double subtt = price * cantidad;
                 double ttlImpuesto = subtt*(impues/100);
                 double ttlDescue = subtt*(descu/100);
                 double envioCosto = envio ? 10.0 : 0.0;
                 
                 return subtt+ttlImpuesto+ttlDescue+envioCosto;
         };
         
         
         double total = calculo.calcular(100.0, 2, 18.0, 10.0, true);
         System.out.println("Total de Pedido: "+ total);
    }
    
}
