
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int smallestAge = -1;
        String name = "";

        do {
            String input = scanner.nextLine();
            String[] arr = input.split(",");
            if(input.equals("")){
                System.out.println("Name of the oldest: " + name);
                break;
            }
            if(smallestAge < Integer.valueOf(arr[1])){
                smallestAge = Integer.valueOf(arr[1]);
                name = arr[0];
            }
        } while (true);


    }
}
