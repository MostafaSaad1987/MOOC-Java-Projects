
import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here
        System.out.println("Give a string:");
        String uS = scan.nextLine();
        System.out.println("Give an integer:");
        int uI = Integer.valueOf(scan.nextLine());
        System.out.println("Give a double:");
        double uD = Double.valueOf(scan.nextLine());
        System.out.println("Give a boolean:");
        boolean uB = Boolean.valueOf(scan.nextLine());
        System.out.println("You gave the string " + uS + "\n" +
                "You gave the integer " + uI + "\n" +
                "You gave the double " + uD + "\n" +
                "You gave the boolean " + uB);
    }
}
