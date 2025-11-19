public class ArrayIndexExample {
    public static void main(String[] args) {
        try {
            int[] arr = {1, 2, 3};
            int value = arr[5]; // Индекс вне диапазона
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught: " + e.getMessage()); //ArrayIndexOutOfBoundsException caught: Index 5 out of bounds for length 3
        }
    }
}
