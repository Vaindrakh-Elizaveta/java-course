import java.util.Arrays;

public class ArraysExample {
    public static void main(String[] args) {
        int[] numbers = {5, 2, 9, 1, 7};

        // 1. toString() — преобразование массива в строку
        System.out.println("Массив: " + Arrays.toString(numbers));

        // 2. sort() — сортировка массива
        Arrays.sort(numbers);
        System.out.println("Отсортированный массив: " + Arrays.toString(numbers));

        // 3. binarySearch() — бинарный поиск элемента (работает только в отсортированном массиве!)
        int index = Arrays.binarySearch(numbers, 7);
        System.out.println("Элемент 7 найден по индексу: " + index);

        // 4. equals() — сравнение двух массивов
        int[] other = {1, 2, 5, 7, 9};
        System.out.println("Массивы равны? " + Arrays.equals(numbers, other));

        // 5. compare() — лексикографическое сравнение (Java 9+)
        int result = Arrays.compare(numbers, other);
        System.out.println("Результат compare(): " + result);
        // 0 — равны, <0 — первый меньше, >0 — первый больше
    }
}
