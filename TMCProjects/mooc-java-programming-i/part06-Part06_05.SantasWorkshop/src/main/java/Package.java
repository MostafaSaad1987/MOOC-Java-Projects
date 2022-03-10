import java.util.ArrayList;

public class Package {
    private ArrayList<Gift> gifts;

    public Package() {
        gifts = new ArrayList<>();
    }

    public void addGift(Gift gift) {
        gifts.add(gift);
        //totalWeight += gift.getWeight();
    }

    public int totalWeight() {
        int totalWeight = 0;
        for(Gift g : gifts) {
            totalWeight += g.getWeight();
        }
        return totalWeight;
    }
}
