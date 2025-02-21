import java.util.Arrays;

public class Merge {

    public static void mSort(int[] arr) {
        if (arr.length < 2) {
            return; // base case or it means that the array is already sorted because it only has 1 element in it
        }

        int mid = arr.length / 2; // find the middle of the array

        // this splits the array in half and sets their left index and right index
        int[] left = Arrays.copyOfRange(arr, 0, mid);
        int[] right = Arrays.copyOfRange(arr, mid, arr.length);

        // make a recursive call that would split the left and right halves
        mSort(left);
        mSort(right);

        // then merge the sorted halves
        merge(arr, left, right);
    }

    // function that will merge the array
    public static void merge(int[] arr, int[] left, int[] right) {
        int x = 0, y = 0, z = 0; // sets the indexes to 0

        // merge the two arrays while both have elements
        while (x < left.length && y < right.length) {
            if (left[x] < right[y]) {
                arr[z] = left[x];
                x++;
            } else {
                arr[z] = right[y];
                y++;
            }
            z++; // move the index of the merged array forward
        }

        // If there are remaining elements in the left array, copy them
        while (x < left.length) {
            arr[z] = left[x];
            x++;
            z++;
        }

        // If there are remaining elements in the right array, copy them
        while (y < right.length) {
            arr[z] = right[y];
            y++;
            z++;
        }
    }

    public static void main(String[] args) {
        int[] array = { 0, 7, 27, 9, 5, 22, 12, 8 };

        System.out.println("The given array is: " + Arrays.toString(array)); // displays the whole array

        mSort(array); // calls the mergeSort function

        System.out.println("The sorted array is now: " + Arrays.toString(array));
    }
}
