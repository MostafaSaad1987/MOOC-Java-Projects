
import java.util.ArrayList;
import java.util.Scanner;

public class GreatestInList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int great = 0;

        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }

            if (input > great){
                great = input;
            }

            list.add(input);
        }
        
        System.out.println("The greatest number: " + great);

        // implement finding the greatest number in the list here

    }
}
