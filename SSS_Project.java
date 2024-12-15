import java.util.Scanner;
public class SSS_Project {
    public static void main(String[] args) {
        try (Scanner userInput = new Scanner(System.in)){
            System.out.println("Enter your name: ");
            String name = userInput.nextLine();

            System.out.println("Enter your address: ");
            String address = userInput.nextLine();

            System.out.println("Enter your salary: ");
            float salary = userInput.nextFloat();

            System.out.println("Name: " + name);
            System.out.println("Your salary: " + salary);
            System.out.println("Address: " + address);
        }
    }
}
