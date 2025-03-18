package Modelo;

public class Libro  implements Comparable<Libro>{
    private String titulo, autor,numeroClasificacion, isbn ;
    
    public Libro(String titulo, String autor, String numeroClasificacion, double numeroClasificacion2 ) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroClasificacion = generarCodigo(numeroClasificacion) ;
        this.isbn = isbn;
    }

    public String getNumeroClasificacion() {
        return numeroClasificacion;
    }

    private String generarCodigo(String categoriaDewey) {
        String inicialesTitulo = titulo.length() >= 3 ? titulo.substring(0, 3).toUpperCase() : titulo.toUpperCase();
        return categoriaDewey + " " + inicialesTitulo;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((titulo == null) ? 0 : titulo.hashCode());
        result = prime * result + ((autor == null) ? 0 : autor.hashCode());
        result = prime * result + ((numeroClasificacion == null) ? 0 : numeroClasificacion.hashCode());
        result = prime * result + ((isbn == null) ? 0 : isbn.hashCode());
        return result;
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Libro other = (Libro) obj;
        if (titulo == null) {
            if (other.titulo != null)
                return false;
        } else if (!titulo.equals(other.titulo))
            return false;
        if (autor == null) {
            if (other.autor != null)
                return false;
        } else if (!autor.equals(other.autor))
            return false;
        if (numeroClasificacion == null) {
            if (other.numeroClasificacion != null)
                return false;
        } else if (!numeroClasificacion.equals(other.numeroClasificacion))
            return false;
        if (isbn == null) {
            if (other.isbn != null)
                return false;
        } else if (!isbn.equals(other.isbn))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Libro [titulo=" + titulo + ", autor=" + autor + ", isbs=" + isbn + ", numeroClasificacion="
                + numeroClasificacion + "]";
    }



       @Override
    public int compareTo(Libro otro) {
        // Como el código está dentro de Libro, Java permite acceder a los atributos
        // private de cualquier objeto Libro, aunque sea una instancia diferente.
        int comparacionCodigo = this.numeroClasificacion.compareTo(otro.numeroClasificacion);
        return (comparacionCodigo != 0) ? comparacionCodigo : this.titulo.compareTo(otro.titulo);
    }


}
