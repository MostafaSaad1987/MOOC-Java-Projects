
import java.nio.file.Paths;
import java.util.Scanner;

public class NumbersFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("File? ");
        String file = scanner.nextLine();
        System.out.print("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        System.out.print("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());

        int counter = 0;

        try (Scanner fil = new Scanner(Paths.get(file))) {
            while (fil.hasNextLine()){
                int j = Integer.parseInt(fil.nextLine());
                if(j >= lowerBound && j <= upperBound){
                    counter++;
                }
            }
        } catch (Exception e){
            System.out.println("Error: " + e);
        }

        System.out.println("Numbers: " + counter);

    }

}

/*
Then the program reads the numbers contained in the file (each number is on its own line) and only accounts for the numbers which are inside the given range.
Finally, the program should print the number of numbers that were inside the given range.

You can convert a string-type integer read from a file into a proper integer using the command Integer.valueOf (just as when handling input from a user).
Sample output
 */