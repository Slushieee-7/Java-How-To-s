//it's time complexity is O(n) wherein n is the number of elements in an array

public class linear {

    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) { //if the index [i] matches with the said target
                return i; //returns i
            }
        }
        return -1; //returns -1 if the target is not found 
    }

    public static void main(String[] args) {
        int[] arr = { 0, 7, 27, 5, 9, 22};
        int target = 27;
        int result = linearSearch(arr, target); //calls the linearsearch on the array and the assigned target value

        if (result == -1){
            System.out.println("The number " + target + " was not found"); //if linearSearch returns -1, the target is not found
        }
        else {
            System.out.println("The number " + target + " was found at index " + result);
        }
    }
}
