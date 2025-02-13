
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class App {

    public static void main(String[] args) {
        try {
            nullPointerLanza();
        } catch (ArithmeticException e) {
            System.out.println("Null pointer exteption"); 
        }
        System.out.println("Fin del programa");
        try {
        leerArchivo("nombrearchivo.txt");
        } catch (Exception e) {
        System.out.println("Error");
        }
    }
    

    private static void dividirPorCero() throws ArithmeticException {
        try {
            int a = 10;
            int b = 0;
            int c = a / b;
            System.out.println(c);
        } catch (ArithmeticException e) {
            System.out.println("Error");
        }
    }

    private static void nullPointerLanza() throws NullPointerException{
        try {
        String a = null;
        //null value
        System.out.println(a.charAt(0));
    } catch (Exception e) {
        System.out.println("NullPointerException..");
    }
}
    public static void leerArchivo(String nombreArchivo) throws IOException{
        try {
            BufferedReader br = new BufferedReader(new FileReader(nombreArchivo));
            String linea;
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }  
            br.close();
        } catch (FileNotFoundException e) {
            nombreArchivo = "rutaDefecto";
        }
    }
}