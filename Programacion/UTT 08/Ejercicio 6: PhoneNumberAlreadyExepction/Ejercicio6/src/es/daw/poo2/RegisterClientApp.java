import java.util.ArrayList;

public class RegisterClientApp {
    public static void main(String[] args)  {
        PhoneNumberRegisterService phoneNumber = new PhoneNumberRegisterService();
        

        try{
        phoneNumber.validatePhone("+34 222 222 222");
        }catch (PhoneNumberAlreadyExistExection e){
        System.out.println(e.getMessage());
        }
        try {
            phoneNumber.validatePhone("+34 111 111 113");
        } catch (PhoneNumberAlreadyExistExection ex) {
            System.out.println(ex.getMessage());
        }
        String[] numeros = {"+34 222 222 222", "+34 111 111 113"};
        /*   for(String s: numeros){
            try{
                numeros.contains(s);
            }catch (PhoneNumberAlreadyExistExection exc){
                System.out.println(exc.getMessage());
            }
        }
        */

        
        ArrayList<String> lista =(ArrayList<String>) phoneNumber.consultarLista();

        }
    
}