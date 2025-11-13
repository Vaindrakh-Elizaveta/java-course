interface Printer {

    default void printMessage() {
        System.out.println("Default метод Printer");
    }

    static void printInfo() {
        System.out.println("Статический метод Printer");
    }
}