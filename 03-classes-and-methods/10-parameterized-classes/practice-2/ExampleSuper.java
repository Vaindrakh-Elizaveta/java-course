import java.util.*;

class ExampleSuper {
    //Метод принимает список, который может содержать Integer или его родителей
    public static void addNumbers(List<? super Integer> list) {
        list.add(10);
        list.add(20);
        // list.add(2.5); //нельзя - Double не гарантированно super Integer
        System.out.println(list);
    }

    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        List<Number> numbers = new ArrayList<>();
        List<Object> objects = new ArrayList<>();

        addNumbers(integers); //Integer - подходит
        addNumbers(numbers);  //Number - родитель Integer
        addNumbers(objects);  //Object - тоже родитель
    }
}
