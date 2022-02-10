
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.print("Where to? ");
        int uI = scanner.nextInt();
        System.out.print("Where from? ");
        int limit = scanner.nextInt();

        for (int i = limit; i <= uI; i++){
            System.out.println(i);
        }
    }
}