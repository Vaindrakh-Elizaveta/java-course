public class Outer2 {

    class Inner {
        private int x = 10;
        public int y = 20;

        private void privateMethod() {
            System.out.println("private method");
        }

        public void publicMethod() {
            System.out.println("public method");
        }
    }

    public void test() {
        Inner inner = new Inner();

        // доступ к public полю — можно
        System.out.println(inner.y);

        // доступ к public методу — можно
        inner.publicMethod();

        // доступ к private полю — нельзя (будет ошибка компиляции)
        // System.out.println(inner.x);

        // доступ к private методу — нельзя (будет ошибка)
        // inner.privateMethod();
    }
}
