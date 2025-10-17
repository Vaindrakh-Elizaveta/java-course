void main(){
    //арифметические операторы
    int a = 10, b = 3;
    System.out.println("a + b = " + (a + b)); // сложение
    System.out.println("a - b = " + (a - b)); // вычитание
    System.out.println("a * b = " + (a * b)); // умножение
    System.out.println("a / b = " + (a / b)); // деление (целочисленное)
    System.out.println("a % b = " + (a % b)); // остаток

    //присваивание и составные операторы
    int c = 5;
    c += 2;  // эквивалентно c = c + 2
    System.out.println("c после c += 2: " + c);

    //инкремент и декремент
    int x = 5;
    System.out.println("Постфиксный x++: " + (x++)); // сначала вывод, потом +1
    System.out.println("Теперь x = " + x);
    System.out.println("Префиксный ++x: " + (++x)); // сначала +1, потом вывод

    //сравнение
    System.out.println("a == b: " + (a == b));
    System.out.println("a != b: " + (a != b));
    System.out.println("a > b: " + (a > b));
    System.out.println("a < b: " + (a < b));
    System.out.println("a >= b: " + (a >= b));
    System.out.println("a <= b: " + (a <= b));

    //логические операторы
    boolean p = true, q = false;
    System.out.println("p && q = " + (p && q)); // И
    System.out.println("p || q = " + (p || q)); // ИЛИ
    System.out.println("!p = " + (!p));         // НЕ

    //побитовые операторы
    int m = 5, n = 3; // 0101 и 0011
    System.out.println("m & n = " + (m & n));   // побитовое И
    System.out.println("m | n = " + (m | n));   // побитовое ИЛИ
    System.out.println("m ^ n = " + (m ^ n));   // XOR
    System.out.println("~m = " + (~m));         // побитовое отрицание
    System.out.println("m << 1 = " + (m << 1)); // сдвиг влево
    System.out.println("m >> 1 = " + (m >> 1)); // сдвиг вправо
    System.out.println("-8 >>> 1 = " + (-8 >>> 1)); //беззнаковый сдвиг вправо

    //тернарный оператор
    int max = (a > b) ? a : b;
    System.out.println("max = " + max);

    //конкатенация строк
    String name = "Лиза";
    System.out.println("Привет, " + name + "!"); // оператор + для String

    //комбинированный пример
    int result = (a + b) * 2 - 5;
    System.out.println("Результат выражения (a + b) * 2 - 5 = " + result);
}