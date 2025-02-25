public class sumArray {
    public static void main(String[] args) {
        int[] array = {21, 7, 2, 10, 12};
        int sum = 0; //sets the sum to 0
        for (int i = 0; i < array.length; i++){
            sum += array[i]; //adds each element in the array to the sum
        }
        System.out.println("The sum of the array is: " + sum);
    }
}