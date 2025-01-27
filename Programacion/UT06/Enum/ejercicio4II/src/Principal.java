import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.Scanner;

public class Principal {
   public static ToDoList td = new ToDoList();
   public static Tarea[] tareas = td.getTareas();

public static void main(String[] args) {
    mostrarMenu();
}
    public static void mostrarMenu(){
        int opcion = 0;
        int indice_Tarea;
        Scanner sc = new Scanner(System.in);
        do{
        System.out.println("             MENU             ");
        System.out.println("******************************");
        System.out.println("1. Añadir tarea ");
        System.out.println("2. Modificar tarea");
        System.out.println("3. Listar tareas por fecha");
        System.out.println("4. Salir");
        opcion=Integer.parseInt(sc.nextLine());

        switch (opcion) {
            case 1:
            AniadirTareas();
            System.out.println("Tarea creada");
                break;
            
            case 2:
            indice_Tarea = Integer.parseInt(sc.nextLine());
            ModificarTarea(tareas, indice_Tarea, sc, null, null, null, null, null);
            break;    
            case 3:
                MostrarTareas();
            break;

            case 4:
            System.out.println("Saliendo del menu");
            opcion = 0;
                break;
            }
        }while(opcion!=0);
        }
        public static void AniadirTareas(){
            String nombre, categoria, estado, anio, mes,dia, horas,minutos;
            LocalDate fecha; 
            LocalTime hora; 
            ToDoList td =new ToDoList();
            Scanner sc  = new Scanner(System.in);
            System.out.println("Título");
            nombre = sc.nextLine();
            System.out.println("Categoría (TRABAJO, ESTUDIO, PERSONAL, OTRO)");
            categoria = sc.nextLine();
            System.out.println("Estado (PENDIENTE, EN_PROGRESO, COMPLETADA, CANCELADA)");
            estado = sc.nextLine();
            System.out.println("Fecha - Año");
            anio = sc.nextLine();
            System.out.println("Fecha - Mes");
            mes = sc.nextLine();
            System.out.println("Fecha - Día");
            dia = sc.nextLine();
            System.out.println("Hora - HH");
            horas = sc.nextLine();
            System.out.println("Hora: Minutos ");
            minutos = sc.nextLine();
            fecha = LocalDate.of(Integer.parseInt(anio), 
            Integer.parseInt(mes), Integer.parseInt(dia)); 
            hora = LocalTime.of(Integer.parseInt(horas), 
            Integer.parseInt(minutos));
            Tarea tarea = new Tarea(nombre,Categoria.valueOf(categoria),
            Estado.valueOf(estado), fecha,hora);
            td.aniadirTarea(tarea); 
        }

        public static void ModificarTarea(Tarea[] tareas, int indice_Tarea, Scanner sc,  String titulo, Categoria categoria,Estado estado,LocalDate fecha, LocalTime hora) {
            System.out.println("Indique el numero del indice a modificar");
            indice_Tarea = Integer.parseInt(sc.nextLine());
            if (indice_Tarea >= 0 && indice_Tarea < tareas.length) {
               AniadirTareas();
                System.out.println("Tarea en el índice " + indice_Tarea + " ha sido modificada.");
            } else {
                // Si el índice no es válido, avisar al usuario
                System.out.println("Índice de tarea inválido.");
            }
        }
        public static void MostrarTareas(){
            String anio, mes,dia, horas,minutos;
            LocalDate fecha; 
            Scanner sc  =new Scanner(System.in);

            System.out.println("Indique una fecha");
            System.out.println("Fecha - Año");
            anio = sc.nextLine();
            System.out.println("Fecha - Mes");
            mes = sc.nextLine();
            System.out.println("Fecha - Día");
            dia = sc.nextLine();
            System.out.println("Hora - HH");
            fecha = LocalDate.of(Integer.parseInt(anio), 
            Integer.parseInt(mes), Integer.parseInt(dia)); 
            for(int i =0; i < tareas.length; i++){
                if(tareas[i].getFecha().equals(fecha)){
                    System.out.println(tareas[i].toString());
                }else{
                    System.out.println("No se han encontrado tarea en la fecha indicada");
                }
                
            }
        }
    }




/*Implementar un menú interactivo en la consola con las siguientes opciones:

Añadir tarea: Solicitar al usuario los datos de la tarea y añadirla a la lista.

Modificar tarea: Solicitar el índice de la tarea a modificar y los nuevos datos.

    Listar tareas por fecha: Solicitar una fecha y mostrar las tareas correspondientes.

Salir: Finaliza el programa.

Restricciones adicionales

La lista de tareas debe tener un tamaño fijo de 10.

Manejar excepciones para entradas inválidas (por ejemplo, índices fuera de rango o conflictos de fecha y hora).

Mostrar mensajes claros al usuario cuando las operaciones no puedan realizarse (como lista llena o conflictos al añadir/modificar). */