
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalInformationCollection {

    public static void main(String[] args) {
        // implement here your program that uses the PersonalInformation class

        ArrayList<PersonalInformation> infoCollection = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        String first = " ", second = " ", id = "";

        while (true){
            System.out.println("First name: ");
            first = scanner.nextLine();

            if(first.equals("")){
                break;
            }

            System.out.println("Last name: ");
            second = scanner.nextLine();

            System.out.println("Identification number: ");
            id = scanner.nextLine();

            infoCollection.add(new PersonalInformation(first, second, id));
        }

        for (PersonalInformation ps: infoCollection){
            System.out.println(ps.getFirstName() + " " + ps.getLastName());
        }
    }
}