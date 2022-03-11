import java.util.Scanner;

public class UserInterface {
    private TodoList todoList;
    private Scanner scan;

    public UserInterface(TodoList todoList, Scanner scan) {
        this.todoList = todoList;
        this.scan = scan;
    }

    public void start() {
        do {
            String input;
            System.out.print("Command: ");
            input = scan.nextLine();

            if (input.equals("stop")) {
                break;
            }

            processInput(input);

        } while (true);
    }

    private void processInput(String input) {
        switch (input) {
            case "add":
                System.out.print("To add: ");
                todoList.add(scan.nextLine());
                break;

            case "list":
                todoList.print();
                break;

            case "completed":
                System.out.print("Which task was completed? ");
                todoList.remove(Integer.parseInt(scan.nextLine()));
                break;

            case "remove":
                System.out.print("Which one is removed? ");
                todoList.remove(Integer.parseInt(scan.nextLine()));
                break;
        }
    }
}
