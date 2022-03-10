import java.util.ArrayList;

public class Stack {
    private ArrayList<String> stack = new ArrayList<>();

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public void add(String value) {
        stack.add(value);
    }
    public ArrayList<String> values() {
        return stack;
    }

    public String take() {
        String lastElement = stack.get(stack.size() - 1);
        stack.remove(lastElement);
        return lastElement;
    }
}