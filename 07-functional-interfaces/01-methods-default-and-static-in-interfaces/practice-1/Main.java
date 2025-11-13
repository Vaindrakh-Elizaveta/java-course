public class Main {
    public static void main(String[] args) {

        // Способ #1 — вызов default-метода через объект класса
        LaserPrinter lp = new LaserPrinter();
        lp.printMessage();

        // Способ #2 — вызов default-метода через переменную интерфейса
        Printer p = new LaserPrinter();
        p.printMessage();

        // Способ #3 — вызов default-метода через анонимный класс
        Printer anonymous = new Printer() {}; // не переопределяем метод
        anonymous.printMessage();

        // Способ #4 — вызов статического метода интерфейса
        Printer.printInfo();
    }
}