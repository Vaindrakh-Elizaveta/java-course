import java.util.StringJoiner;

public class Example2 {
    public static void main(String[] args) {

        StringJoiner joiner = new StringJoiner(", ", "[", "]");

        joiner.add("Tom");
        joiner.add("Bob");
        joiner.add("Alice");

        System.out.println(joiner);
        // Результат: [Tom, Bob, Alice]
    }
}

