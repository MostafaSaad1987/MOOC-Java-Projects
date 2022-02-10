
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Give a number: ");
        int uI = scanner.nextInt();
        int total = 1;

        for(int i = uI; i > 0; i--){
            total *= i;
        }
        System.out.println("Factorial: " + total);
    }
}