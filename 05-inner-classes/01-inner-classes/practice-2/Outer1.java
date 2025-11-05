public class Outer1 {
    private int privateField = 10;
    public int publicField = 20;

    private void privateMethod() {
        System.out.println("privateMethod()");
    }

    public void publicMethod() {
        System.out.println("publicMethod()");
    }

    class Inner {
        public void show() {

            // можно получить доступ к private:
            System.out.println(privateField);
            privateMethod();

            // можно получить доступ к public:
            System.out.println(publicField);
            publicMethod();
        }
    }
}
