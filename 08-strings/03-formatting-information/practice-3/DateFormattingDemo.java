import java.util.Date;

public class DateFormattingDemo {
    public static void main(String[] args) {
        Date now = new Date();

        System.out.printf("Час (24-формат): %tH%n", now);
        System.out.printf("Минуты: %tM%n", now);
        System.out.printf("Секунды: %tS%n", now);
        System.out.printf("Год (4 цифры): %tY%n", now);
        System.out.printf("Название месяца: %tB%n", now);
        System.out.printf("Название дня недели: %tA%n", now);
    }
}
