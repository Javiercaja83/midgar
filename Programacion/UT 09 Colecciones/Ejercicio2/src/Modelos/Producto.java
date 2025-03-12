package Modelos;
import java.util.Comparator;

public class Producto implements Comparable<Producto> {
    //hacer un comparable y los 3 comparator para el alto, lago y ancho, un constructor con solo el nombre y me aseguro que los valores alto, largo y ancho se instancian y truncan con los minimos y maximos
    //por defecto, el comparator es ascendente, en este caso es al reves
    private String Nombre;
    private double Alto, Ancho, Largo;
        public Producto(String Nombre){
            this.Nombre = Nombre;
        }
    
    
        public Producto(double Alto, double Largo, double Ancho){
            this.Alto = 2;
            this.Largo = 2;
            this.Ancho = 2;
        }
        public Producto(double Alto, double Largo, double Ancho, String Nombre){
            if (Alto < 2) {
                this.Alto = 2;
            } else if (Alto > 30) {
                this.Alto = 30;
            } else {
                this.Alto = Alto;
            }
        
            if (Ancho > 10) {
                this.Ancho = 10;
            } else if (Ancho < 2) {
                this.Ancho = 2;
            } else {
                this.Ancho = Ancho;
            }
        
            if (Largo < 2) {
                this.Largo = 2;
            } else if (Largo > 10) {
                this.Largo = 10;
            } else {
                this.Largo = Largo;
            }
        
            this.Nombre = Nombre;
        }

        @Override
        public String toString() {
            return "Producto{" +
                    "Nombre='" + Nombre + '\'' +
                    ", Alto=" + Alto +
                    ", Ancho=" + Ancho +
                    ", Largo=" + Largo +
                    '}';
        }
            // Custom comparators
    public static Comparator<Producto> compareByAlto = new Comparator<Producto>() {
        @Override
        public int compare(Producto p1, Producto p2) {
            return Double.compare(p1.Alto, p2.Alto); 
        }
    };

    public static Comparator<Producto> compareByAncho = new Comparator<Producto>() {
        @Override
        public int compare(Producto p1, Producto p2) {
            return Double.compare(p1.Ancho, p2.Ancho); 
        }
    };

    public static Comparator<Producto> compareByLargo = new Comparator<Producto>() {
        @Override
        public int compare(Producto p1, Producto p2) {
            return Double.compare(p1.Largo, p2.Largo); 
        }
    };
    
    @Override
    public int compareTo(Producto productoOtro) {
        return Nombre.compareTo(productoOtro.getNombre());  
    
}
    
public String getNombre() {
    return Nombre;
}


public void setNombre(String nombre) {
    Nombre = nombre;
}


public double getAlto() {
    return Alto;
}


public void setAlto(double alto) {
    Alto = alto;
}


public double getAncho() {
    return Ancho;
}


public void setAncho(double ancho) {
    Ancho = ancho;
}


public double getLargo() {
    return Largo;
}


public void setLargo(double largo) {
    Largo = largo;
}

public static Comparator<Producto> getCompareByAlto() {
    return compareByAlto;
}


public static void setCompareByAlto(Comparator<Producto> compareByAlto) {
    Producto.compareByAlto = compareByAlto;
}


public static Comparator<Producto> getCompareByAncho() {
    return compareByAncho;
}


public static void setCompareByAncho(Comparator<Producto> compareByAncho) {
    Producto.compareByAncho = compareByAncho;
}


public static Comparator<Producto> getCompareByLargo() {
    return compareByLargo;
}


public static void setCompareByLargo(Comparator<Producto> compareByLargo) {
    Producto.compareByLargo = compareByLargo;
}

}