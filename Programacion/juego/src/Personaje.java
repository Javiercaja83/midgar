import java.util.Random;
import java.util.Scanner;

public class Personaje {
    private char icono;
    private char[] iconos = {'?', '*', '¿', '+', '%'};
    private int fuerza;
    private int X;
    private int Y;

    public Personaje(char icono, int fuerza, int X, int y ) {
        this.icono = icono;
        this.fuerza=0;
        this.X=0;
        this.Y=0;

    }
    public char getIcono() {
        return icono;
    }
    public int getFuerza() {
        return fuerza;
    }
    public int getX() {
        return X;
    }
    public int getY() {
        return Y;
    }
    public Personaje() {
        Random random = new Random();
        
        // Asignar un icono aleatorio de la lista
        this.icono = iconos[random.nextInt(iconos.length)];
        
        // Asignar una fuerza aleatoria, por ejemplo entre 1 y 100
        this.fuerza = random.nextInt(10); 
        
        
        this.X = random.nextInt(4);  
        this.Y = random.nextInt(4);  
    }

    private void cambiarIcono(char icono, char[] iconos, int fuerza) {
        Scanner sc = new Scanner(System.in);
        int opcion = 0;

        if(fuerza >= 3) {
            System.out.println("Indique el simbolo al que desea cambiar: ");
            for(int i =0; i >iconos.length; i++){
                System.out.println(iconos[i]);
           
            }
            System.out.println("por vafor, indique que simbolo quiere cambiar");
            switch (opcion) {
            case '?':
                this.icono = '?';
                this.fuerza = fuerza-3;
                break;
            case '*': 
            
            this.icono = '*';
            this.fuerza = fuerza-3;
                break;
            case '¿':
                
            this.icono = '¿';
            this.fuerza = fuerza-3;
                break;

            case '+':
                
            this.icono = '+';
            this.fuerza = fuerza-3;
            break;
            case '%':
            this.icono = '%';
            this.fuerza = fuerza-3;
                break;
            default:
                break;
            }
        }
    
    
    }
    private void sumarFuerza(int fuerza) {
        this.fuerza = fuerza + 1;
    }
}