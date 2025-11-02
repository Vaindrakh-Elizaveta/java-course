public class Main {
    public static void main(String[] args) {
        Animal a = new Animal();
        Animal d = new Dog();

        System.out.println(a.sound()); //some sound
        System.out.println(d.sound()); //woof - вызов переопределённого метода
    }
}