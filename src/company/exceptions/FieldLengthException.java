package company.exceptions;

public class FieldLengthException extends Exception {

    private static final String DEFAULT_MESSAGE = "Перевищена максимальна кількість символів";

    public FieldLengthException() {
        super(DEFAULT_MESSAGE);
    }

    public FieldLengthException(String message) {
        super(message);
    }
}
