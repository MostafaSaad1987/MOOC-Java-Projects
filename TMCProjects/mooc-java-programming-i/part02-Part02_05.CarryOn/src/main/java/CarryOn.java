
import java.util.Scanner;

public class CarryOn {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inp;
        do {
            System.out.println("Shall we carry on?");
            inp = scanner.nextLine();
        } while (!(inp.equals("no")));
    }
}
