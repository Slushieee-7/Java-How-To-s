import java.util.Scanner;

public class random {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double number = input.nextDouble();
        double rnd = Math.random();
        

        while (number == rnd) {
            System.out.println("Enter a number: ");
            if (number > rnd){
                System.out.println("The number you entered is greater than the random number");
            }
            else if(number < rnd){
                System.out.println("The number you entered is less than the random number");
            }
        }
        System.out.println("You have guessed the right number! \n Guessed number: " + number + "\n" + "Random number: " + rnd);
        input.close();
    }
}
