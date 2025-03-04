package Transacciones;

public class Ingreso implements Transaccion {
    private double importeIngreso;
    private String descripcion;

    public Ingreso(double importeIngreso, String descripcion) {
        this.importeIngreso = importeIngreso;
        this.descripcion = descripcion;
    }

    @Override
    public double Monto() {
        return importeIngreso; // Es positivo porque es un ingreso
    }

    public String getDescripcion() {
        return descripcion;
    }

    public double getImporteIngreso() {
        return importeIngreso;
    }
}
