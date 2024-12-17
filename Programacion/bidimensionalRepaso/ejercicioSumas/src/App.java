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
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                resultado[i] += array[i][j];
            }
        }
        return resultado;

    }
}
