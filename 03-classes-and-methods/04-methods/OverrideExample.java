// Тест
public class OverrideExample {
    public static void main(String[] args) {
        Animal a1 = new Animal();
        Animal a2 = new Dog();
        Animal a3 = new Cat();

        a1.makeSound();   //Животное издает звук
        a2.makeSound();   //Собака лает
        a3.makeSound();   //Кошка мяукает
    }
}