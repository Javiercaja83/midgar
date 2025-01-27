import java.time.LocalDate;
import java.time.LocalTime;

    public class Vuelo {

    private String numeroVuelo, origen, destino; 
    private LocalDate fechaSalida; 
    private LocalTime horaSalida; 
    private Estado estado;
    public Vuelo(String numeroVuelo, String origen, String destino, LocalDate fechaSalida, LocalTime horaSalida,
            Estado estado) {
        this.numeroVuelo = numeroVuelo;
        this.origen = origen;
        this.destino = destino;
        this.fechaSalida = fechaSalida;
        this.horaSalida = horaSalida;
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Vuelo: numeroVuelo=" + numeroVuelo + ", origen=" + origen + ", destino=" + destino + ", fechaSalida="
                + fechaSalida + ", horaSalida=" + horaSalida + ", estado=" + estado;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((numeroVuelo == null) ? 0 : numeroVuelo.hashCode());
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
        Vuelo other = (Vuelo) obj;
        if (numeroVuelo == null) {
            if (other.numeroVuelo != null)
                return false;
        } else if (!numeroVuelo.equals(other.numeroVuelo))
            return false;
        return true;
    } 
    
    
}
/*clase vuelo 
numeroVuelo
origen
destino
fecha
hora
estado enum programado, demorado y cancelado
metodos constructor, getters y setters y toString */