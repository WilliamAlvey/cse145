//William Alvey

public class TimeException extends Exception {
    private static final long serialVersionUID = 1L; 

    // Default constructor
    public TimeException() {
        super("EXCEPTION: Invalid time entered");
    }

    // Parameterized constructor
    public TimeException(String message) {
        super(message);
    }
}
