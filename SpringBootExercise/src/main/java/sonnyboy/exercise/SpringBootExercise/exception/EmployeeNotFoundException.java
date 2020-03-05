package sonnyboy.exercise.SpringBootExercise.exception;

/**
 * Custom exception for the cases in which employees cannot be retrieved from the datasource.
 */
public class EmployeeNotFoundException extends Exception{
    public EmployeeNotFoundException() {
        super();
    }

    public EmployeeNotFoundException(String message) {
        super(message);
    }

    public EmployeeNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}
