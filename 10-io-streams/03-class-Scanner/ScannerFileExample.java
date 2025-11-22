import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerFileExample {
    public static void main(String[] args) {
        // Имя файла (лежит рядом с классом или укажи полный путь)
        String fileName = "src/example.txt";

        // try-with-resources автоматически закроет Scanner
        try (Scanner scanner = new Scanner(new File(fileName), "UTF-8")) {

            System.out.println("Содержимое файла " + fileName + ":");

            // Читаем файл построчно, пока есть строки
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);
            }

        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден: " + fileName);
            e.printStackTrace();
        }
    }
}
