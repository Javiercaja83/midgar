public class Mueble extends Producto{
    private Material material;
    private boolean requiereMontaje;
    private double consumo;

    public Mueble(String nombre, double peso, double alto, double ancho, double profundidad, Material material,
            boolean requiereMontaje) {
        super(nombre, peso, alto, ancho, profundidad);
        this.material = material;
        this.requiereMontaje = requiereMontaje;
    }
    
    @Override
    public double calcularCostoEnvio(){
        if (requiereMontaje) {
            return (peso * 5 ) + (volumen()*30)+ 15;
        }else{
            return (peso * 5 ) + (volumen()*30);
        }
    }

    @Override
    public String toString() {
        return "Mueble [nombre=" + nombre + ", material=" + material + ", peso=" + peso + ", requiereMontaje="
                + requiereMontaje + ", alto=" + alto + ", ancho=" + ancho + ", profundidad=" + profundidad
                + ", volumen()=" + volumen() + "]";
    }

  
    public double calcularConsumo(){
        return consumo;
    }
}
