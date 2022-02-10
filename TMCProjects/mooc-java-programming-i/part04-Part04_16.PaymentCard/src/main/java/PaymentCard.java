public class PaymentCard {
    private double balance;

    public PaymentCard(double openingBalance) {
        this.balance = openingBalance;
    }

    public void eatAffordably() {
        if (balance >= 2.60) {
            this.balance -= 2.60;
        }
    }

    public void eatHeartily() {
        if (balance >= 4.60) {
            this.balance -= 4.60;
        }
    }

    public void addMoney(double money) {
        if (money < 0) {
            balance = balance;
        } else {
            balance += money;
        }

        if (balance >= 150) {
            balance = 150.0;
        }
    }


    @Override
    public String toString() {
        return "The card has a balance of " + this.balance + " euros";
    }
}
