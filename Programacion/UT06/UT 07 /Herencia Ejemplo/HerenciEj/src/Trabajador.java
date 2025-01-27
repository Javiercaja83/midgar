public class Trabajador {
    private String nombre, puesto, direccion;
    private int felefono, nss;
    
    public Trabajador(String nombre, String puesto, String direccion, int felefono, int nss) {
        this.nombre = nombre;
        this.puesto = puesto;
        this.direccion = direccion;
        this.felefono = felefono;
        this.nss = nss;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getPuesto() {
        return puesto;
    }
    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }
    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public int getFelefono() {
        return felefono;
    }
    public void setFelefono(int felefono) {
        this.felefono = felefono;
    }
    public int getNss() {
        return nss;
    }
    public void setNss(int nss) {
        this.nss = nss;
    }

    


}

