package HW2;

public class WrongLoginException extends RuntimeException{

    public WrongLoginException(String message) {
        super(message);
    }

    public WrongLoginException() {
    }
}
