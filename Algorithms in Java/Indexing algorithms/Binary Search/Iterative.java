public class Iterative {

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int target = 3; // this is the element that the algorithm will find in the array
        int result = BinarySearch(arr, target);
        if (result == -1) {
            System.out.println("No such element was found in the array (づ •. •)?");
        } else {
            System.out.println("Element found at index " + result);
        }

    }

    public static int BinarySearch(int[] arr, int target) {

        int left = 0; // starting cursor
        int right = arr.length - 1; 

        while (left <= right) {
            int mid = left + (right - left) / 2; // this prevents potential overflow

            if (arr[mid] == target) { // checks if the element at the current index is same as the target
                return mid; // target spotted
            }

            if (arr[mid] < target) { // if the element at the current index is less than the target number
                left = mid + 1; // the cursor will now move at the next index
            }

            else {
                right = mid - 1; // if the element at the current index is greater than the target number, the
                                 // cursor will now move at the left index
            }
        }
        return -1; // value not found
    }
}
