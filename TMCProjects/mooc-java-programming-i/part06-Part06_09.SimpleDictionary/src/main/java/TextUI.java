import java.util.Scanner;

public class TextUI {
    private Scanner scan;
    private SimpleDictionary dic;

    public TextUI(Scanner scan, SimpleDictionary dic) {
        this.scan = scan;
        this.dic = dic;
    }

    public void start() {
        String input;
        do {
            System.out.print("Command: ");
            input = scan.nextLine();

            if (input.equals("end")) {
                System.out.println("Bye bye!");
                break;
            } else if (input.equals("add")) {
                System.out.print("Word: ");
                String word = scan.nextLine();
                System.out.print("Translation: ");
                String trans = scan.nextLine();

                dic.add(word, trans);
            } else if (input.equals("search")) {
                System.out.print("To be translated: ");
                String word = scan.nextLine();
                if (dic.translate(word) == null) {
                    System.out.println("Word " + word + " was not found");
                } else {
                    System.out.println("Translation: " + dic.translate(word));
                }
            } else {
                System.out.println("Unknown command");
            }
        } while (true);
    }
}

/*
Command: something
Unknown command
Command: add
Word: pike
Translation: hauki
Command: change
Unknown command
Command: search
To be translated: pike
Translation: hauki
Command: search
To be translated: carrot
Word carrot was not found
Command: end
Bye bye!
 */