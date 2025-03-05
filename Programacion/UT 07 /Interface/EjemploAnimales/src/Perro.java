public class Perro implements SonidosAnimal {
        private String nombre;
        private String raza;

        public Perro(String nombre, String raza) {
            this.nombre = nombre;
            this.raza = raza;
        }
    
        @Override
        public String hacerSonido(){
            return "Guau";
        }
    
}
