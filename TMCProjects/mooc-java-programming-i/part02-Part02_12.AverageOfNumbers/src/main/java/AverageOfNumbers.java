
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double x = 0;
        double totalNum = 0;
        int tot = 0;
        double  average = 0;
        while (true) {
            System.out.println("Give a number:");
            x = scanner.nextDouble();
            if (x == 0) {
                break;
            } else {
                totalNum += x;
                tot++;
            }
        }
        if(tot == 0){
            tot = 1;
        } else {
            average = totalNum / tot;
        }

        System.out.println("Average of the numbers: " + average);
    }
}
