
public class YourFirstAccount {

    public static void main(String[] args) {
        // Do not touch the code in Account.java
        // Write your program here
        Account money = new Account("Yes Man", 100.0);
        money.deposit(20.0);
        System.out.println(money.toString());
    }
}
