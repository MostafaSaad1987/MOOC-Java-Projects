
import java.util.ArrayList;

public class PrintInRange {

    public static void main(String[] args) {
        // Try your method here
    }

    public static void printNumbersInRange(ArrayList<Integer> numbers, int lowerLimit, int upperLimit){
        //System.out.println("The numbers in the range [" + lowerLimit + ", " + upperLimit + "]");

        for (int i = 0; i < numbers.size(); i++){
            if(numbers.get(i) >= lowerLimit && numbers.get(i) <= upperLimit){
                System.out.println(numbers.get(i));
            }
        }
    }
    
}

//The method prints the numbers in the given list whose values are in the range [lowerLimit, upperLimit].