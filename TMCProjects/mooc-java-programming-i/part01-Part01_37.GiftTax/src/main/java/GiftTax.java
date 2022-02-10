
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //System.out.println("Value of the gift?");
        int valueOfTheGift = scan.nextInt();
        double tax = 0;
        double rate = 0;
        int lowerRange = 0;

        if(valueOfTheGift >= 5000 && valueOfTheGift <= 25000){
            tax = 100;
            rate = 0.08;
            lowerRange = 5000;
        } else if(valueOfTheGift >= 25000 && valueOfTheGift <= 55000){
            tax = 1700;
            rate = 0.1;
            lowerRange = 25000;
        } else if(valueOfTheGift >= 55000 && valueOfTheGift <= 200000){
            tax = 4700;
            rate = 0.12;
            lowerRange = 55000;
        } else if(valueOfTheGift >= 200000 && valueOfTheGift <= 1000000){
            tax = 22100;
            rate = 0.15;
            lowerRange = 200000;
        } else if(valueOfTheGift >= 1000000){
            tax = 142100;
            rate = 0.17;
            lowerRange = 1000000;
        }

        double finalTax = (tax + ((valueOfTheGift-lowerRange)*rate));

        if(valueOfTheGift >= 5000){
            System.out.println("Tax: " + finalTax);
        } else {
            System.out.println("No tax!");
        }
    }
}