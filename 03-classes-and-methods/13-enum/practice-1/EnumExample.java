//Класс с примером использования перечисления
public class EnumExample {
    //Перечисление с инициализацией значений
    public enum Day {
        MONDAY("Начало недели", false),
        TUESDAY("Рабочий день", false),
        WEDNESDAY("Рабочий день", false),
        THURSDAY("Рабочий день", false),
        FRIDAY("Пятница!", false),
        SATURDAY("Выходной!", true),
        SUNDAY("Выходной!", true);

        //Поля каждого элемента перечисления
        private final String description;
        private final boolean isWeekend;

        //Конструктор
        Day(String description, boolean isWeekend) {
            this.description = description;
            this.isWeekend = isWeekend;
        }

        //Геттеры
        public String getDescription() {
            return description;
        }

        public boolean isWeekend() {
            return isWeekend;
        }
    }

    public static void main(String[] args) {
        for (Day day : Day.values()) {
            System.out.println(day + ": " + day.getDescription() +
                    (day.isWeekend() ? " (выходной)" : " (рабочий день)"));
        }

        //Пример отдельного использования
        Day today = Day.FRIDAY;
        System.out.println("\nСегодня: " + today.getDescription());
    }
}
