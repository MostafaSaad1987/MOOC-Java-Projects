
import java.util.Scanner;

public class CheckingTheAge {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How old are you?");
        int year = scan.nextInt();
        if (year >= 0 && year <= 120){
            System.out.println("OK");
        }else{
            System.out.println("Impossible!");
        }
    }
}