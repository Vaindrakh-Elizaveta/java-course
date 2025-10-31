public class VarargsOverload {
    // 1)Чисто числовой varargs
    public static void log(int... nums) {
        System.out.print("log(int...): ");
        for (int n : nums) System.out.print(n + " ");
        System.out.println();
    }

    // 2)Чисто строковый varargs
    public static void log(String... texts) {
        System.out.print("log(String...): ");
        for (String s : texts) System.out.print(s + " | ");
        System.out.println();
    }

    // 3)Сигнатура с фиксированным первым параметром + varargs
    public static void log(String title, int... nums) {
        System.out.print("log(String,int...): " + title + " -> ");
        for (int n : nums) System.out.print(n + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        log(1, 2, 3);  //попадает в log(int...)
        log("a", "b", "c"); //попадает в log(String...)
        log("numbers", 10, 20, 30); //попадает в log(String, int...)
    }
}
