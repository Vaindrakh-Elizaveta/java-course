import java.util.*;

class ExampleExtends {
    //Метод принимает список любых "чисел" - Integer, Double, Float и т.д.
    public static void printNumbers(List<? extends Number> list) {
        for (Number num : list) {
            System.out.println(num);
        }
    }

    public static void main(String[] args) {
        List<Integer> intList = List.of(1, 2, 3);
        List<Double> doubleList = List.of(1.1, 2.2, 3.3);

        printNumbers(intList);    //работает, Integer наследуется от Number
        printNumbers(doubleList); //работает, Double тоже наследуется от Number
        // printNumbers(List.of("a", "b")); //ошибка — String не Number
    }
}
