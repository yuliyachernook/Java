package Exceptions;

public class IncorrectMarkValueException extends Exception {
    private String message;
    private int value;

    public IncorrectMarkValueException(String message, int value){
        super(message);
        this.message = message;
        this.value = value;
    }

    @Override
    public String getMessage() {
        return message + "; incorrect value is " + value;
    }
}
