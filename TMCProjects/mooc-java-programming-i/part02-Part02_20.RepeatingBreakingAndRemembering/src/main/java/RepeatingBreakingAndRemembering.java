
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {

        // This exercise is worth five exercise points, and it is 
        // gradually extended part by part.

        // If you want, you can send this exercise to the server
        // when it's just partially done. In that case the server will complain about 
        // the parts you haven't done, but you'll get points for the finished parts.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Give numbers:");
        int uI = scanner.nextInt();
        int total = 0;
        int num = 0;
        int even = 0;
        int odd = 0;
        double average = 0;

        while (uI != -1) {
            total += uI;
            num++;
            if(uI % 2 == 0){
                even++;
            } else {
                odd++;
            }
            uI = scanner.nextInt();
        }
        average = (double) total / num;
        System.out.println("Thx! Bye!");
        System.out.println("Sum: " + total);
        System.out.println("Numbers: " + num);
        System.out.println("Average: " + average);
        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);
    }
}