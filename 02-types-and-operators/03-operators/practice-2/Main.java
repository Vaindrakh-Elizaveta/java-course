class Animal {}
class Dog extends Animal {}
class Cat extends Animal {}

public class Main {
    public static void main(String[] args) {
        Animal a = new Animal();
        Dog d = new Dog();
        Animal cat = new Cat();
        Animal unknown = null;

        // Проверка типов
        System.out.println("a instanceof Animal = " + (a instanceof Animal));   // true
        System.out.println("d instanceof Dog = " + (d instanceof Dog));         // true
        System.out.println("d instanceof Animal = " + (d instanceof Animal));   // true
        System.out.println("a instanceof Dog = " + (a instanceof Dog));         // false
        System.out.println("cat instanceof Cat = " + (cat instanceof Cat));     // true
        System.out.println("cat instanceof Animal = " + (cat instanceof Animal)); // true

        // Проверка null
        System.out.println("unknown instanceof Animal = " + (unknown instanceof Animal)); // false
    }
}