public abstract class Producto implements Comparable<Producto>{
    private String Nombre;
    private int precio;

    public Producto(String Nombre, int precio) {
        this.Nombre = Nombre;
        this.precio = precio;
    }

    public Producto() {
    }
    
    public String getNombre() {
        return Nombre;
    }
    public void setNombre(String nombre) {
        Nombre = nombre;
    }
    public int getPrecio() {
        return precio;
    }
    public void setPrecio(int precio) {
        this.precio = precio;
    }
    
    public abstract int calcular();
    public abstract int calcular(int productosPasados);
    public abstract boolean esDevolvible();

    @Override
    public int compareTo( Producto p) {
    
        if (this.precio > getPrecio()) {
          return 1;
        }else if (this.precio < getPrecio()) {
          return -1;
        }else {
          return 0;
        }
      }
    
}
