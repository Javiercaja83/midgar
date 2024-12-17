import java.util.Arrays;

public class App {
    public static void main(String[] args)   {
        int [][] arrayPrueba  = {{1,3},
                                 {5,4},
                                 {7,8}};
        

        for(int i=0;i<arrayPrueba.length;i++){
            System.out.print(Arrays.toString(sumarArray(arrayPrueba)));   
        }
    }
    public static int[] sumarArray(int[][] array){
        int [] resultado = new int [array.length];
        int filas=0;
        for (int columnas = 0; columnas < array.length; columnas++) {
            for (int fila = 0; fila < array[fila].length; fila++) {
                columnas += array[columnas][filas];
            }
        }
        return resultado;
    }
}
