import java.util.ArrayList;

public class Suitcase {
    private ArrayList<Item> items;
    private int maxWeight;

    public Suitcase(int maxWeight) {
        this.maxWeight = maxWeight;
        items = new ArrayList<>();
    }

    public void addItem(Item item) {
        if (this.totalWeight() + item.getWeight() <= maxWeight) {
            items.add(item);
        }
    }

    @Override
    public String toString() {
        if (items.isEmpty()) {
            return "no items (0 kg)";
        }
        if (items.size() == 1) {
            return items.size() + " item (" + this.totalWeight() + " kg)";
        }
        return items.size() + " items (" + this.totalWeight() + " kg)";
    }

    public int totalWeight() {
        int totalWeight = 0;
        if (!items.isEmpty()) {
            for (Item i : items) {
                totalWeight += i.getWeight();
            }
        }
        return totalWeight;
    }

    public void printItems() {
        if (items.isEmpty()) {
            System.out.println("null");
        } else {
            for (Item i : items) {
                System.out.println(i);
            }
        }
    }

    public Item heaviestItem() {
        if(items.isEmpty()) {
            return null;
        } else {
            Item heavy = items.get(0);
            for(Item i : items) {
                if(i.getWeight() > heavy.getWeight()) {
                    heavy = i;
                }
            }
            return heavy;
        }
    }
}
