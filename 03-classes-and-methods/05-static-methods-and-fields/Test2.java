//Третий способ - вызов через объект класса
public class Test2 {
    public static void main(String[] args) {
        A obj = new A();
        obj.printVars(); //тоже работает, но создаёт лишний объект
    }
}
