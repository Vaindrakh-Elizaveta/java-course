public class DecodeExamples {
    public static void main(String[] args) {
        // HEX
        System.out.println(Integer.decode("0xFF")); // 255
        System.out.println(Integer.decode("0Xff")); // 255 (регистр не важен)
        System.out.println(Integer.decode("#FF"));  // 255

        // OCT (восьмеричное — ведущий 0)
        System.out.println(Integer.decode("012"));  // 10 (т.к. 012_8 = 10_10)

        // Десятичное (без префикса)
        System.out.println(Integer.decode("42"));   // 42

        // Знаки работают с любым префиксом
        System.out.println(Integer.decode("-0x10")); // -16
        System.out.println(Integer.decode("+012"));  // 10

        // Отличие от parseInt: parseInt НЕ понимает префиксы "0x", "#", "0"
        // Integer.parseInt("0x10"); // NumberFormatException
        // Чтобы распарсить hex с parseInt, надо явно указать основание:
        System.out.println(Integer.parseInt("10", 16)); // 16

        // Есть и у других обёрток:
        System.out.println(Long.decode("0x7FFFFFFF")); // 2147483647
        System.out.println(Short.decode("010"));        // 8
        System.out.println(Byte.decode("0x7F"));        // 127

        // Ошибки:
        try {
            System.out.println(Integer.decode("0xG1")); // -> NumberFormatException
        } catch (NumberFormatException e) {
            System.out.println("Некорректная строка для decode: " + e.getMessage());
        }
    }
}
