import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class AdministradorTareas {
   
    private static Scanner sc = new Scanner(System.in);
    private static Tarea[] tareas = new Tarea[20];
 
    public static void main(String[] args)  {
        int anio, mes, diaMes = 0;
        String nombre,descripcion;
        LocalDate fechaEvento;
        int opcion = 0;
        boolean salir = false;

        while(salir){
        System.out.println("--------Menu--------");
        System.out.println("1. Crear Tarea");
        System.out.println("2. Listar Tareas");
        System.out.println("3. Salir");
        opcion = Integer.parseInt(sc.nextLine());
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        switch (opcion) {
            case 1:
            //Recorrer el array, pedir los datos al usuario, crear el evento con los datos pedidos y aladirlo al array
            for(int i=0; i < tareas.length; i++) {
                
                System.out.println("Indique el nombre del evento");
                nombre = (sc.nextLine());
                System.out.println("Indique la descripcion de la tarea");
                descripcion = sc.nextLine();
                System.out.println("Ahora indique la fecha de la tarea");
                System.out.print("Año: ");
                try{
                anio = Integer.parseInt(sc.nextLine());
                }catch(Exception e){
                System.out.println("El dato introducido no es un numero ");
                }
                System.out.print("Mes: ");
                try{
                    mes = Integer.parseInt(sc.nextLine());
                }catch(Exception e){
                    System.out.println("error a la hora de asignar el mes");

                }
                System.out.print("Dia: ");
                try{
                    diaMes = Integer.parseInt(sc.nextLine());
                }catch(Exception e){
                    System.out.println("error a la hora de asignar el dia");
                }
                System.out.println("Tarea creada");

                fechaEvento = crearLocalDate(anio, mes, diaMes);
                tareas[i] = new Tarea(nombre, descripcion, fechaEvento);    
              
    
        }
        break;  

        case 2:
        System.out.println("Indique el numero de la tarea que quiere ver");

        MostrarTareas(tareas, opcion);

        }
        break;
        }   
        } // end of the block  
        
    }

    public static void MostrarTareas(Tarea[] tareas, int contador){
        for(int i = 0; i < contador; i++){
                System.out.println(tareas[i]);
        }
        
    }
    private static LocalDate crearLocalDate(int anio, int mes, int diaMes){
        return LocalDate.of(anio, mes, diaMes);
    }

/*Creamos una clase llamada Tarea, donde cada tarea tiene un nombre, una descripcion y una fecha de vencimiento (utilizando LocalDate)
        Para crear la fecha se puede utilizar el metodo:
        static LocaDate
        LocalDate.of(int Year, Month month, int dayMonth)

        Obtains an instance of LocalDate from a year, month and day
 */