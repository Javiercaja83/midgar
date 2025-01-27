public class DNI {

    private int numero;
    private char letra;

    public DNI(int numero, char letra) {
        this.numero = numero;
        this.letra = letra;
    }

    public boolean esValido(){
        int cantidadDigitos = String.valueOf(numero).length();
        return cantidadDigitos == 8 && letra != ' ';       
        
        
    }
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public char getLetra() {
        return letra;
    }

    public void setLetra(char letra) {
        this.letra = letra;
    }

    public String MostrarDNI() {
        return "DNI " + numero + letra; 
    }


}
