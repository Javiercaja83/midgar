
public class App {

    public static void main(String[] args) {
        try {
            nullPointerLanza();
        } catch (ArithmeticException e) {
            System.out.println("Null pointer exteption"); 
        }
        System.out.println("Fin del programa");
        }
    

    private static void dividirPorCero() {
        try {
            int a = 10;
            int b = 0;
            int c = a / b;
            System.out.println(c);
        } catch (ArithmeticException e) {
            System.out.println("Error");
        }
    }

    private static void nullPointerLanza() throws NullPointerException{
        try {
        String a = null;
        //null value
        System.out.println(a.charAt(0));
    } catch (Exception e) {
        System.out.println("NullPointerException..");
    }
}

}
