import java.util.HashMap;

public class App {
    public static void main(String[] args) throws Exception {
       HashMap<Integer, Integer> mapa = new HashMap<Integer, Integer>();
        for (int i = 0; i < 10; i++) {
            mapa.put(i, i+10); // Insertamos datos de prueba en el mapa.
        }

    for (Integer llave : mapa.keySet()) { // Recorremos el conjunto generado por keySet, contendrá las llaves.
        Integer valor = mapa.get(llave); // Para cada llave, accedemos a su valor si es necesario.
        System.out.println(llave + " - " + valor);
    }

    }
}
