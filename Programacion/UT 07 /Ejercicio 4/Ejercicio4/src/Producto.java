public abstract class Producto {
    protected String nombre;
    protected double peso, alto, ancho, profundidad;

    public Producto(String nombre, double peso, double alto, double ancho, double profundidad) {
        this.nombre = nombre;
        this.peso = peso;
        this.alto = alto;
        this.ancho = ancho;
        this.profundidad = profundidad;
    }

    public double volumen(){
        double V = alto * ancho * profundidad;
        return V;
    }
    
    public double calcularCostoEnvio(){
        double costo = 0;
        return costo;
        }

    @Override
    public String toString() {
        return "Producto [nombre=" + nombre + ", peso=" + peso + ", alto=" + alto + ", ancho=" + ancho
                + ", profundidad=" + profundidad + ", volumen()=" + volumen() + "]";
    }
    
    }
