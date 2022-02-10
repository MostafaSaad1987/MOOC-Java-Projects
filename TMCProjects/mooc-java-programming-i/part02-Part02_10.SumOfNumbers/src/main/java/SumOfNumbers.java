
import java.util.Scanner;

public class SumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = 0;
        int totalNum = 0;
        while (true) {
            System.out.println("Give a number:");
            x = scanner.nextInt();
            if (x == 0) {
                break;
            } else {
                totalNum += x;
            }
        }
        System.out.println("Sum of the numbers: " + totalNum);
    }
}

