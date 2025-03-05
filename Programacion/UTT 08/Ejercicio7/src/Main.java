
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Producto> listaProductos = new ArrayList<>();
        ProductoNoPerecedero Miel = new ProductoNoPerecedero(Tipo.Permite_Devolucion, "Miel Maya", 4);
        ProductoNoPerecedero LataAtun = new ProductoNoPerecedero(Tipo.Permite_Devolucion, "Calvo", 5);
        ProductoNoPerecedero LataAlubias = new ProductoNoPerecedero(Tipo.Permite_Devolucion, " Litoral ", 2);
        ProductoPerecedero BocataLomo = new ProductoPerecedero(1, "Bocata de lomo con queso", 7);
        ProductoPerecedero Hamburguesa = new ProductoPerecedero(3, "Big Mac", 10);
        listaProductos.add(Miel);
        listaProductos.add(LataAtun);
        listaProductos.add(LataAlubias);
        listaProductos.add(BocataLomo);
        listaProductos.add(Hamburguesa);
        for(Producto p: listaProductos){
            System.out.println(p.calcular());
        }

    }
    
    public static boolean consultarDevolucion(ArrayList<Producto> listaProductos ){
        boolean esDevolvible = false;
        for(Producto p : listaProductos){
            if(p.esDevolvible()== true){
            esDevolvible = true;
            }
        }
    return esDevolvible;
    }

}