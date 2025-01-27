public class Consultor extends Trabajador {
    private int tarifas, horas;

    public Consultor(String nombre, String puesto, String direccion, int felefono, int nss, int tarifas, int horas) {
        super(nombre, puesto, direccion, felefono, nss);
        this.tarifas = tarifas;
        this.horas = horas;
    }

    public int getTarifas() {
        return tarifas;
    }

    public void setTarifas(int tarifas) {
        this.tarifas = tarifas;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }
    
    public int calcularPaga(){
        return horas * tarifas;
    }
}
