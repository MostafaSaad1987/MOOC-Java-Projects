import java.util.ArrayList;
import java.util.Scanner;

public class Identifier {
    public static void IdentifierStart() {
        Scanner scanner = new Scanner(System.in);
        String identifier = "";
        String name = "";
        ArrayList<Items> archiveItems = new ArrayList<>();

        do {
            System.out.println("Identifier? (empty will stop)");
            identifier = scanner.nextLine();
            if (identifier.isEmpty()) break;

            System.out.println("Name? (empty will stop)");
            name = scanner.nextLine();
            if (name.isEmpty()) break;

            Items itemToAdd = new Items(name, identifier);
            if (!archiveItems.contains(itemToAdd)) {
                archiveItems.add(itemToAdd);
            }
        } while (true);
        System.out.println("==Items==");
        for (Items i : archiveItems) {
            System.out.println(i);
        }
    }
}
