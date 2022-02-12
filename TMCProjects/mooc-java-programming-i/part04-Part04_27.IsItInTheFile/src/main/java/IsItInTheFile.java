
import java.nio.file.Paths;
import java.util.Scanner;

public class IsItInTheFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file:");
        String file = scanner.nextLine();

        System.out.println("Search for:");
        String searchedFor = scanner.nextLine();

        Boolean found = false;

        try (Scanner fil = new Scanner(Paths.get(file))) {

            while (fil.hasNextLine()) {
                if (fil.nextLine().equals(searchedFor)) {
                    System.out.println("Found!");
                    found = true;
                    break;
                }
            }

        } catch (Exception e) {
            System.out.println("Reading the file " + file + " failed.");
        }

        if (!found) {
            System.out.println("Not found.");
        }

    }
}