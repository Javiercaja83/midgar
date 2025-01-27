import java.time.LocalDate;

public class Jugador {
    private String nombre;
    private LocalDate fechanacimiento;
    private float altura;
    private int dorsal;
    public Posicion posicion;
    public Jugador (String nombre, LocalDate fechanacimiento, float altura, int dorsal, Posicion posicion ){
    this.nombre = nombre;
    this.fechanacimiento = fechanacimiento;
    this.altura = altura;
    this.dorsal = dorsal;
    this.posicion =  posicion;
    }
    
    @Override
    
    public String toString() {
        return "Jugador " +
                "nombre = '" + nombre + '\'' +
                ", fechanacimiento = " + fechanacimiento +
                ", altura = " + altura +
                ", dorsal = " + dorsal +
                ", posicion = " + posicion  // Aquí      corresponda o una variable si es necesario
                ;
    }
    

}
