public class Main {
    public static void main(String[] args) {
        // Пример 1: оператор break в цикле while
        int i = 0;
        while (true) { // бесконечный цикл
            System.out.println("i = " + i);
            if (i == 5) {
                System.out.println("Достигли 5 — выходим из цикла");
                break; // завершает цикл
            }
            i++;
        }

        System.out.println("-------------------------");

        // Пример 2: оператор continue в цикле for
        for (int j = 1; j <= 10; j++) {
            if (j % 2 == 0) {
                continue; // пропускаем чётные числа
            }
            System.out.println("Нечётное число: " + j);
        }
    }
}
