public class Mueble extends Producto{
    private Material material;
    private boolean requiereMontaje;

    public Mueble(String nombre, double peso, double alto, double ancho, double profundidad, Material material,
            boolean requiereMontaje) {
        super(nombre, peso, alto, ancho, profundidad);
        this.material = material;
        this.requiereMontaje = requiereMontaje;
    }
    
    @Override
    public double calcularCostoEnvio(){
        double costo;
        costo = (peso * 5 ) + (volumen()*30);
        if (requiereMontaje == true) {
            costo = costo + 15;
        }
        return costo;
    }
}
