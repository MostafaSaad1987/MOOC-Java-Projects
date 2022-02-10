
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int smallestAge = -999999999;
        int y = 0;

        do {
            String input = scanner.nextLine();
            String[] arr = input.split(",");

            for (int i = 0; i < arr.length - 1; i++){
                if(smallestAge < Integer.valueOf(arr[1])){
                    smallestAge = Integer.valueOf(arr[1]);
                }
            }
            if(input.equals("")){
                break;
            }
        } while (true);

        System.out.println("Age of the oldest: " + smallestAge);

    }
}
