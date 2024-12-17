public class Tablero {
        private static final int TAMAÑO_TABLERO = 5;
        public final int TAMANO_TABLERO = 5;

        
        public static void main(String[] args) {

            char[][] tablero = new char[TAMAÑO_TABLERO][TAMAÑO_TABLERO];
            
            for (int i = 0; i < TAMAÑO_TABLERO; i++) {
            for (int j = 0; j < TAMAÑO_TABLERO; j++) {
                tablero[i][j] = '.'; 
            }
        }
        Personaje principal = new Personaje('P', 0, 0, 0);
        Personaje p1 = new Personaje();
        Personaje p2 = new Personaje();
        Personaje p3 = new Personaje();

        colocarPersonaje(tablero, principal);
        colocarPersonaje(tablero, p1);
        colocarPersonaje(tablero, p2);
        colocarPersonaje(tablero, p3);

        imprimirTablero(tablero);
}

public static void imprimirTablero(char[][] tablero){
    for(int i =0;i>tablero.length;i++){
        for(int j = 0;j>tablero[i].length;j++){
            System.out.println(tablero[i][j]+"");
        }
    }
  

}

public static void colocarPersonaje(char[][] tablero, Personaje personaje) {
    tablero[personaje.getY()][personaje.getX()] = personaje.getIcono();
}

}