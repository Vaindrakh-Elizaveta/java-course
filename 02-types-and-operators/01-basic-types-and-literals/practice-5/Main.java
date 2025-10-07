void main(){
    int a = 5;
    double b = 3.5;
    double result = a + b; //int --> double
    System.out.println("Результат (int + double): " + result); //8.5

    byte x = 10;
    short y = 20;
    int sum = x + y; //оба приводятся к int
    System.out.println("Результат (byte + short): " + sum); //30

    float f = 3.5f;
    long l = 2L;
    float res = f + l; //Long --> float
    System.out.println("Результат (float + long): " + res); //5.5

    char c = 'A'; //код символа 65
    int n = 5;
    result = c + n; //оба операнда становятся int
    System.out.println("Результат (char + int): " + result); //70
}