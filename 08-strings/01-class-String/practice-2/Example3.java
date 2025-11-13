import java.util.StringJoiner;

public class Example3 {
    public static void main(String[] args) {

        StringJoiner j1 = new StringJoiner(", ");
        j1.add("Red").add("Green");

        StringJoiner j2 = new StringJoiner(", ");
        j2.add("Blue").add("Yellow");

        j1.merge(j2);

        System.out.println(j1);
        // Результат: Red, Green, Blue, Yellow
    }
}

