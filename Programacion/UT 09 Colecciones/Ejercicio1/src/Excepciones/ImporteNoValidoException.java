package Excepciones;

public class ImporteNoValidoException extends Exception {
    public ImporteNoValidoException(String mensaje) {
        super(mensaje);
    }
}
