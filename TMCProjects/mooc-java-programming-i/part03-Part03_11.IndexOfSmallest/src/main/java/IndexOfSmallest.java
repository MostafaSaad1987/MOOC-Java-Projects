
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // implement here a program that reads user input
        // until the user enters 9999

        // after that, the program prints the smallest number
        // and its index -- the smallest number
        // might appear multiple times

        int userInput = 0;
        int smallest = 99999999;
        int counter = 0;
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> small = new ArrayList<>();
        do {
            userInput = scanner.nextInt();
            list.add(userInput);

            if (userInput < smallest) {
                smallest = userInput;
                small.add(counter);
            }

            counter++;
        } while (userInput != 9999);

        System.out.println("Smallest number: " + smallest);
        for (int i = 0; i < small.size(); i++){
            System.out.println("Found at index: " + small.get(i));
        }

    }
}
