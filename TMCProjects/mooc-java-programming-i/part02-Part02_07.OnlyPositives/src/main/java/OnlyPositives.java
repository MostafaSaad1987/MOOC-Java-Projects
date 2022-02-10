
import java.util.Scanner;

public class OnlyPositives {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inp = 0;
        while (true) {
            System.out.println("Give a number:");
            inp = scanner.nextInt();
            if(inp == 0){
                break;
            } else if (inp < 0){
                System.out.println("Unsuitable number");
            } else {
                System.out.println(Math.pow(inp, 2));
            }
        }
    }
}
