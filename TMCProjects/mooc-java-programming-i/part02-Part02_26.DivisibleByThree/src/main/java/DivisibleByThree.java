
import java.util.Scanner;

public class DivisibleByThree {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    }

    public static void divisibleByThreeInRange(int beginning, int end) {
        for (int i = beginning; i <= end; i++) {
            if (i % 3 == 0) {
                int j = i;
                do {

                    System.out.println(j);
                    j += 3;

                } while (j <= end);
                break;

            }
        }
    }

}

/*
Write a method  that prints all the numbers divisible by three in the given range.
The numbers are to be printed in order from the smallest to the greatest.
 */