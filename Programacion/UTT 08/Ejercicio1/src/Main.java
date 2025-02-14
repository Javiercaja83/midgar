
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<SaldoException> miListaExceptions = new ArrayList<>();
        CuentaBancaria cuenta = new CuentaBancaria(1000);
        try {
            cuenta.retirarDinero(1000);
        } catch (SaldoException e) {
            System.out.println(e.getMessage());
            System.out.println(e.getFechaExcepcion());
            miListaExceptions.add(e);
        }  
        
    }
}
