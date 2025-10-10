/**
 * Демонстрация генерации JavaDoc: класс выводит приветствие в консоль.
 * @author Елизавета
 * @version 1.0
 */

public class Main {
    /**
     * Печатает приветствие в консоль
     * @param name имя пользователя
     * @return строку с приветствием
     */
    public static String sayHello(String name){
    return "Привет, " + name + "!";
}

    /**
     *
     * @param args аргументы командной строки
     */
    public static void main(String[] args) {
    System.out.println(sayHello("Лиза"));
}
}
