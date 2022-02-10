
import java.util.ArrayList;

public class Sum {

    public static void main(String[] args) {
        // Try your method here
    }

    public static int sum(ArrayList<Integer> numbers){
        int x = 0;
        for(int i = 0; i < numbers.size(); i++){
            x += numbers.get(i);
        }
        return x;
    }
}
