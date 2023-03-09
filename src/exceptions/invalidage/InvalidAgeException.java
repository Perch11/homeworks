package exceptions.invalidage;

public class InvalidAgeException extends Exception {
    /**
     * Constructor
     * @param message type string
     */
    public InvalidAgeException(String message){
        super(message);
    }
}
