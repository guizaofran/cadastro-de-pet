package exceptions;

public class MenuOptionException extends RuntimeException{
    public MenuOptionException (String message){
        super(message);
    }
}
