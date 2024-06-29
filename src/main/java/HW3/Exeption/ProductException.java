package HW3.Exeption;

public class ProductException extends RuntimeException{
    public ProductException() {
    }

    public ProductException(String message) {
        super(message);
    }
}
