package Transacciones;

public class Gasto implements Transaccion {
    private double importeGasto;
    private String detalle;

    public Gasto(double importeGasto, String detalle) throws GastoInvalidoException {
        if (importeGasto <= 0) {
            throw new GastoInvalidoException("El monto del gasto no puede ser negativo o cero: " + importeGasto);
        }
        this.importeGasto = importeGasto;
        this.detalle = detalle;
    }

    @Override
    

    public String getDetalle() {
        return detalle;
    }

    public double getImporteGasto() {
        return importeGasto;
    }
}
