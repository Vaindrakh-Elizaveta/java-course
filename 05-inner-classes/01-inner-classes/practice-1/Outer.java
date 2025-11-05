public class Outer {

    public class PublicInner {
        public void show() {
            System.out.println("PublicInner доступен везде (где доступен внешний класс)");
        }
    }

    protected class ProtectedInner {
        public void show() {
            System.out.println("ProtectedInner доступен только в том же пакете и в наследниках");
        }
    }

    class DefaultInner { // package-private (без модификатора)
        public void show() {
            System.out.println("DefaultInner доступен ТОЛЬКО в том же пакете");
        }
    }

    private class PrivateInner {
        public void show() {
            System.out.println("PrivateInner доступен только внутри Outer");
        }
    }

    public void usePrivate() {
        // тут мы можем создать private inner
        PrivateInner pi = new PrivateInner();
        pi.show();
    }
}
