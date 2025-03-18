package model;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import model.*;

public class DAOAgendaPropia {
    public  ArrayList<Cita> getListaCitas(){

        ArrayList<Cita> listaCitas = new ArrayList<>();
        listaCitas.add(new Cita(LocalDate.of(2025, 6, 15), LocalTime.of(9, 0, 0), "Reunion Jefe", "Trabajo"));
        listaCitas.add(new Cita(LocalDate.of(2025, 6, 15), LocalTime.of(9, 0, 0), "Tutoria maestra", "Escuela"));
        listaCitas.add(new Cita(LocalDate.of(2025, 6, 15), LocalTime.of(9, 0, 0), "Revision rodilla", "Salud"));
        return listaCitas;
    }
    public HashSet<Cita> hashSetCitas(ArrayList<Cita> listaCitas){
        HashSet<Cita> getHashSet = new HashSet<Cita>();
        for(Cita c: listaCitas){
        getHashSet.add(c);
        }
        return getHashSet;
    }

}
