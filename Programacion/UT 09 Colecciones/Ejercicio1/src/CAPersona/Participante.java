package CAPersona;

import java.util.ArrayList;
import Excepciones.*;
import Gastos_Ingresos.Transaccion;
import Transacciones.*;

public class Participante extends Persona{
    private ArrayList<Transaccion> transacciones;

    private double saldo;

    public Participante(String nombre, double saldo) throws ImporteNoValidoException{
        super(nombre);

        if(saldo <0){
            throw new ImporteNoValidoException(nombre);
        }
        this.saldo = saldo;
    }

    public Transaccion agregarTransaccion(int opcion, Double montoTransaccion, String descripcion){
        switch (opcion) {
            case 1:
                Gasto gasto = new Gasto(double montoTransaccion, String descripcion);
                break;
        
            default:
                break;
        }
        return null;
    }
    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    
}
