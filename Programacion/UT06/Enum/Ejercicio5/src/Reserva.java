public class Reserva {


    private Vuelo vuelo; 
    private Pasajero pasajero;
    public Reserva(Vuelo vuelo, Pasajero pasajero) {
        this.vuelo = vuelo;
        this.pasajero = pasajero;
    }
    @Override
    public String toString() {
        return "Reserva - vuelo=" + vuelo.toString() + 
        ", pasajero=" + pasajero.toString() ;
    } 

    // de momento no escribimos getters y setters
    // no hemos encontado la necesidad de ponerlos 
    // asumimos que no se puede cambiar el estado del objeto

    
    
}