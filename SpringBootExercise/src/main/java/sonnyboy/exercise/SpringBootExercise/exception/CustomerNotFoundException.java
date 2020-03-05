package sonnyboy.exercise.SpringBootExercise.exception;

/**
 * Custom exception for the cases in which customers cannot be retrieved from the datasource.
 */
public class CustomerNotFoundException extends Exception{
    public CustomerNotFoundException() {
        super();
    }

    public CustomerNotFoundException(String message) {
        super(message);
    }

    public CustomerNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}
