package sonnyboy.exercise.SpringBootExercise.exception;

public class CustomerOrderNotFoundException extends Exception {
    public CustomerOrderNotFoundException() {
        super();
    }

    public CustomerOrderNotFoundException(String message) {
        super(message);
    }

    public CustomerOrderNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}
