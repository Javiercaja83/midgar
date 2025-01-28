Crea un sistema para gestionar productos en una tienda.

Define una clase base llamada Producto con los siguientes atributos:

codigo (String, único para cada producto)

nombre (String)

precio (double)

Además, incluye:

Un método calcularDescuento(double porcentaje) que devuelva el precio del producto después de aplicar un descuento.

Sobrescribe el método equals para comparar productos por su codigo.

Crea una subclase llamada ProductoElectronico que extienda Producto con el atributo adicional:

garantia (int, duración en meses)

Sobrecarga el método calcularDescuento para que reciba dos parámetros: un porcentaje y un descuento adicional en euros.

Este método devuelve el precio después de aplicar ambos descuentos.

Sobrescribe el método equals para comparar productos electrónicos por su codigo y su garantia.

Crea una Tienda que tendrá:

Una lista de productos y productos electrónicos.De 10 elementos cada una.

Crea un método que permita añadir un Producto (solamente si no está ya incluido). Utiliza el método equals.

Crea un método que permita añadir un ProductoElectronico (solamente si no está ya incluido). Utiliza el método equals.

Ambos métodos devolverán true si se ha podido añadir el producto (si hay espacio en la lista). Completa un método que permita calcularDescuento de un producto, el método tendrá la siguiente firma:

public double calcularDescuentoProducto(Producto producto, double descuento) public double calcularDescuentoFinalProducto (ProductoElectronico producto, double descuento, double segundoDescuento)

completa un método que muestre toda la información de la tienda (las dos colecciones de productos con sus datos correspondientes)

En la clase principal, crea una instancia de Tienda y haz una prueba para añadir productos (Producto y ProductoElectronico)

Haz una prueba del funcionamiento de hacer el descuento a un producto y el descuento final a un producto electrónico.