
public class CuentaBancaria implements Registable{
    private int saldo;
    private String IBAN;
    public CuentaBancaria(int saldo, String IBAN) {
        this.saldo = saldo;
        this.IBAN = IBAN;
    }
    
    public int retirarDinero(int cantidad) throws SaldoException{
        
    //retirar el dinero
    int saldoRestante = saldo;
    if(saldo < saldoRestante){   
        throw new SaldoException(saldoRestante);
       }

       return saldoRestante;
    }

    public int getSaldo() {
        return saldo;
    }

    public String getIBAN() {
        return IBAN;
    }

    @Override
    public String Reg() {
        return "REG2_" + IBAN;
    }

    
    
}