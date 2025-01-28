package es.avellaneda;

import java.util.Scanner;

/*Define una clase base llamada Producto con los siguientes atributos:

codigo (String, único para cada producto)

nombre (String)

precio (double)

Además, incluye:

El constructor que permite inicializar la instancia conociendo el valor de totos sus atributos.

Tanto el código como el nombre son atributos obligatorios, aunque está permitido crear una instancia sin que se concozca el precio del producto.
Se podrá cambiar el precio del producto, sin embargo, no será posible cambiar ni el nombre ni el código, una vez realizada la inicialización del objeto.

Un método calcularDescuento(double porcentaje) que devuelva el precio del producto después de aplicar un descuento.

Sobrescribe el método equals para comparar productos por su codigo. */
public class Producto {
    private String codigo, nombre;
    private double precio;

    public Producto(String codigo, String nombre, double precio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
    }

    public Producto(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double calcularDescuento(double descuento) {
        return precio - descuento;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Producto other = (Producto) obj;
        if (codigo == null) {
            if (other.codigo != null)
                return false;
        } else if (!codigo.equals(other.codigo))
            return false;
        if (nombre == null) {
            if (other.nombre != null)
                return false;
        } else if (!nombre.equals(other.nombre))
            return false;
        if (Double.doubleToLongBits(precio) != Double.doubleToLongBits(other.precio))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Producto [codigo=" + codigo + ", nombre=" + nombre + ", precio=" + precio + "]";
    }

}
