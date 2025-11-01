class Parent {
    String name = "Parent";

    Parent() {           //конструктор суперкласса
        System.out.println("Конструктор Parent");
    }

    void sayHello() {  //метод суперкласса
        System.out.println("Привет из Parent");
    }
}