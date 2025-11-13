public class FormatterDemo {
    public static void main(String[] args) {

        boolean flag = true;
        char ch = 'A';
        int number = 42;
        double pi = 3.1415926535;
        String name = "Елизавета";

        // %b — логическое значение
        System.out.printf("Логическое значение: %b%n", flag);

        // %c — символ
        System.out.printf("Символ: %c%n", ch);

        // %d — десятичное целое число
        System.out.printf("Целое число: %d%n", number);

        // %f — число с плавающей точкой
        System.out.printf("Число с плавающей точкой: %.3f%n", pi);

        // %s — строка
        System.out.printf("Строка: %s%n", name);

        // %% — просто знак %
        System.out.printf("Скидка: %d%%%n", 50);
    }
}

