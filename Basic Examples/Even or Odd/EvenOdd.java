import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //declare the Scanner
        System.out.println("Enter an integer: "); //asks the user to enter a number
        int number = input.nextInt(); //sets the user input as an int

        //checks if the input, when divided by 2, would be 0
        if (number % 2 == 0) {
            System.out.println(number + " is an even number"); //outputs even
        }

        //checks if the input, when divided by 2, would not be 0
        else {
            System.out.println(number + " is an odd number"); //outputs odd
        }

        input.close(); //closes the scanner
    }
}