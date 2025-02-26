import java.util.Scanner;

public class Star {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int rows = inp.nextInt(); 

        for (int i = 1; i <= rows; i++) {
            for (int j = i; j < rows; j++) {
                System.out.print(" "); //prints out the shape of the pyramid
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*"); //the asterisks are the stars
            }
            System.out.println();
        }
        
    }
}
