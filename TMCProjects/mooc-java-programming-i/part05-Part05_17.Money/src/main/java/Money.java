
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }

    public Money plus(Money addition) {
        return new Money(this.euros + addition.euros, this.cents + addition.cents);
    }

    public boolean lessThan(Money compared) {
        if (compared.euros > this.euros) {
            return true;
        } else {
            return compared.euros == this.euros && compared.cents > this.cents;
        }
    }

    public Money minus(Money decreaser) {
        int newEuros = -1, newCents = -1;

        if (this.euros - decreaser.euros >= 0) {
            newEuros = this.euros - decreaser.euros;
        }

        if (this.cents - decreaser.cents >= 0) {
            newCents = this.cents - decreaser.cents;
        } else if (newEuros >= 0) {
            if (this.cents == 0) {
                newCents = Math.abs(100 - decreaser.cents);
            } else {
                newCents = Math.abs(this.cents - decreaser.cents);
            }
            newEuros--;
        } else {
            newCents = 0;
        }

        if (newEuros < 0) {
            newEuros = 0;
            newCents = 0;
        }

        return new Money(newEuros, newCents);
    }
}
