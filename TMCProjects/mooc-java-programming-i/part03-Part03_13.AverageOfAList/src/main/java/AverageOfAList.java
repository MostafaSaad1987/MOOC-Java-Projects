
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // implement here a program, that first reads user input
        // adding them on a list until user gives -1.
        // Then it computes the average of the numbers on the list
        // and prints it.

        ArrayList<Integer> list = new ArrayList<>();
        int userInput;
        int total = 0;
        do {
            userInput = scanner.nextInt();
            list.add(userInput);
        } while (userInput != -1);

        for (Integer integer : list) {
            total += integer;
        }
        double average = ((double) total + 1) / (list.size() - 1);
        System.out.println("Average: " + average);
    }
}
