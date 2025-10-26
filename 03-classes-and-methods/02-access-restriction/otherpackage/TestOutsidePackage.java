package otherpackage;
import mypackage.Person;

public class TestOutsidePackage {
    public static void main(String[] args) {
        Person p = new Person();

        // System.out.println(p.name);   // private
        // System.out.println(p.city);   // package-private, другой пакет
        // System.out.println(p.age);    // protected, но не наследник
        System.out.println(p.country);   // public — доступен везде
    }
}
