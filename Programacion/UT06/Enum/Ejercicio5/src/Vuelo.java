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
    
    
}
/*clase vuelo 
numeroVuelo
origen
destino
fecha
hora
estado enum programado, demorado y cancelado
metodos constructor, getters y setters y toString */