package Modelo;

public class LibroDigital extends Libro {
    private String tamañoMB;

    public LibroDigital(String titulo, String autor, String numeroClasificacion, double numeroClasificacion2,
            String tamañoMB) {
        super(titulo, autor, numeroClasificacion, numeroClasificacion2);
        this.tamañoMB = tamañoMB;
    }

    
    
}
