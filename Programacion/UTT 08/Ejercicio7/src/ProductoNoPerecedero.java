public class ProductoNoPerecedero extends Producto {
    Tipo tipo;

    public ProductoNoPerecedero(Tipo tipo) {
        this.tipo = tipo;
    }

    public ProductoNoPerecedero(Tipo tipo, String Nombre, int precio) {
        super(Nombre, precio);
        this.tipo = tipo;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }


    //En No perecedero, 
    //simplemente seria multiplicar el precio por la cantidad de **productos pasados.**
    @Override
    public int calcular(){
        return getPrecio();
    }
    public int calcular(int productosPasados){
        int precioFinal = getPrecio()*productosPasados;
        return precioFinal;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ProductoNoPerecedero{");
        sb.append("tipo=").append(tipo);
        sb.append('}');
        return sb.toString();
    }
    
    @Override
    public boolean  esDevolvible(){
        if (getTipo() == Tipo.Permite_Devolucion) {
            return true;
        }
        return  false;
    }
}
