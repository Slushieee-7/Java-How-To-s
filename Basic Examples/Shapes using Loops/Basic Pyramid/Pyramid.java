//to create a basic pyramid in java, we will use for loops
//also using the user input

import java.util.Scanner;

public class Pyramid {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of rows for the pyramid: ");
        int rows = input.nextInt();

        for (int i = 1; i <= rows; i++){ //
            for (int j = 1; j <= i; j++){
                System.out.print("* "); 
            }
            System.out.println();
        }
    }
}
