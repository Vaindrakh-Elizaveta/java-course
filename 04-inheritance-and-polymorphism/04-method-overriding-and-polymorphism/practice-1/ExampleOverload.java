class ExampleOverload {

    public void print(int a) {
        System.out.println("int = " + a);
    }

    public void print(String s) {
        System.out.println("string = " + s);
    }

    public void print(int a, int b) {
        System.out.println("sum = " + (a + b));
    }

    public static void main(String[] args) {
        ExampleOverload e = new ExampleOverload();

        e.print(10);         //вызов print(int)
        e.print("Hello");    //вызов print(String)
        e.print(5, 7);       //вызов print(int,int)
    }
}
