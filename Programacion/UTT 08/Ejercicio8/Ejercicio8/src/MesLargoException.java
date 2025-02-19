public class MesLargoException extends RuntimeException {
    private int anio, dia;

    public MesLargoException(int anio, int dia) {
        this.anio = anio;
        this.dia = dia;
    }

    
}
