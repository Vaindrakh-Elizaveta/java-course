public class NullPointerExample {
    public static void main(String[] args) {
        try {
            String text = null;
            int len = text.length(); // Попытка вызвать метод у null
        } catch (NullPointerException e) {
            System.out.println("NullPointerException caught: " + e.getMessage());
        }
    }
}

