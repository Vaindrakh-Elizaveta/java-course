public class StringMethodsDemo {
    public static void main(String[] args) {

        String text = "Hello World";
        String text2 = "hello world";
        String spaced = "   Java Programming   ";

        // 1. length() — длина строки
        System.out.println("1. length(): " + text.length());
        // Вывод: 11 символов

        // 2. charAt() — получить символ по индексу
        System.out.println("2. charAt(1): " + text.charAt(1));
        // Вывод: 'e'

        // 3. equals() — сравнение строк
        System.out.println("3. equals(): " + text.equals(text2));
        // Вывод: false (регистр учитывается)

        // 4. equalsIgnoreCase() — сравнение без учета регистра
        System.out.println("4. equalsIgnoreCase(): " + text.equalsIgnoreCase(text2));
        // Вывод: true

        // 5. toUpperCase() — перевод в верхний регистр
        System.out.println("5. toUpperCase(): " + text.toUpperCase());
        // Вывод: "HELLO WORLD"

        // 6. toLowerCase() — перевод в нижний регистр
        System.out.println("6. toLowerCase(): " + text.toLowerCase());

        // 7. indexOf() — найти индекс подстроки
        System.out.println("7. indexOf(\"World\"): " + text.indexOf("World"));
        // Вывод: 6

        // 8. substring() — получить подстроку
        System.out.println("8. substring(0, 5): " + text.substring(0, 5));
        // Вывод: "Hello"

        // 9. trim() — удалить пробелы в начале и конце
        System.out.println("9. trim(): \"" + spaced.trim() + "\"");
        // Вывод: "Java Programming"

        // 10. replace() — заменить символы/подстроки
        System.out.println("10. replace(\"World\", \"Java\"): " + text.replace("World", "Java"));
        // Вывод: "Hello Java"
    }
}
