
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class mainProgram {

    public static void main(String[] args) {
        // NB! Do not create other scanner objects than the one below
        // if and when you create other classes, pass the scanner to them
        // as a parameter

        Scanner scan = new Scanner(System.in);

        String userInput = "";
        System.out.print("?: ");
        userInput = scan.nextLine();

        ArrayList<Bird> birdArrayList = new ArrayList<>();

        while (true) {
            if (userInput.contains("Add")) {
                System.out.print("Name: ");
                String name = scan.nextLine();
                System.out.print("Name in Latin: ");
                String latinName = scan.nextLine();

                birdArrayList.add(new Bird(name, latinName));

                System.out.print("?: ");
                userInput = scan.nextLine();

            } else if (userInput.contains("Observation")) {
                System.out.print("Bird? ");
                String enteredName = scan.nextLine();
                for(int i = 0; i < birdArrayList.size(); i++) {
                    if(birdArrayList.get(i).getName().equals(enteredName)){
                        birdArrayList.get(i).addObservations();
                        break;
                    } else if(i == birdArrayList.size() - 1) {
                        System.out.println("Not a bird!");
                    }
                }

                System.out.print("?: ");
                userInput = scan.nextLine();
            } else if (userInput.contains("All")) {
                for (Bird bird : birdArrayList) {
                    System.out.println(bird.getName() + "(" + bird.getLatinName() + "): " + bird.getObservations());
                }

                System.out.print("?: ");
                userInput = scan.nextLine();
            } else if (userInput.contains("One")) {
                System.out.println("Bird? ");
                String enteredName = scan.nextLine();
                for(Bird bird : birdArrayList) {
                    if(bird.getName().equals(enteredName)) {
                        System.out.println(bird.getName() + "(" + bird.getLatinName() + "): " + bird.getObservations());
                    }
                }

                System.out.print("?: ");
                userInput = scan.nextLine();
            } else if (userInput.equals("Quit")) {
                break;
            } else {
                System.out.println("Wrong input.");
                userInput = scan.nextLine();
            }
        }

    }
}
