public class Electrodomestico extends Producto{
    private Tipo tipo;
    private boolean esFragil;

    public Electrodomestico(Tipo tipo, boolean esFragil,  String nombre, double peso, double alto,double ancho,double profundidad) {
        super(nombre, peso, alto, ancho, profundidad);
        this.tipo = tipo;
        this.esFragil = esFragil;
    }

    @Override
    public double calcularCostoEnvio(){
        if (esFragil) {
            return (peso * 10)+(volumen() *50)  * 0.2;
        }
        else {
            return (peso * 10)+(volumen() *50);
        }
    }

    public Electrodomestico(String nombre, double peso, double alto, double ancho, double profundidad, Tipo tipo,
            boolean esFragil) {
        super(nombre, peso, alto, ancho, profundidad);
        this.tipo = tipo;
        this.esFragil = esFragil;
    }

    @Override
    public String toString() {
        return "Electrodomestico [nombre=" + nombre + ", tipo=" + tipo + ", peso=" + peso + ", esFragil=" + esFragil
                + ", alto=" + alto + ", ancho=" + ancho + ", profundidad=" + profundidad + ", volumen()=" + volumen()
                + "]";
    }

    
    
}
