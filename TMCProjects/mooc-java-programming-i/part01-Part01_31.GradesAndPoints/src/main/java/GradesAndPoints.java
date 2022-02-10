
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Give points [0-100]:");
        String grade = "";
        int input = scan.nextInt();
        if (input < 0) {
            grade = "impossible!";
        } else if (input >= 0 && input <= 49) {
            grade = "failed";
        } else if (input >= 50 && input <= 59) {
            grade = "1";
        } else if (input >= 60 && input <= 69) {
            grade = "2";
        } else if (input >= 70 && input <= 79) {
            grade = "3";
        } else if (input >= 80 && input <= 89) {
            grade = "4";
        } else if (input >= 90 && input <= 100) {
            grade = "5";
        } else {
            grade = "incredible!";
        }

        System.out.println("Grade: " + grade);
    }
}
