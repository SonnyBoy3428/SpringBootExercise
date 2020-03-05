package sonnyboy.exercise.SpringBootExercise.exception;

/**
 * Custom exception for the cases in which departments cannot be retrieved from the datasource.
 */
public class DepartmentNotFoundException extends Exception{
    public DepartmentNotFoundException() {
        super();
    }

    public DepartmentNotFoundException(String message) {
        super(message);
    }

    public DepartmentNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}
