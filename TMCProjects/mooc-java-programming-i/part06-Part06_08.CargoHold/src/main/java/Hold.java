import java.util.ArrayList;

public class Hold {
    private final int maxWeight;
    private ArrayList<Suitcase> suitcases;

    public Hold(int maxWeight) {
        this.maxWeight = maxWeight;
        suitcases = new ArrayList<>();
    }

    public void addSuitcase(Suitcase suitcase) {
        if (this.totalWeight() + suitcase.totalWeight() <= maxWeight) {
            suitcases.add(suitcase);
        }
    }

    @Override
    public String toString() {
        if (suitcases.isEmpty()) {
            return "no suitcases (0 kg)";
        }
        if (suitcases.size() == 1) {
            return suitcases.size() + " suitcase (" + this.totalWeight() + " kg)";
        }
        return suitcases.size() + " suitcases (" + this.totalWeight() + " kg)";
    }

    public int totalWeight() {
        int totalWeight = 0;
        if (!suitcases.isEmpty()) {
            for (Suitcase s : suitcases) {
                totalWeight += s.totalWeight();
            }
        }
        return totalWeight;
    }

    public void printItems() {
        if (suitcases.isEmpty()) {
            System.out.println("null");
        } else {
            for (Suitcase i : suitcases) {
                i.printItems();
            }
        }
    }
}
