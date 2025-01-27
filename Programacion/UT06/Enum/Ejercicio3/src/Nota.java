public class Nota {
    private TipoNota tipo;
    private double calificiacion;

    public Nota(TipoNota tipo, double calificacion){
        this.tipo = tipo;
        this.calificiacion = calificacion;
    }

    public String getTipo() {
        return tipo.toString();
    }

    public void setTipo(TipoNota tipo) {
        this.tipo = tipo;
    }

    public double getCalificiacion() {
        return calificiacion;
    }

    public void setCalificiacion(double calificiacion) {
        this.calificiacion = calificiacion;
    }
    
}

    

/*Clase Nota:

Atributos: tipo (Enum): Tipo de evaluación (Primera, Segunda, Tercera, Ordinaria, Extraordinaria).

calificacion (double): Nota obtenida.

Métodos:

Constructor para inicializar los atributos.
 */