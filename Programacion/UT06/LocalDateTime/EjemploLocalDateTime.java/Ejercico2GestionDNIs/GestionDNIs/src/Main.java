import java.util.Scanner;

import javax.annotation.processing.SupportedOptions;

public class Main {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int numero;
        char letra;
        DNI dni1, dni2;
        numero = pedirNumero();
        letra = pedirLetra();
        dni1 = new DNI(numero, letra);
        borrarDni(dni1);
        System.out.println(dni1.MostrarDNI());
            
        
        
    }

    public static void borrarDni(DNI dni){
        dni.setNumero(0);
    }

    public static int pedirNumero() {

        int numero = -1;

        System.out.println("Buenas, indique el número del primer DNI:");
        try {
            numero = Integer.parseInt(sc.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Formato de número incorrecto");
        }
        return numero;  
        
        }

    public static char pedirLetra() {
        
        char letra=' ';

        try {
            letra = Character.toUpperCase(sc.nextLine().trim().charAt(0));
        } catch (Exception e) {
            System.out.println("Formato de letra no válido");
        }
        
        return letra;
    }
    }

