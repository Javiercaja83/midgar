import java.util.*;

public class IteratorExaple {
    public static void main(String[] args) throws Exception {
        ArrayList<String> lista = new ArrayList<>();
        lista.add("Hola");
        lista.add("Mundo");
        lista.add("Soy");
        lista.add("Javier");
        Iterator<String> iterator = lista.iterator();
        while (iterator.hasNext()) {
            String elemento = iterator.next();
            System.out.println(elemento);

            if (elemento.equals("Mundo")) {
                iterator.remove();
            }
        }
    }
}
