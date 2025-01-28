import java.lang.reflect.Array;

//bubble sort compares each pair, until everything is already sorted

public class bubble {
    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4, 5, 2, 9, 10, 7, 6 };
        int step = 1; //starts with "Step 1"

        int n = array.length; // initiate that "n" must will be the length of the array
        for (int i = 0; i < n; i++) { // creates an outer for loop to print each array
            for (int j = 0; j < n - i - 1; j++) { 
                if (array[j] > array[j + 1]) { // if the left hand value (array[j]) is greater than the right hand value (array[j + 1]) 
                                               // it means the elements are in the wrong order

                    // if the array is in the wrong order: 
                    int temp = array[j]; //it stores the left hand value, (array[j]), to the temporary variable
                    array[j] = array[j + 1]; //now it assigns the right hand value, (array[j + 1]), now as the left hand value
                    array[j + 1] = temp; //which now assigns the left hand value then (array[j]) to the right hand value (array[j + 1])
                }
                //prints out each changes step by step
                System.out.print("Step " + step + ": ");
                for (int value : array) {
                    System.out.print(value + " ");
                }
                System.out.println();
                step++;
            }
        }
    }
}
