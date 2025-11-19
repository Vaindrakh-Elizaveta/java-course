// создаём собственную иерархию исключений
class MyBaseException extends Exception {}
class MyMidException extends MyBaseException {}
class MySubException extends MyMidException {}

public class MultiCatchDemo {

    public static void main(String[] args) {

        System.out.println("=== 1. Пример одинаковой обработки нескольких исключений ===");
        handleSeveralExceptions();

        System.out.println("\n=== 2. Пример обработки иерархии исключений ===");
        handleHierarchyExceptions();
    }

    // 1) Несколько разных исключений обрабатываются ОДИНАКОВО
    public static void handleSeveralExceptions() {
        try {
            if (Math.random() > 0.5) {
                int x = 5 / 0; // ArithmeticException
            } else {
                Integer.parseInt("abc"); // NumberFormatException
            }

        } catch (ArithmeticException | NumberFormatException e) {
            System.out.println("Перехвачено одинаково: " + e.getClass().getSimpleName());
        }
    }

    // 2) Исключения образуют иерархию:
    // MyBaseException <- MyMidException <- MySubException
    public static void handleHierarchyExceptions() {
        try {

            double r = Math.random();
            if (r < 0.33) {
                throw new MySubException();
            } else if (r < 0.66) {
                throw new MyMidException();
            } else {
                throw new MyBaseException();
            }

        } catch (MySubException e) {
            System.out.println("Перехвачено: MySubException (самое узкое)");

        } catch (MyMidException e) {
            System.out.println("Перехвачено: MyMidException (среднее)");

        } catch (MyBaseException e) {
            System.out.println("Перехвачено: MyBaseException (самое широкое)");
        }
    }
}

