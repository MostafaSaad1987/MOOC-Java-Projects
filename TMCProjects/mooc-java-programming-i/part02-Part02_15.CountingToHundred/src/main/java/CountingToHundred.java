
import java.util.Scanner;

public class CountingToHundred {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int uI = scanner.nextInt();

        for (int i = uI; i <= 100; i++) {
            System.out.println(i);
        }
    }
}