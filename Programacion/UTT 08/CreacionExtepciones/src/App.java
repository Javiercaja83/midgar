
import com.sun.jdi.AbsentInformationException;

public class App {
    public static void main(String[] args) throws Exception {
        int resultado = 0;   
        try {
            resultado = devuelveValor(10);
        } catch (Exception es) {
            System.out.println("El valor no puede ser cero");
        }
        System.out.println("El resultado es: " + resultado);
        System.out.println("SIGUE EL PROGRAMA");
    
    }
    public static int devuelveValor(int valor) throws Miextepcion{
        int resultado;
        resultado = 20 / valor;
        if(resultado  == 20){
        //lanzar una excepcion propia
        //Miextepcion
        throw new Miextepcion(valor);            
        }
        return resultado;  
    }
}
