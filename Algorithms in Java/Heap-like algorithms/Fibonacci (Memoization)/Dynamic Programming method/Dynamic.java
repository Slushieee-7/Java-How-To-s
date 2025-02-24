public class Dynamic {
    
    public static int fibonacci(int n){
        if (n <= 1){
            return n; //base case
        }

        int[] fibo = new int[n + 1];
        fibo[0] = 0;
        fibo[1] = 1;

        for (int i = 2; i <= n; i++){
            fibo[i] = fibo[i - 1] + fibo[i - 2]; //stores the value of the fibonacci
        }
        return fibo[n];
    }

    public static void main(String[] args) {
        int n = 10;
        System.out.println("Fibonacci number at position " + n + " is " + fibonacci(n));
    }
}
