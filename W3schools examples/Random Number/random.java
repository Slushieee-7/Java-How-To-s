import java.util.Scanner;

public class random {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        double number = input.nextDouble();
        System.out.println("Your guess: " + number);
        System.out.println("Randome number: " + Math.random());
        input.close();
    }
}
