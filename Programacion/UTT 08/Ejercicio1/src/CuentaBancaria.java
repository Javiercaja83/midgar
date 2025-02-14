
public class CuentaBancaria {
    private int saldo;

    public CuentaBancaria(int saldo) {
        this.saldo = saldo;
    }
    
    public int retirarDinero(int cantidad) throws SaldoException{
        
    //retirar el dinero
    int saldoRestante = saldo;
    if(saldo < saldoRestante){   
        throw new SaldoException(saldoRestante);
       }

       return saldoRestante;
    }

    
    
}