public class SwitchExamples {
    public static void main(String[] args) {
        // Пример 1 — int
        int value = 2;
        switch (value) {
            case 1:
                System.out.println("int: Один");
                break;
            case 2:
                System.out.println("int: Два");
                break;
            default:
                System.out.println("int: Неизвестно");
                break;
        }

        // Пример 2 — char
        char ch = 'A';
        switch (ch) {
            case 'A':
                System.out.println("char: Буква A");
                break;
            case 'B':
                System.out.println("char: Буква B");
                break;
            default:
                System.out.println("char: Другая буква");
                break;
        }

        // Пример 3 — String
        String color = "red";
        switch (color) {
            case "red":
                System.out.println("String: Красный");
                break;
            case "blue":
                System.out.println("String: Синий");
                break;
            default:
                System.out.println("String: Другой цвет");
                break;
        }

        // Пример 4 — enum
        Day today = Day.TUE;
        switch (today) {
            case MON:
                System.out.println("enum: Понедельник");
                break;
            case TUE:
                System.out.println("enum: Вторник");
                break;
            case WED:
                System.out.println("enum: Среда");
                break;
            default:
                System.out.println("enum: Другое");
                break;
        }

        // Пример 5 — Обёртка Integer
        Integer num = 3; // Автораспаковка в int происходит автоматически
        switch (num) {
            case 1:
                System.out.println("Integer: Один");
                break;
            case 2:
                System.out.println("Integer: Два");
                break;
            case 3:
                System.out.println("Integer: Три");
                break;
            default:
                System.out.println("Integer: Неизвестно");
                break;
        }
    }

    // перечисление для примера с enum
    enum Day { MON, TUE, WED }
}
