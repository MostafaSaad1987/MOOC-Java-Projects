
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Container firstCont = new Container();
        Container secondCont = new Container();

        while (true) {
            System.out.println("First: " + firstCont.contains() + "/100");
            System.out.println("Second: " + secondCont.contains() + "/100");
            System.out.print("> ");

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }

            String[] userInput = input.split(" ");
            int amount = Integer.valueOf(userInput[1]);

            if (input.startsWith("add")) {
                firstCont.add(amount);
            }
            if (input.startsWith("remove")) {
                secondCont.remove(amount);
            }

            if (input.startsWith("move")) {
                if(amount > firstCont.contains()){
                    secondCont.add(firstCont.contains());
                    firstCont.remove(amount);
                } else {
                    firstCont.remove(amount);
                    secondCont.add(amount);
                }
            }
        }
    }

}

/*
add 30
move 20
remove 15

add 30
remove 15

add 1000
move 90
remove 33
add 10000
move 50
remove 33
 */