
import java.util.Scanner;

public class AreWeThereYet {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = 0;
        do {
            System.out.println("Give a number:");
            x = scanner.nextInt();
        } while (x != 4);
    }
}
