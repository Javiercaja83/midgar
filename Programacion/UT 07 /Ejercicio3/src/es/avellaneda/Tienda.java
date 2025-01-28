package es.avellaneda;

import java.util.Scanner;

/*Una lista de productos y productos electrónicos.De 10 elementos cada una.

Crea un método que permita añadir un Producto (solamente si no está ya incluido). Utiliza el método equals.

Crea un método que permita añadir un ProductoElectronico (solamente si no está ya incluido). Utiliza el método equals.

Ambos métodos devolverán true si se ha podido añadir el producto (si hay espacio en la lista).
Completa un método que permita calcularDescuento de un producto, el método tendrá la siguiente firma:

public double calcularDescuentoProducto(Producto producto, double descuento) public double calcularDescuentoFinalProducto (ProductoElectronico producto, double descuento, double segundoDescuento)

completa un método que muestre toda la información de la tienda (las dos colecciones de productos con sus datos correspondientes)

En la clase principal, crea una instancia de Tienda y haz una prueba para añadir productos (Producto y ProductoElectronico)

Haz una prueba del funcionamiento de hacer el descuento a un producto y el descuento final a un producto electrónico. */
public class Tienda {
    private   Producto[] productos;
    private ProductoElectronico[] productosElectronicos;
    
    public Tienda(){
        productos = new Producto[10];
        productosElectronicos= new ProductoElectronico[10];
    }

    public boolean añadirProducto(){
        Producto productoCreado = productos[0];
        for(int i = 0; i < productos.length; i++){

            if(productos[i] != null && productos[i].equals(productoCreado)){
                return false;
            }
      
        }
        for(int i = 0; i < productos.length; i++){
            if(productos[i] == null){
                productos[i] = productoCreado;
                return true;
            }
        }
        return false;
    }
    
    
    public double calcularDescuentoProducto(Producto producto, double descuento) {
        return producto.calcularDescuento(descuento);
    }

    public double calcularDescuentoFinalProducto (ProductoElectronico producto, double descuento, double segundoDescuento) {
       return producto.calcularDescuento(descuento, segundoDescuento);
    }
    
    public void MostrarTienda(){
        for(Producto p: productos){
             p.toString();
        }
        for(ProductoElectronico pE: productosElectronicos){
            pE.toString();
        }
    }

    

}


