import java.util.Scanner;
public class Classes2 {

    static void addition(int x, int y){
        int sum = x + y;
        System.out.println("The sum of " + x + " + " + y + " is " + sum);
    }

    static void difference(int x, int y){
        int diff = x - y;
        System.out.println("The difference of " + x + " - " + y + " is " + diff);
    }

    static void multiplication(int x, int y){
        int prod = x * y;
        System.out.println("The product of " + x + " x " + y + " is " + prod);
    }

    static void division(int x, int y){
        int div = x / y;
        System.out.println("The quotient of " + x + " / " + y + " is " + div);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the 1st number: ");
        int num1 = input.nextInt();
        System.out.print("Enter the 2nd number: ");
        int num2 = input.nextInt();
        addition(num1, num2);
        difference(num1, num2);
        multiplication(num1, num2);
        division(num1, num2);
        input.close();
    }
}
