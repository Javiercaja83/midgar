public class Main {
public static void main(String[] args) {
    Electrodomestico lavadora  = new Electrodomestico(Tipo.REFLIGERADOR, false, "Dyson", 8.0, 1.0, 2.0, 1.0);
    Mueble mesa = new Mueble("IKEA", 20, 1.50, 2, 1, Material.Madera, true);
    
    System.out.println(mesa.calcularCostoEnvio());
    System.out.println(lavadora.calcularCostoEnvio());
    
    Producto[] productos = new Producto[2];
    productos[0] = mesa;
    productos[1] = lavadora;
    
    for(Producto p : productos){
        if(p instanceof Electrodomestico){
            ((Electrodomestico)p).calcularCostoEnvio();
        }else if(p instanceof Mueble){
            ((Mueble)p).calcularConsumo();
        }
    }
}
}
