
import java.util.Scanner;

public class NumberAndSumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = 0;
        int totalNum = 0;
        int tot = 0;
        while (true) {
            System.out.println("Give a number:");
            x = scanner.nextInt();
            if (x == 0) {
                break;
            } else {
                totalNum += x;
                tot++;
            }
        }
        System.out.println("Number of numbers: " + tot);
        System.out.println("Sum of the numbers: " + totalNum);
    }
}
