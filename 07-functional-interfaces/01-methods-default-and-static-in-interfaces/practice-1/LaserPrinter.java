class LaserPrinter implements Printer {

    @Override
    public void printMessage() {
        System.out.println("Переопределённый метод LaserPrinter");

        // Способ #5 — вызов default-метода интерфейса из переопределённого
        Printer.super.printMessage();
    }
}
