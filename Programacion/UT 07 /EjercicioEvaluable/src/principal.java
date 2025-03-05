public class principal {
    private Sala[] salas = new Sala[2];

    public static void main(String[] args) {

    }

    public void muestraSalasDisponibles(Sala[] salas) {
        for (Sala s : salas) {
            if (s != null) {
                if (s.isDisponible()) {
                    System.out.println(s.mostrarSala());
                }
            }
        }

    }

public boolean liberarSala(String propietario, boolean disponible){
    boolean success =true;
    if(!disponible && this.propietario.equals(propietario)){
        if(disponible){
            disponible = false;
            propietario ="";
            success = true;
            return success;
        }
    }
return success;
}

}
