public class ClassCastExample {
    public static void main(String[] args) {
        try {
            Object x = "Hello";
            Integer y = (Integer) x; // Нельзя преобразовать String → Integer
        } catch (ClassCastException e) {
            System.out.println("ClassCastException caught: " + e.getMessage());
        }
    }
}
