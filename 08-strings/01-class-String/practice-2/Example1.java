import java.util.StringJoiner;

public class Example1 {
    public static void main(String[] args) {

        StringJoiner joiner = new StringJoiner(", ");

        joiner.add("Apple");
        joiner.add("Banana");
        joiner.add("Cherry");

        System.out.println(joiner);
        // Результат: Apple, Banana, Cherry
    }
}
