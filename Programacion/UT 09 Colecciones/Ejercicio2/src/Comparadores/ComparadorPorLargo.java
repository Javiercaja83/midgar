package Comparadores;
import java.util.Comparator;
import Modelos.*;

public class ComparadorPorLargo implements Comparator<Producto>{

    @Override
    public int compare(Producto producto1, Producto producto2) {
       return Double.compare(producto1.getLargo(), producto2.getLargo());

    }

}