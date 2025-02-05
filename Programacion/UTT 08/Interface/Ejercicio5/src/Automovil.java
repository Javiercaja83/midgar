public class Automovil extends Vehiculo {
    private int numeroPuertas;
    private boolean esHibrido;
    private double capacidadCombustible;
    public Automovil(String marca, String modelo, String matricula, int anioFabricacion, double peso, int numeroPuertas,
            boolean esHibrido, double capacidadCombustible) {
        super(marca, modelo, matricula, anioFabricacion, peso);
        this.numeroPuertas = numeroPuertas;
        this.esHibrido = esHibrido;
        this.capacidadCombustible = capacidadCombustible;
    }

    @Override
    public double calcularCostoMantenimiento(){
        double costoBase;
        costoBase  = (peso * 0.05) + (capacidadCombustible * 0.1);
        if (esHibrido == true) {
            costoBase = costoBase - (costoBase * 0.2);
            return costoBase;
        }

        return costoBase;
    }   

    public double calcularPrecioHora(){
        double precioBase = 2;
        if(anioFabricacion>2015){
            precioBase = 2 + (2*0.2);
        return precioBase;
        }
        return precioBase;
    }
    
}
