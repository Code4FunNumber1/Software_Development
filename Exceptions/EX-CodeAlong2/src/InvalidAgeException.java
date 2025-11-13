public class InvalidAgeException extends RuntimeException {

    public InvalidAgeException(String message) {
        super(message);
    }

    public InvalidAgeException() {
      super("Invalid Age provided");
    }
}
