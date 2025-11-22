import java.io.FileOutputStream;
import java.io.IOException;

public class WriteExample {
    public static void main(String[] args) {

        // Имя файла, куда будем записывать данные
        String fileName = "output.txt";

        try (FileOutputStream fos = new FileOutputStream(fileName)) {

            // Записываем несколько байтов — это коды символов ASCII
            fos.write(72);  // 'H'
            fos.write(101); // 'e'
            fos.write(108); // 'l'
            fos.write(108); // 'l'
            fos.write(111); // 'o'

            System.out.println("Данные успешно записаны в " + fileName);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

