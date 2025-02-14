import java.time.LocalDate;

public class SaldoException extends Exception{
    private LocalDate fechaExcepcion;

    public SaldoException(String message) {
        super(message);
        this.fechaExcepcion= LocalDate.now();

    }

    public SaldoException(int inporteRetirar) {
       
    }
    public LocalDate getFechaExcepcion() {
        return fechaExcepcion;
    }
    
}
