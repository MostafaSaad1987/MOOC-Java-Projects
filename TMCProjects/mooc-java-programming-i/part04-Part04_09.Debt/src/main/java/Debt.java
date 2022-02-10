public class Debt {
    private double balance, interestRate;

    public Debt(double initialBalance, double initialInterestRate){
        this.interestRate = initialInterestRate;
        this.balance = initialBalance;
    }

    public void printBalance(){
        System.out.println(balance);
    }


    public void waitOneYear(){
        balance *= interestRate;
    }
}
