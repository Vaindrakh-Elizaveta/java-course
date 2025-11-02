public class Person {
    private String name;
    private int age;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object obj){
        //1)проверка сравнения с самим собой
        if (this == obj) return true;

        //2)проверка null и совпадения классов
        if (obj == null || this.getClass() != obj.getClass()) return false;

        //3)приведение типа
        Person other = (Person) obj;

        //4)сравнение значимых полей
        return this.age == other.age &&
                this.name.equals(other.name);
    }
}
