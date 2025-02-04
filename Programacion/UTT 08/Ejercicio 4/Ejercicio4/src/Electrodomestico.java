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
        double costo;
        costo = (peso * 10)+(volumen() *50);
        if(esFragil==true){
            costo = costo + (costo * 20);
        }
    return costo;
    }

}
