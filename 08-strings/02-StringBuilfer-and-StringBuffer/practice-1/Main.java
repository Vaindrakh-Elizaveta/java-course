public class Main {
    public static void main(String[] args) {

        // 1. append() – добавление текста
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World"); // -> "Hello World"

        // 2. insert() – вставка текста по индексу
        sb.insert(5, ","); // -> "Hello, World"

        // 3. delete() – удаление диапазона символов
        sb.delete(5, 6); // -> "Hello World"

        // 4. deleteCharAt() – удаление символа
        sb.deleteCharAt(5); // -> "HelloWorld"

        // 5. replace() – замена диапазона на строку
        sb.replace(5, 10, " Java"); // -> "Hello Java"

        // 6. reverse() – переворот строки
        sb.reverse(); // -> "avaJ olleH"

        // 7. capacity() – текущая вместимость буфера
        int cap = sb.capacity();

        // 8. ensureCapacity() – увеличение вместимости
        sb.ensureCapacity(100);

        // 9. length() – текущая длина строки
        int len = sb.length();

        // 10. setLength() – изменение длины
        sb.setLength(5); // обрезает до "avaJ "

        // -------------------------
        // То же самое для StringBuffer
        // -------------------------
        StringBuffer sbf = new StringBuffer("Thread");
        sbf.append(" Safe");      // append
        sbf.insert(6, "-");       // insert
        sbf.delete(0, 1);         // delete
        sbf.reverse();            // reverse
        sbf.replace(0, 3, "XXX"); // replace

        // Вывод результатов
        System.out.println("StringBuilder result: " + sb);
        System.out.println("Capacity: " + cap + ", Length: " + len);
        System.out.println("StringBuffer result: " + sbf);
    }
}
