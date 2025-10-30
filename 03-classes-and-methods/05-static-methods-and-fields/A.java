public class A {
    public static int a = 1;
    public static int b;

    public static void printVars() {
        System.out.println(a);
        System.out.println(b);
    }
    //Первый способ - вызов из самого класса A
    public static void main(String[] args) {
        printVars(); //можно без указания имени класса
    }
}
