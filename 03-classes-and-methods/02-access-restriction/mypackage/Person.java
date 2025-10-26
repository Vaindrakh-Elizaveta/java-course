package mypackage;

public class Person {
    private String name = "Лиза";        // Доступен только в этом классе
    String city = "Санкт-Петербург";               // Доступен только в пределах пакета (по умолчанию)
    protected int age = 20;               // Доступен в пакете и в наследниках
    public String country = "Россия";     // Доступен отовсюду

    public void showInfo() {
        System.out.println("name = " + name);
        System.out.println("city = " + city);
        System.out.println("age = " + age);
        System.out.println("country = " + country);
    }
}
