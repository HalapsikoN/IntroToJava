package by.epam.financer.service;

public class IncorrectDataException extends Exception {
    public static final long serialVersionUID = 1L;

    public IncorrectDataException() {
        super();
    }

    public IncorrectDataException(String message) {
        super(message);
    }

    public IncorrectDataException(Exception e) {
        super(e);
    }

    public IncorrectDataException(String message, Exception e) {
        super(message, e);
    }
}
