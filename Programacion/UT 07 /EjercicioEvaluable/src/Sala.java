public class Sala {
    private String nombre;
    private String id;
    private int numero;
    private boolean disponible;
    private String empleado;
    
    //no tengo que recibir el vaor de propietario y disponible porque tiene uno por deferto
    public Sala(String nombre, String id, int numero){
        this.id = id;
        this.nombre = nombre;
        this.numero =numero;
        this.disponible = true;
        this.empleado = "";
    }

     
     public boolean liberarSala(String propietario){
     return false;
     }
     
     public boolean reservarSala(String propietario){
     return true;
     }
     
     public String mostrarSala(){
     String resultado = "Sala [nombre=" + nombre + ", id=" + id + ", numero=" + numero + ", disponible=" + disponible
                + ", empleado=" + empleado + "]";
     return resultado;
   
     }


    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public String getId() {
        return id;
    }


    public void setId(String id) {
        this.id = id;
    }


    public int getNumero() {
        return numero;
    }


    public void setNumero(int numero) {
        this.numero = numero;
    }


    public boolean isDisponible() {
        return disponible;
    }


    public String getEmpleado() {
        return empleado;
    }



    
}
