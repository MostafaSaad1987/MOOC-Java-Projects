import java.util.ArrayList;

public class TodoList {

    private ArrayList<String> list;

    public TodoList() {
        list = new ArrayList<>();
    }

    public void add(String task) {
        list.add(task);
    }

    public void print() {
        for(String s : list) {
            System.out.println((list.indexOf(s) + 1) + ": " + s);
        }
    }

    public void remove(int number) {
        list.remove(list.get(number - 1));
    }
}
