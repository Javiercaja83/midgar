public class Gato implements SonidosAnimal{
    private String nombre;
    private String raza;
    public Gato(String nombre, String raza) {
        this.nombre = nombre;
        this.raza = raza;
    }
    
    @Override
    
    public String hacerSonido(){
        return "Miau";
    }
}
