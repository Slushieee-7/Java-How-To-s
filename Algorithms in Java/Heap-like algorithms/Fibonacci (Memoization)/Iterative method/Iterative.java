//Time complexity of this algorithm is O(n) 
//Space complexity of O(1)
//This calculates the fibonacci numbers in a loop

public class Iterative {
    
    //function that will calculate the Fibonacci using iteration
    public static int fibonacci(int n){
        if (n <= 1){ //if n is less than or equal to 1
            return n;  //this will return the value, because the array only has 1 element
        }

        int a = 0, b = 1, c = 0;
        for (int i = 2; i <= n; i++){
            c = a + b; //this will calculate the next fibonacci number and will store the value at variable "c"
            a = b; //this will store the previous value at variable "a"
            b = c; //this will store the current value at variable "b"
        }
        return c; //returns the value of the fibonacci
    }

    public static void main(String[] args) {
        int n = 7; //position of the fibonacci number
        System.out.println("The fibonacci number at position " + n + " is " + fibonacci(n));
    }
}
