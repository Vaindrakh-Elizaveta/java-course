public class BooleanCreateWays {
    public static void main(String[] args) {
        // 1) Готовые константы (наиболее эффективно по памяти)
        Boolean t1 = Boolean.TRUE;
        Boolean f1 = Boolean.FALSE;

        // 2) valueOf(boolean) — вернёт те же кэшированные константы
        Boolean t2 = Boolean.valueOf(true);
        Boolean f2 = Boolean.valueOf(false);

        // 3) valueOf(String) — true только если строка equalsIgnoreCase("true"), иначе false
        Boolean t3 = Boolean.valueOf("true");   // true
        Boolean f3 = Boolean.valueOf("TrUe ");  // false (пробел ломает сравнение)
        Boolean f4 = Boolean.valueOf("yes");    // false
        Boolean f5 = Boolean.valueOf(null);     // false (НЕ бросает NPE)

        System.out.println(t1 + " " + f1 + " " + t2 + " " + f2);
        System.out.println(t3 + " " + f3 + " " + f4 + " " + f5);
    }
}
