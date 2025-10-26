package mypackage;

public class TestInSamePackage {
    public static void main(String[] args) {
        Person p = new Person();

        // System.out.println(p.name); // Ошибка — private
        System.out.println(p.city);     // можно — внутри одного пакета
        System.out.println(p.age);      // можно — тоже в пакете
        System.out.println(p.country);  // можно — public
    }
}
