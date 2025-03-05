public class BicicletaElectrica implements Electrico {
    private double capacidadBateria, consumoPorKm;

    public BicicletaElectrica(double capacidadBateria, double consumoPorKm) {
        this.capacidadBateria = capacidadBateria;
        this.consumoPorKm = consumoPorKm;
    }
    
    @Override
    public double calcularCostoCarga(){
        return capacidadBateria * 0.2;
    }

    public double autonomia(){
        return capacidadBateria/consumoPorKm;
    }
}
