//quick sort uses or works in divide and conquer, which breaks the array into smaller sub-arrays
//and then sorts them individually

public class quick {

    // make a function partition
    static int partition(int[] arr, int high, int low){
            
            int pivot = arr[high]; //choose a pivot, wherein this is where u will compare the number 
            int i = low - 1; //the cursor or counter will start before the index 0
    
            //this for loop accesses each element, which then moves all smaller elements to the left side 
            //and all larger elements to the right side of the pivot
            for (int j = low; j < high - 1; j++) {
                if (arr[j] < pivot){    //if the current value of the index in the array is smaller than the pivot
                    i++;                //i will be incremented
                    swap(arr, i, j);    //function swap will be called  
                }
            }
            swap(arr, i, high); //instead of index j is called, the value of the pivot is called
        return i + 1; //returns the value of i + 1
    }

    //make a function that swaps your values to avoid unnecessary reitiration
    static void swap(int[] arr, int i, int j){
        int temp = arr[i]; //if the current i index is 2, the value 2 will now be transferred to the "temp" variable
        arr[i] = arr[j]; //if the current j index is 3, that number will now be assigned as the i index
        arr[j] = temp; //since the value 2 was transferred to the temp, it will now be assigned at the j index
    }

    //function for the quicksort itself
    static void quickquick(int[] arr, int low, int high){
        if (low < high){ //if the index at "low" is less than the value at the index at "high"  
            int par = partition(arr, low, high);

            quickquick(arr, low, par - 1); //quick sorts the subarray to the left of the pivot element
            quickquick(arr, par + 1, high); //quick sorts the subarray to the right if the pivot element
        }
    }

    public static void main(String[] args) {
        int[] arr = { 5, 3, 2, 6, 7, 19, 2, 17, 3, 5, 10 };
        int len = arr.length; 
        int step = 0;

        quickquick(arr, 0, len - 1);

        for (int val : arr){
            System.out.println(val + " ");
            //prints out each changes step by step
            System.out.print("Step " + step + ": ");
            for (int value : arr) {
                System.out.print(value + " ");
            }
            System.out.println();
            step++;
        }

    }
}
