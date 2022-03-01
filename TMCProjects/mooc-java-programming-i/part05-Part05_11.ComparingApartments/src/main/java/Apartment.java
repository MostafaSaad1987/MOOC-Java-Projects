
public class Apartment {

    private int rooms;
    private int squares;
    private int princePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.princePerSquare = pricePerSquare;
    }

    public boolean largerThan(Apartment compared) {
        return this.squares > compared.squares;
    }

    public int priceDifference(Apartment compared) {
        int priceMain = this.princePerSquare * this.squares;
        int priceOth = compared.princePerSquare * compared.squares;
        if(priceMain - priceOth < 0){
            return (priceMain - priceOth) * -1;
        }
        return priceMain - priceOth;
    }

    public boolean moreExpensiveThan(Apartment compared){
        int priceMain = this.princePerSquare * this.squares;
        int priceOth = compared.princePerSquare * compared.squares;
        return priceMain > priceOth;
    }
}

/*
The price difference is the absolute value of the difference of the prices
(price can be calculated by multiplying the price per square by the number of squares).
 */