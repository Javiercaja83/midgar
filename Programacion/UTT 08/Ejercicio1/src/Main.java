import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        ArrayList<SaldoException> miListaExceptions = new ArrayList<>();
        ArrayList<Registable> registros = new ArrayList<>();
        Persona persona = new Persona("12345678A", "Perez", "Juan");
        CuentaBancaria cuenta = new CuentaBancaria(1000, "0924942192149414219");
        registros.add(cuenta);
        registros.add(persona);
        
        try {
            cuenta.retirarDinero(1000);
        } catch (SaldoException e) {
            System.out.println(e.getMessage());
            System.out.println(e.getFechaExcepcion());
            miListaExceptions.add(e);
        } 
        
        for (Registable r : registros) {
            System.out.println(r.Reg());
        }
    }
}