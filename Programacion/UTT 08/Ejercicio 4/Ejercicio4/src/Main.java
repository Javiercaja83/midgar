public class Main {
public static void main(String[] args) {
    double costo;
    Electrodomestico lavadora  = new Electrodomestico(Tipo.REFLIGERADOR, false, "Dyson", 8.0, 1.0, 2.0, 1.0);
    Mueble mesa = new Mueble("IKEA", 20, 1.50, 2, 1, Material.Madera, true);

    costo = lavadora.calcularCostoEnvio();
    System.out.println(mesa.calcularCostoEnvio());
    System.out.println(lavadora.calcularCostoEnvio());
}
}
