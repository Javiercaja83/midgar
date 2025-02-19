
import java.time.LocalDate;

public class Client {

    private String codigo, nombre, numeroTelefono;
    private LocalDate fechaRegistro;

    public Client(String codigo, String nombre, String numeroTelefono, LocalDate fechaRegistro) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.numeroTelefono = numeroTelefono;
        this.fechaRegistro = fechaRegistro;
    }
    
    public Client(String codigo, String nombre, LocalDate fechaRegistro) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.numeroTelefono = "WHITOUT_PHONE";
        this.fechaRegistro = fechaRegistro;
    }
    
    public void setnumeroTelefono(String numeroTelefono){
        this.numeroTelefono = numeroTelefono;
    }
    
}
