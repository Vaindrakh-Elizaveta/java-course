//Вызов из другого класса после изменения переменных
public class Test3 {
    public static void main(String[] args) {
        A.a = 10; //изменяем статическое поле
        A.b = 20;
        A.printVars(); //теперь напечатает новые значения
    }
}
