public class ExceptionPractice {
    public static void main(String[] args) {

        // --- 1. Исключение, которое будет перехвачено ---
        try {
            int a = 10 / 0; // Деление на ноль
        } catch (ArithmeticException e) {
            System.out.println("Перехвачено ArithmeticException: " + e.getMessage());
        }

        System.out.println("После первого исключения программа ещё работает.");


        // --- 2. Исключение, которое НЕ будет перехвачено ---
        String text = null;
        System.out.println(text.length()); // <-- NullPointerException, аварийное завершение
    }
}

