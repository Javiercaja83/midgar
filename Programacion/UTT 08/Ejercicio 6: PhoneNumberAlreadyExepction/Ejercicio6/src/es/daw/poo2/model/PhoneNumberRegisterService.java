import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class PhoneNumberRegisterService {
     String[] phoneNumbers = {"+34 111 111 111", "+34 111 111 112", "+34 111 111 113", "+34 111 111 114"};
    //List<String> registeredPhoneNumbers = Arrays.asList("+34 111 111 111", "+34 111 111 112", "+34 111 111 113", "+34 111 111 114");
     //List<String>  registeredPhoneNumbers = new ArrayList( Arrays.asList("+34 111 111 111", "+34 111 111 112", "+34 111 111 113", "+34 111 111 114"));
     List<String> registeredPhoneNumbers =  new ArrayList((Arrays.asList(phoneNumbers)));
    //List<String> registeredPhoneNumbers = Arrays.asList(phoneNumbers);
     public void validatePhone(String phoneNumber) throws PhoneNumberAlreadyExistExection{
          if(registeredPhoneNumbers.contains(phoneNumber)){
          //como existe el numero en el metodo
               new PhoneNumberAlreadyExistExection(phoneNumber);
          }
     }
     public List<String> consultarLista(){
     return registeredPhoneNumbers;
     }
}

