public class Pasajero {
    private String nombre;
    private String documentoIdentidad;
    private String asiento;
    private Categoria Categoria;
    public Pasajero(String nombre, String documentoIdentidad, String asiento, Categoria Categoria) {
        this.nombre = nombre;
        this.documentoIdentidad = documentoIdentidad;
        this.asiento = asiento;
        this.Categoria = Categoria;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getDocumentoIdentidad() {
        return documentoIdentidad;
    }
    public void setDocumentoIdentidad(String documentoIdentidad) {
        this.documentoIdentidad = documentoIdentidad;
    }
    public String getAsiento() {
        return asiento;
    }
    public void setAsiento(String asiento) {
        this.asiento = asiento;
    }
    public Categoria getCategoria() {
        return Categoria;
    }
    public void setCategoria(Categoria categoria) {
        this.Categoria = categoria;
    }
    @Override
    public String toString() {
        return "Pasajero [nombre=" + nombre + ", documentoIdentidad=" + documentoIdentidad + ", asiento=" + asiento
                + ", categoria=" + Categoria + "]";
    }

    
}
