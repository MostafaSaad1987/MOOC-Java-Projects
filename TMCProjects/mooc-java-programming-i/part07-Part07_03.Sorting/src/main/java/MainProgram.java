import java.util.Arrays;

public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] array = {3, 1, 5, 99, 3, 12};
    }

    public static int smallest(int[] array) {
        // write your code here
        int small = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] < small) {
                small = array[i];
            }
        }
        return small;
    }

    public static int indexOfSmallest(int[] array) {
        // write your code here
        int small = smallest(array);
        int pos = 0;

        for (int i = 0; i < array.length; i++) {
            if (small == array[i]) {
                pos = i;
            }
        }
        return pos;
    }

    public static int indexOfSmallestFrom(int[] table, int startIndex) {
        // write your code here
        int[] user = Arrays.copyOfRange(table, startIndex, table.length);
        int small = smallest(user);
        int pos = startIndex;

        for (int i = startIndex; i < table.length; i++) {
            if (small == table[i]) {
                pos = i;
            }
        }
        return pos;
    }

    public static void swap(int[] array, int index1, int index2) {
        // write your code here
        int tempVar = array[index1];
        array[index1] = array[index2];
        array[index2] = tempVar;
    }

    //First try. Let's do it.
    public static void sort(int[] array) {
        int currentIndex = 0;

        for (int l = 0; l < array.length; l++) {
            System.out.println(Arrays.toString(array));
            int indexSmallest = indexOfSmallestFrom(array, currentIndex);
            for (int i = currentIndex; i < array.length; i++) {
                if (i == indexSmallest) {
                    swap(array, indexSmallest, currentIndex);
                    currentIndex++;
                    break;
                }
            }
        }
    }
}