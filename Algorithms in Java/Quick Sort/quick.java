//quick sort uses or works in divide and conquer, which breaks the array into smaller sub-arrays
//and then sorts them individually

public class quick {
    public static void main(String[] args) {
        int[] arr = { 5, 3, 2, 6, 7, 19, 2, 17, 3, 5, 10 };

    }

    // make a function partition
    private int partition(int[] array, int high, int low){
        
        int pivot = array[high]; //choose a pivot, wherein this is where u will compare the number 
        int i = low - 1; //the cursor or counter will start before the index 0

        //this for loop accesses each element, which then moves all smaller elements to the left side 
        //and all larger elements to the right side of the pivot
        for (int j = low; j < high - 1; j++) {
            if (arr[j] < pivot){    //if the current value of the index in the array is smaller than the pivot
                i++;                //i will be incremented
                                    //for example:
                int temp = array[i]; //if the current i index is 2, the value 2 will now be transferred to the "temp" variable
                array[i] = array[j]; //if the current j index is 3, that number will now be assigned as the i index
                array[j] = temp;     //since the value 2 was transferred to the temp, it will now be assigned at the j index
            }
        }
    }
}
