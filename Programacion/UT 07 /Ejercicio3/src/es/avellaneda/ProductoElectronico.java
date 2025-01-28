package es.avellaneda;

import java.util.Scanner;

/*Crea una subclase llamada ProductoElectronico que extienda Producto con el atributo adicional:

garantia (int, duración en meses)

Sobrecarga el método calcularDescuento para que reciba dos parámetros: un porcentaje y un descuento adicional en euros.

Este método devuelve el precio después de aplicar ambos descuentos.

Sobrescribe el método equals para comparar productos electrónicos por su codigo y su garantia. */
    
    public class ProductoElectronico extends Producto{
        private int garantia;
        public ProductoElectronico(String codigo, String nombre, double precio, int garantia) {
            super(codigo, nombre, precio);
            this.garantia = garantia;
        }


        public ProductoElectronico(String codigo, String nombre, int garantia) {
            super(codigo, nombre);
            this.garantia = garantia;
        }

    public double calcularDescuento(double descuento, double desFinal){
        return super.calcularDescuento(descuento) - desFinal;
    }
    
   


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + garantia;
        return result;
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!super.equals(obj))
            return false;
        if (getClass() != obj.getClass())
            return false;
        ProductoElectronico other = (ProductoElectronico) obj;
        if (garantia != other.garantia)
            return false;
        return true;
    }
    
    }
        
     