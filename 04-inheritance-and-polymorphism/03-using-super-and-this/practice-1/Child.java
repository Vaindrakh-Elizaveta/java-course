class Child extends Parent {

    String name = "Child";

    Child() {
        super();                             //1)вызов конструктора суперкласса
        System.out.println("Конструктор Child");
    }

    void showNames() {
        System.out.println("name из Child: " + name);
        System.out.println("name из Parent: " + super.name);   //2)доступ к полю суперкласса
    }

    @Override
    void sayHello() {
        super.sayHello();                    //3)вызов метода суперкласса
        System.out.println("Привет из Child");
    }
}