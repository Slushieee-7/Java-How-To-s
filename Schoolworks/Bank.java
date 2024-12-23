import java.util.Scanner;
public class Bank {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      while (true) {
          System.out.print("What is your account balance: ");
          double Balance = scanner.nextDouble();
          if (Balance < 0) Balance = 0;
          System.out.print("How much is the Interest rate?:  ");
          double interestRate = scanner.nextDouble();
          if (interestRate < 0) interestRate = 0;
          double times = 10;
          System.out.print("Your bank account balance in 10 years will be: \n[1] Annually\n[2] Monthly\n[3] Daily\n> ");
          int method = scanner.nextInt();
          if (method < 1) method = 1;
          if (method > 3) method = 3;
          if (method == 2) times *= 12;
          if (method == 3) times *= 365;
          double newBalance = Balance;
          double multiple = 1 + interestRate / 10 / times;
          for (int i = 0; i < times; i++)
          newBalance *= multiple;
          System.out.println("You now have " + newBalance + " from " + interestRate + "% interest rate over 10 years. (" + (method == 1 ? "Annually" : method == 2 ? "Monthly" : "Daily") + ")");
          scanner.close();
      }
  }
}