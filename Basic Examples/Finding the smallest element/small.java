public class small {
    public static void main(String[] args) {
        int[] nums = { 20, 21, 25, 27, 28, 19, 23 }; // set a storage where u would want to find the smallest element

        int lowestNum = nums[0]; // create a variable and assign the first element into it

        //create a for loop wherein the program will compare each value stored in the array
        for (int num : nums){
            if (lowestNum > num) { 
                lowestNum = num; // if the current number is smaller than the lowest number, assign it to the
                                 // lowest num
            }
        }
        System.out.println("The lowest number in the array is: " + lowestNum);
    }
}
