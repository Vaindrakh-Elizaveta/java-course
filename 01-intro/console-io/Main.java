import java.util.Scanner;

void main() {
    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.
    System.out.print("Введите имя: ");
    Scanner scan = new Scanner(System.in);
    String name = scan.next();
    System.out.println("Привет, " + name + "!");
    }

