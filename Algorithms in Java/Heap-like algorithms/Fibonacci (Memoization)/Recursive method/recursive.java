//Time complexity of this algorithm is O(2^n) because of its repeated calculations, making it slower
//than the dynamic programming solution for large inputs.


public class recursive {

    //function to calculate the Fibonacci values
    public static int fibonacci(int x) {
        if (x <= 1) {
            return x; //base case
        }
        return fibonacci(x - 1) + fibonacci(x - 2);//returns the recursive case of the fibonacci
    }

    public static void main(String[] args) {
        int x = 8; //target number
        System.out.println("The Fibonacci value of " + x + " is " + fibonacci(x));
    }
}