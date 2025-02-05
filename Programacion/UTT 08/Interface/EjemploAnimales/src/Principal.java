public class Principal {
    public static void main(String[] args) {
        SonidosAnimal[] animales = new SonidosAnimal[2];

        animales[0] = new Gato("1", "1");
        animales[1] = new Perro("1", "1");
        
        for(SonidosAnimal d: animales){
            System.out.println(d.hacerSonido());
        }
    }
}
