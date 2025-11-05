public interface MyInterface {

    // вложенный static class ВНУТРИ интерфейса
    public static class Helper {
        public static void showMessage() {
            System.out.println("Привет! Это метод вложенного класса в интерфейсе.");
        }
    }

    void doSomething();
}

