
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {

        System.out.println("Name of the file:");
        Scanner scan = new Scanner(System.in);
        String fileName = scan.nextLine();

        try(Scanner file = new Scanner(Paths.get(fileName))){

            while (file.hasNextLine()){
                String[] j = file.nextLine().split(",");
                String name = j[0];
                int age = Integer.parseInt(j[1]);

                String year = (age > 1) ? " years" : " year";

                System.out.println(name + ", age: " + age + year);
            }

        } catch (Exception e) {
            System.out.println("Error: " + e);
        }

    }
}

/*
Name of the file:
data.txt
lily, age: 3 years
anton, age: 5 years
levi, age: 4 years
amy, age: 1 year

NB! The word "year" should be formatted based on the age.
 */