package otherpackage;
import mypackage.Person;

public class Child extends Person {
    public void show() {
        // System.out.println(name);   // Ошибка — private
        // System.out.println(city);   // Ошибка — нет доступа (другой пакет)
        System.out.println(age);       // можно — protected через наследование
        System.out.println(country);   // можно — public
    }

    public static void main(String[] args) {
        Child c = new Child();
        c.show();
    }
}
