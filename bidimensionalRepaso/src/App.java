public class App {
    public static void main(String[] args)   {
        int[][] numeros =   new int[5][5];
        final int NUM1 =1;
        final int NUMN2 = 2;
        for (int i = 0; i<numeros.length; i++){
            for (int j = 0; j<numeros[i].length; j++){   
                if(i % 2 == 0){
                    numeros[i][j] = NUM1;
            }else{
                numeros[i][j] = NUMN2;
            }
            }
            mostrarArray(numeros);
        }
        System.out.println("------------------------------");
        copiarArray(numeros);
        mostrarCopia(copiarArray(numeros));
    }
     public static void mostrarArray(int [][] numeros){
        for(int i =0; i<numeros.length; i++){
            for(int j =0 ; j < numeros[i].length; j++){
                System.out.print(numeros[i][j]);
            }
            System.out.println();
        }
        }
        
        public static int[][] copiarArray(int[][] numeros) { 
        int[][] copiaArray = new int[numeros.length][numeros[0].length];

            for(int i = 0; i < numeros.length; i++) {
                for(int j = 0; j < numeros[i].length; j++) {
                    copiaArray[i][j] = numeros[i][j];

            }
        }
            
        return copiaArray;
        }
        /*
         * Metodo de Arrays que me permite copiar los elementos de los arrays, recibe la referencia del array que quiero copiar y la longitud del array
                copiaArray[i][j] = Arrays.copyOf(numeros[i][j];
         */
        public static void mostrarCopia(int[][] copiaArray) {
            for(int i = 0; i < copiaArray.length; i++) {
                for(int j = 0; j < copiaArray[i].length; j++) {
                    System.out.print(copiaArray[i][j]);
                }
                System.out.println();
            }
        }    
    }

    


