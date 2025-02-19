public class PhoneNumberAlreadyExistExection extends Exception{
    public PhoneNumberAlreadyExistExection(String number){
        super("El numero de telefono " + number + "ya esta registrado");
    }

    

}
