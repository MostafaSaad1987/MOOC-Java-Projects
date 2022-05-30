
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int firstCont = 0;
        int secondCont = 0;

        while (true) {
            System.out.println("First: " + firstCont + "/100");
            System.out.println("Second: " + secondCont + "/100");

            System.out.print("> ");

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }

            String[] userInput = input.split(" ");
            int amount = Integer.valueOf(userInput[1]);

            if (input.startsWith("add") && amount > 0) {
                firstCont += amount;
            }

            if (input.startsWith("move") && amount > 0) {
                if(amount > firstCont){
                    amount = firstCont;
                    firstCont = 0;
                } else {
                    firstCont -= amount;
                }
                secondCont += amount;
            }

            if (input.startsWith("remove") && amount > 0) {
                secondCont -= amount;
            }

            if(secondCont < 0){
                secondCont = 0;
            }

            if (firstCont > 100)
            {
                firstCont = 100;
            }

            if (secondCont > 100)
            {
                secondCont = 100;
            }
        }
    }

}
