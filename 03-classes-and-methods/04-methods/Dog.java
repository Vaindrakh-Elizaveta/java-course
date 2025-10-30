// Дочерний класс
class Dog extends Animal {
    @Override
    public void makeSound() {    //переопределяем метод родителя
        System.out.println("Собака лает");
    }
}