import java.io.FileInputStream;
import java.io.IOException;

public class ReadExample {
    public static void main(String[] args) {
        // Указываем путь к файлу
        String fileName = "src/example.txt";

        try (FileInputStream fis = new FileInputStream(fileName)) {
            int byteData;
            System.out.println("Чтение файла побайтно:");

            // read() возвращает число от 0 до 255, либо -1 при окончании файла
            while ((byteData = fis.read()) != -1) {
                System.out.println("Байт: " + byteData + " | символ: " + (char) byteData);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

