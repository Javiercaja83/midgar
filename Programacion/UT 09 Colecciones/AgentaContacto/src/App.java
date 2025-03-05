import java.util.HashMap;
import java.util.Scanner;

public class App {
    

    public static void main(String[] args) throws Exception {
/*consultar, crear, clave el numero y el valor el nombre */
        int opcion;
        Scanner scanner = new Scanner(System.in);
        HashMap<Integer, String> Agenda = new HashMap<Integer, String>();

        do {
        System.out.println("*_____-Menu-_____*");
        System.out.println("1.Insertar contacto");
        System.out.println("2.Consultar contacto (numero)");
        System.out.println("3.Mostrar todos");
        System.out.println("4.Salir");
        opcion = Integer.parseInt(scanner.nextLine());

        
            switch (opcion) {
            case 1:
            try {
                
            } catch (Exception e) {
                System.out.println("Valor introducido incorrecto");
            }
                InsertarContacto(Agenda, scanner);
                break;
            case 2:
                ConsultarContacto(Agenda, scanner);
                break;
            case 3:
                MostrarTodos(Agenda);
                break;
            case 4:
                break;

            }
            } while (opcion != 4);
                        
                    
        }
                
        public static void InsertarContacto( HashMap<Integer, String> Agenda, Scanner scanner) throws Exception{
                
                System.out.println("Introduzca el numero");
                Integer numero = Integer.parseInt(scanner.nextLine());
                System.out.println("Ingrese el nombre");
                String nombre = scanner.nextLine();
                try{
                Agenda.put(numero, nombre);
                }catch (Exception e) {
                    throw new Exception();
                }
         
                
        }
                
        public static void ConsultarContacto(HashMap<Integer, String> Agenda, Scanner scanner)throws Exception{
        System.out.println("Ingrese el numero");
        try {
            Integer numero = Integer.parseInt(scanner.nextLine());
            if (Agenda.containsKey(numero)) {
                System.out.println( numero + " Si existe, " + Agenda.get(numero));
    
            }
        } catch (Exception e) {
            throw new Exception();
        }
    
    }

    public static void MostrarTodos(HashMap<Integer, String> Agenda){
        for (Integer i : Agenda.keySet()) {
            String nombre = Agenda.get(i);
            System.out.println( i +  " - " + nombre);
        }
    }
    /*  for (Integer llave : mapa.keySet()) { // Recorremos el conjunto generado por keySet, contendrá las llaves.
        Integer valor = mapa.get(llave); // Para cada llave, accedemos a su valor si es necesario.
        System.out.println(llave + " - " + valor);
    } */

}
