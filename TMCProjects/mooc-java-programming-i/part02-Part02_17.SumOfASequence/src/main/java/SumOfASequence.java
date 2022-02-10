
import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Last number? ");
        int uI = scanner.nextInt();
        int total = 0;
        for ( int i = 0; i <= uI; i++){
            total += i;
        }
        System.out.println("The sum is " + total);
    }
}

/*

Programming exercise:
Sum of a sequence
Points
0/1

Implement a program, which calculates the sum 1+2+3+...+n where n is given as user input.

Sample output:
Sample output

Last number? 3
The sum is 6

The previous example calculated 1 + 2 + 3 = 6
Sample output

Last number? 7
The sum is 28

And this one calculated 1 + 2 + 3 + 4 + 5 + 6 + 7 = 28
 */