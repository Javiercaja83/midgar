package model;

import java.util.Collection;
import java.util.Iterator;
import java.util.TreeSet;

public class Agenda {
    
    private TreeSet<Cita> citas;

    public Agenda() {
        citas = new TreeSet<>();
    }

    public void agregarCitas(Collection<Cita> nuevasCitas){
        citas.addAll(nuevasCitas);
    }

    public void listarCitas(){
        for(Cita c: citas){
            System.out.println(c);
        }
    }

    public TreeSet<Cita> devolverCitas(){
        return citas;
    }

    public void eliminarCitas(String categoria){
        Iterator<Cita> iterator = citas.iterator();
        while (iterator.hasNext()) {
            Cita c = iterator.next();
            if (c.getCategoria().equals(categoria)) {
                iterator.remove();
            }
        }
        
        }
        
    public String getCategoria(Collection<Cita> nuevasCitas){
            String categoria;
            for (Cita cita : nuevasCitas) {
               categoria = cita.getCategoria();
               return categoria;
            }
            return "";
        }
    public String getCategoria(){
            if (!citas.isEmpty()) {
                return citas.first().getCategoria(); // Asumiendo que citas es un TreeSet ordenado
            }
            return "";
        }
    }
    

    
