
import java.util.Scanner;

public class LastWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        do {
            String inter = scanner.nextLine();
            String[] ass = inter.split(" ");
            System.out.println(ass[ass.length - 1]);
            if(inter.equals("")){
                break;
            }
        } while (true);
    }
}
