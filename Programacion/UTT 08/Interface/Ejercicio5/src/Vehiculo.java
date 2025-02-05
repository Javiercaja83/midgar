public abstract class Vehiculo {
    private String marca;
    private String modelo;
    private String matricula;
    protected int anioFabricacion;
    protected double peso;

    public Vehiculo(String marca, String modelo, String matricula, int anioFabricacion, double peso) {
        this.marca = marca;
        this.modelo = modelo;
        this.matricula = matricula;
        this.anioFabricacion = anioFabricacion;
        this.peso = peso;
    }

    public void mostrarInformacion(){
        System.out.println( "marca " + marca +
        " \n modelo " + modelo + 
        " \n matricula " + matricula + 
        "\n  anio de fabricacion " + anioFabricacion + 
        "\n peso " + peso
        );
     
    }
    
    public abstract double calcularCostoMantenimiento();
}
