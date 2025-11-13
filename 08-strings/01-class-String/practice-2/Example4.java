import java.util.StringJoiner;

public class Example4 {
    public static void main(String[] args) {

        StringJoiner numbers = new StringJoiner(" - ");

        for (int i = 1; i <= 5; i++) {
            numbers.add(String.valueOf(i));
        }

        System.out.println(numbers);
        // Результат: 1 - 2 - 3 - 4 - 5
    }
}

