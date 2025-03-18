import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;
import model.*;

public class Principal {
    public static void main(String[] args) {
        Agenda agenda = new Agenda();

        Scanner scanner = new Scanner(System.in);
        int opcion = 0;
        
        do {    
            System.out.println("******---MENU---*****");
            System.out.println("1._Cargar citas desde un calendario compartido");
            System.out.println("2._Cargar citas desde la agenda propia");
            System.out.println("3._Mostrar la agenda de citas (ORDENADAS)");
            System.out.println("4._Eliminar citas por categoria");
            System.out.println("5._Salir");        
            opcion = Integer.parseInt(scanner.nextLine());

            switch (opcion) {
                case 1:
                    agenda.agregarCitas(new DAOAgendaCompartida().cargarCitas());
                    System.out.println("=== Citas cargadas desde un calendario compartido ===");
                    break;
                case 2:
                    agenda.agregarCitas(new DAOAgendaPropia().getListaCitas());
                    System.out.println("=== Citas cargadas desde un calendario propio ===");                    
                    break;
                case 3:
                System.out.println("Citas ordenadas por fecha y hora");
                if(agenda.devolverCitas() == null){
                    System.out.println("NO HAY CITAS");
                }else{
                for(Cita c: agenda.devolverCitas()){
                    System.out.println(c);
                }}
                    break;
                case 4:
                    eliminarCategoria(agenda,scanner);
                    break;
                case 5:
                    System.out.println(" === SALIENDO...=== ");
                    break;
                
            }
        } while (opcion !=5);
        
    }
    
    public static void eliminarCategoria(Agenda agenda, Scanner scanner){
        String categoria;
        System.out.println("Indique la categoria, siendo estas 'Trabajo', 'Salud' y 'Escuela'");
        categoria = scanner.nextLine();
        agenda.eliminarCitas(categoria);
        System.out.println("=== Categoria eliminada");

    }
}
