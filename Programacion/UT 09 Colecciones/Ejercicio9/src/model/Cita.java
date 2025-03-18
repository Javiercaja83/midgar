package model;

import java.time.LocalDate;
import java.time.LocalTime;

public class Cita implements Comparable<Cita>{
    private LocalDate fecha;
    private LocalTime hora;
    private String descripcion, categoria;
    
    public Cita( LocalDate fecha,LocalTime hora,String descripcion, String categoria) {
        /*  ASI LO GENERAS DE MANERA ALEATORIA EN LA CLASE CITA, PERO TIENES QUE AÑADIRLE LOS VALORES EN EL DAO CON UN **LocalDate.of(año, mes, dia)*
        this.fecha = generarFecha();
        this.hora = generarHora();
        */
        this.fecha = fecha;
        this.hora = hora;
        this.descripcion = descripcion;
        this.categoria = categoria;
    }
    /*
    private LocalDate generarFecha(){
        int año, mes, dia;
        año = (int) (Math.random()*2000+1-925);
        mes = (int) (Math.random()*30+1);
        dia = (int) (Math.random()*365+1);
        return LocalDate.of(0, 0, 0);
    }
        
*/
/* 
    private LocalTime generarHora(){
        int hora, minuto, segundo;
        hora  = (int) (Math.random()*24);
        minuto  = (int) (Math.random()*60);
        segundo = 0;
        return LocalTime.of(0, 0, 0);
    }
    */

    @Override
    public int compareTo(Cita OtraCita) {
        if (this.fecha.equals(OtraCita.fecha)) {
            return this.hora.compareTo(OtraCita.hora);
        }
                return this.fecha.compareTo(OtraCita.fecha);
    }

    @Override
    public String toString() {
        return "Cita [fecha=" + fecha + ", hora=" + hora + ", descripcion=" + descripcion + ", categoria=" + categoria
                + "]";
    }

    public String getCategoria() {
        return categoria;
    }
    
}