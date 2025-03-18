package model;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.HashSet;
import java.util.Iterator;

public class DAOAgendaCompartida {
    public HashSet<Cita> cargarCitas(){
        HashSet<Cita> citas = new HashSet<>();
        citas.add(new Cita(LocalDate.of(2025, 03, 07), LocalTime.of(15, 30, 0), "Reunion padres", "Escuela"));
        citas.add(new Cita(LocalDate.of(2025, 06, 25), LocalTime.of(20, 45, 0), "Limpieza boca", "Salud"));
        citas.add(new Cita(LocalDate.of(2025, 04, 14), LocalTime.of(9, 15, 0), "Llamar Cliente", "Trabajo"));
        return citas;
    }
}
