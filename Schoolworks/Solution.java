import java.util.*;

class Solution {
    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt(); // Number of test cases
        
        for (int i = 0; i < t; i++) {
            int a = in.nextInt(); // First integer input
            int b = in.nextInt(); // Second integer input
            int n = in.nextInt(); // Number of iterations
            
            int currentSum = 0; // Initialize currentSum for cumulative calculation

            // For each value of x from 1 to n
            for (int x = 1; x <= n; x++) {
                int term = 0; // Initialize term for the current x
                
                // Calculate the current term based on the formula
                for (int y = 0; y < x; y++) {
                    term += (Math.pow(2, y) * b);
                }
                
                currentSum += (a + term); // Update cumulative sum
                System.out.print(currentSum + " "); // Print the current cumulative sum
            }
            System.out.println(); // New line after each test case
        }
        
        in.close(); // Close the scanner
    }
}