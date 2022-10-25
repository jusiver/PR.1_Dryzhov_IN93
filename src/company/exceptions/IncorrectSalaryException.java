package company.exceptions;

public class IncorrectSalaryException extends Exception {

    private static final String DEFAULT_MESSAGE = "Зарплата не може бути від'ємною";

    public IncorrectSalaryException() {
        super(DEFAULT_MESSAGE);
    }

    public IncorrectSalaryException(String message) {
        super(message);
    }
}
