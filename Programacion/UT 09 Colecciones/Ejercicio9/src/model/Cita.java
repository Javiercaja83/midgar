package model;

import java.time.LocalDate;
import java.time.LocalTime;

public class Cita implements Comparable<Cita>{
    private LocalDate fecha;
    private LocalTime hora;
    private String descripcion, categoria;
    
    public Cita(LocalDate fecha, LocalTime hora, String descripcion, String categoria) {
        this.fecha = fecha;
        this.hora = hora;
        this.descripcion = descripcion;
        this.categoria = categoria;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    @Override
    public int compareTo(Cita OtraCita) {
        return  OtraCita.getFecha().compareTo(fecha);
    }

    

}