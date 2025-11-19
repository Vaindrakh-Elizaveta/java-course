public class ArithmeticExample {
    public static void main(String[] args) {
        try {
            int a = 10 / 0; // Деление на ноль
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught: " + e.getMessage()); //ArithmeticException caught: / by zero
        }
    }
}

