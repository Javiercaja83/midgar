public class ProductoPerecedero extends Producto{
    int diasACaducar;

    public ProductoPerecedero(int diasACaducar) {
        this.diasACaducar = diasACaducar;
    }

    public ProductoPerecedero(int diasACaducar, String Nombre, int precio) {
        super(Nombre, precio);
        this.diasACaducar = diasACaducar;
    }
        
    @Override
    public int calcular(){
        int precioBase = getPrecio();
        int precioFinal  = precioBase;
        switch (diasACaducar) {
            case 1:
                precioFinal = precioBase - (precioBase / 4);
                break;
            case 2:
            precioFinal = precioBase - (precioBase / 3);
                break;
            case 3:
            precioFinal = precioBase - (precioBase /2);
                break;
        }
        return precioFinal;
    }

    public int calcular(int productosPasados){
        return getPrecio();
    }

    public int getDiasACaducar() {
        return diasACaducar;
    }

    public void setDiasACaducar(int diasACaducar) {
        this.diasACaducar = diasACaducar;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ProductoPerecedero{");
        sb.append("diasACaducar=").append(diasACaducar);
        sb.append('}');
        return sb.toString();
    }
    @Override
    public boolean  esDevolvible(){
        if (getDiasACaducar() > 5) {
            return true;
        }
        return  false;
    }
}
