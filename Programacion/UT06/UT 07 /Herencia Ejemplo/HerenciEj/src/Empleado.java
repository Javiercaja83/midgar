public class Empleado extends Persona{
    private int sueldo, impuestos;

    public Empleado(String nombre, String puesto, String direccion, int felefono, int nss, int sueldo, int impuestos) {
        super(nombre, puesto, direccion, felefono, nss);
        this.sueldo = sueldo;
        this.impuestos = impuestos;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    public int getImpuestos() {
        return impuestos;
    }

    public void setImpuestos(int impuestos) {
        this.impuestos = impuestos;
    }

    public int calcularPaga(){
        return  sueldo - impuestos; 
    }
}
