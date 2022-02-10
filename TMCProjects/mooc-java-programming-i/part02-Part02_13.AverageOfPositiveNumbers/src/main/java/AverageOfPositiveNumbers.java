
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double x = 0;
        double totalNum = 0;
        int tot = 0;
        double  average = 0;
        while (true) {
            //System.out.println("Give a number:");
            x = scanner.nextDouble();
            if (x == 0) {
                break;
            } else if (x > 0){
                totalNum += x;
                tot++;
            }
        }
        if(tot == 0){
            System.out.println("Cannot calculate the average");
        } else {
            average = totalNum / tot;
            System.out.println(average);
        }
    }
}