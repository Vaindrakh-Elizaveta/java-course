public class InvalidAgeException extends Exception {

    // Конструктор без параметров
    public InvalidAgeException() {
        super();
    }

    // Конструктор только с сообщением
    public InvalidAgeException(String message) {
        super(message);
    }

    // Конструктор с сообщением и причиной
    public InvalidAgeException(String message, Throwable cause) {
        super(message, cause);
    }
}
