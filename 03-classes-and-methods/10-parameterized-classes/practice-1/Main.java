import java.util.*;

/**
 * Примеры корректного использования instanceof с параметризованными классами.
 * из-за стирания типов НЕЛЬЗЯ писать `obj instanceof List<String>`.
 * Проверяем только сам обобщённый тип (без параметров),
 * а тип элементов — дополнительной логикой или через type token.
 */
public class Main {

    // Пример "type token" для сохранения информации о T в рантайме
    static final class Box<T> {
        private final Class<T> type;
        private T value;

        Box(Class<T> type) { this.type = type; }

        void set(T value) { this.value = value; }
        T get() { return value; }

        boolean holdsInstance(Object o) {
            return type.isInstance(o);
        }
    }

    public static void main(String[] args) {
        // 1)instanceof с коллекцией: проверяем ТОЛЬКО факт, что это List
        Object obj = new ArrayList<Integer>(List.of(1, 2, 3));
        if (obj instanceof List<?>) {    //OK
            System.out.println("obj — это какой-то List<?>");
        }

        // нельзя: (obj instanceof List<String>) — compile error из-за стирания типов

        // 2)Проверка типа элементов коллекции дополнительной логикой
        if (obj instanceof List<?> list) {
            boolean allInts = true;
            for (Object e : list) {
                if (!(e instanceof Integer)) {
                    allInts = false;
                    break;
                }
            }
            System.out.println("все элементы списка Integer: " + allInts);
        }

        // 3)instanceof с Map
        Object omap = Map.of("a", 1, "b", 2);
        if (omap instanceof Map<?, ?>) { // OK
            System.out.println("omap — это Map<?,?>");
        }

        // 4)Type token: сохраняем Class<T>, чтобы проверять элемент T в рантайме
        Box<Integer> intBox = new Box<>(Integer.class);
        Box<String>  strBox = new Box<>(String.class);

        intBox.set(123);
        strBox.set("hello");

        System.out.println("intBox.holdsInstance(42): " + intBox.holdsInstance(42));         // true
        System.out.println("intBox.holdsInstance(\"42\"): " + intBox.holdsInstance("42"));   // false
        System.out.println("strBox.holdsInstance(\"x\"): " + strBox.holdsInstance("x"));     // true

        // 5)instanceof для собственного generic-класса без указания параметра
        Object b = intBox;
        if (b instanceof Box<?>) { //OK: проверяем «это Box какого-то T»
            System.out.println("b — это Box<?>");
        }
    }
}
