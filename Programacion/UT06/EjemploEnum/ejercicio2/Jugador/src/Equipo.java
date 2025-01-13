import java.time.LocalDate;

public class Equipo {
    public static void main(String[] args) {
        LocalDate fechaNacimiento = LocalDate.of(2003, 01, 10);
        Jugador JUGADOR1 = new Jugador("Javier", fechaNacimiento, 1.85f, 13, Posicion.BASE);
        Jugador JUGADOR2 = new Jugador("Lebron", fechaNacimiento, 1.90f, 10, Posicion.ALAPIVOT);
        System.out.println("Jugador 1 " + JUGADOR1);  
        System.out.println("Jugador 2 " + JUGADOR2);
    }
}
