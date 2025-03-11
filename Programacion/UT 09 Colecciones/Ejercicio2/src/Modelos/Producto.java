
public class Producto implements Comparable{
    //hacer un comparable y los 3 comparator para el alto, lago y ancho, un constructor con solo el nombre y me aseguro que los valores alto, largo y ancho se instancian y truncan con los minimos y maximos
    //por defecto, el comparator es ascendente, en este caso es al reves
    private String Nombre;
    private double Alto, Ancho, Largo;
    private final MAXLARGO = 10, MAXANCHO = 10, MAXALTO = 30;
        public Producto(String Nombre){
            this.Nombre = Nombre;
        }
    
    
        public Producto(double Alto, double Largo, double Ancho){
            this.Alto = 2;
            this.Largo = 2;
            this.Ancho = 2;
        }
        public Producto(double Alto, double Largo, double Ancho, String Nombre){
            if (Alto > MAXALTO) {
                this.Alto = MAXALTO;
            } else if (Alto < 2) {
                this.Alto = 2;
            } else {
                this.Alto = Alto;
            }
        
            if (Ancho > MAXANCHO) {
                this.Ancho = MAXANCHO;
            } else if (Ancho < 2) {
                this.Ancho = 2;
            } else {
                this.Ancho = Ancho;
            }
        
            if (Largo > MAXLARGO) {
                this.Largo = MAXLARGO;
            } else if (Largo < 2) {
                this.Largo = 2;
            } else {
                this.Largo = Largo;
            }
        
            this.Nombre = Nombre;
        }
        
        @Override
        public double compareTo(Producto arg0){
            //TODO, ordenar con el orden por defecto - ascendente
            return this.compareTo(arg0."");
        }
        @Override
        public String toString() {
            return "Producto{" +
                    "Nombre='" + Nombre + '\'' +
                    ", Alto=" + Alto +
                    ", Ancho=" + Ancho +
                    ", Largo=" + Largo +
                    '}';
        }
        
        }
    
    