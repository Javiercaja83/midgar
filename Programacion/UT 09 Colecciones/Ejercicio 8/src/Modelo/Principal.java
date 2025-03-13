package Modelo;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
import Modelo.*;

public class Principal {
    public static void main(String[] args) {
     
    Set<Libro> LibrosHashSet = new HashSet<>(DAOlibros.getLibros());
    Set<Libro> librosTreeSet = new TreeSet<>();
    librosTreeSet.addAll(LibrosHashSet);   
    }
}
