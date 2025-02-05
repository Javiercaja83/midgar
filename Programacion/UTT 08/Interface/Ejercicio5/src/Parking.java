import java.util.ArrayList;

public class Parking {
    ArrayList<Vehiculo> vehiculosEstacionados = new ArrayList<>(); 

    public void agregarVehiculo(Vehiculo vehiculo){
        vehiculosEstacionados.add(vehiculo);
    }
    public void mostrarTarifas(){
        for(Vehiculo v: vehiculosEstacionados){
           System.out.println( v.calcularCostoMantenimiento());;
        }
    }
}
