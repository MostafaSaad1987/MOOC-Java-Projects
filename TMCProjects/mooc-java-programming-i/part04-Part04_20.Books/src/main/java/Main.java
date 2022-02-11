import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        // implement here the program that allows the user to enter 
        // book information and to examine them
        Scanner scan = new Scanner(System.in);
        ArrayList<Book> book = new ArrayList<>();

        String name = "";
        int year = 0, pages = 0;
        String choice = "";

        while (true){
            System.out.println("Title: ");
            name = scan.nextLine();

            if(name.isEmpty()){
                break;
            }

            System.out.println("Pages: ");
            pages = Integer.parseInt(scan.nextLine());

            System.out.println("Publication year: ");
            year = Integer.parseInt(scan.nextLine());

            book.add(new Book(name, pages, year));
        }

        System.out.println("What information will be printed?");
        choice = scan.nextLine();

        if(choice.equals("everything")){
            for(Book b : book){
                System.out.println(b);
            }
        } else if (choice.equals("name")){
            for(Book b : book){
                System.out.println(b.getTitle());
            }
        }
    }
}