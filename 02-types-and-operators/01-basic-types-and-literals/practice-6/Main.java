void main(){
    int i = 130;
    byte b = (byte)i;
    System.out.println("int = " + i); //int = 130
    System.out.println("byte = " + b); //byte = -126 (тк byte хранит числа от -128 до 127, 130 выходит за пределы диапозона и при приведении обрезаются старшие биты)

    double d = 12.75;
    int I = (int) d;
    System.out.println("double = " + d); //double = 12.75
    System.out.println("int = " + I); // int = 12 (потеря дробной части)

    long big = 40000L;
    short small = (short) big;
    System.out.println("long = " + big); //long = 40000
    System.out.println("short = " + small); //short = -25536 (тк short хранит числа от -32768 до 32767, происходит переполнение)

    float f = 123.45f;
    byte B = (byte) f;
    System.out.println("float = " + f); //float = 123.45
    System.out.println("byte = " + B); //byte = 123 (потеря дробной части)
}