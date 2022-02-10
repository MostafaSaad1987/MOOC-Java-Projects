
import java.util.Scanner;

public class FirstWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        do {
            String inter = scanner.nextLine();
            String[] ass = inter.split(" ");
            System.out.println(ass[0]);
            if(inter.equals("")){
                break;
            }
        } while (true);

    }
}
