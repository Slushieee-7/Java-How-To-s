import java.util.Scanner;

public class random {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        double number = input.nextDouble();
        double rnd = Math.random();
        System.out.println("You have guessed the right number! \n Guessed number: " + number + "\n" + "Random number: " + rnd);
        input.close();
    }
}
