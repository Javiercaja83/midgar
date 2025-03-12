package Comparadores;
import java.util.Comparator;
import Modelos.*;

public class ComparadorPorAlto implements Comparator<Producto>{

    @Override
    public int compare(Producto producto1, Producto producto2) {
       return Double.compare(producto1.getAncho(), producto2.getAncho());

    }

}