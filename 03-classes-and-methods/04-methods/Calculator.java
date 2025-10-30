public class Calculator {

    // Перегрузка метода add()
    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) { //другой тип аргументов
        return a + b;
    }

    public int add(int a, int b, int c) {  //другое количество аргументов
        return a + b + c;
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.println(calc.add(2, 3));  //вызывает add(int, int)
        System.out.println(calc.add(2.5, 3.7)); //вызывает add(double, double)
        System.out.println(calc.add(1, 2, 3)); //вызывает add(int, int, int)
    }
}
