
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        do {
            String inter = scanner.nextLine();
            String[] ass = inter.split(" ");
            for (String x : ass){
                if(x.contains("av"))
                System.out.println(x);
            }
            if(inter.equals("")){
                break;
            }
        } while (true);

    }
}
