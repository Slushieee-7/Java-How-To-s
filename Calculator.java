import java.util.Scanner;

public class Calculator  {
    
    static void Addition(float num1, float num2) {
        float summ = num1 + num2;
        System.out.println("The answer for " + num1 + " + " + num2 + " is equals to " + summ);
    }

    static void Mainmenu() throws InterruptedException {
        int operation;
        Scanner input = new Scanner(System.in);
        do{
        System.out.println("Welcome to the Calculator");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");
            System.out.println("Choose an operation: ");
            operation = input.nextInt();

                switch (operation){
                    case 1:
                    System.out.println("Enter the first number: ");
                    float x = input.nextFloat();
                    System.out.println("Enter the second number: ");
                    float y = input.nextFloat();
                    Addition(x, y);
                    break;
    
                    case 2:
                    System.out.println("Enter the first number: ");
                    float a = input.nextFloat();
                    System.out.println("Enter the second number: ");
                    float b = input.nextFloat();
                    Subtraction(a, b);
                    break;

                    case 3:
                    System.out.println("Enter the first number: ");
                    float e = input.nextFloat();
                    System.out.println("Enter the second number: ");
                    float f = input.nextFloat();
                    Multiplication(e, f);
                    
                    break;
                    
                    case 4:
                    System.out.println("Enter the first number: ");
                    float c = input.nextFloat();
                    System.out.println("Enter the second number: ");
                    float d = input.nextFloat();
                    Division(c, d);
                    break;

                    case 5:
                    System.out.println("Exiting the Calculator...");
                    Thread.sleep(1000);
                    System.out.println("Thank you for using the calculator! ");
                    break;

                    default:
                    System.out.println("Invalid operation");
                    Mainmenu();
                    break;
                } 
            }while(operation != 5);
            input.close();
        }
    static void Subtraction(float num1, float num2) {
        float diff = num1 - num2;
        System.out.println("The answer for " + num1 + " - " + num2 + " is equals to " + diff);
    }

    static void Multiplication(float num1, float num2){
        float product = num1 * num2;
        System.out.println("The answer for " + num1 + " * " + num2 + " is equals to " + product);
    }

    static void Division(float num1, float num2){
        if (num2 == 0){
            System.out.println("Division by zero (0) is not allowed");
        } else {
            float quotient = num1 / num2;
            System.out.println("The answer for " + num1 + " / " + num2 + " is equals to " +  quotient);
        }
    }
    public static void main(String[] args) throws InterruptedException { //int main
        Mainmenu();
    }
}

// shorter version
// import java.util.Scanner;

// public class Calculator {
//     static void calculate(float num1, float num2, int operation) {
//         switch (operation) {
//             case 1:
//                 System.out.println("The answer for " + num1 + " + " + num2 + " is equals to " + (num1 + num2));
//                 break;
//             case 2:
//                 System.out.println("The answer for " + num1 + " - " + num2 + " is equals to " + (num1 - num2));
//                 break;
//             case 3:
//                 System.out.println("The answer for " + num1 + " * " + num2 + " is equals to " + (num1 * num2));
//                 break;
//             case 4:
//                 if (num2 == 0) {
//                     System.out.println("Division by zero (0) is not allowed");
//                 } else {
//                     System.out.println("The answer for " + num1 + " / " + num2 + " is equals to " + (num1 / num2));
//                 }
//                 break;
//         }
//     }

// //     public static void main(String[] args) throws InterruptedException {
// //         Scanner input = new Scanner(System.in);
// //         int operation;
// //         do {
// //             System.out.println("Welcome to the Calculator");
// //             System.out.println("1. Addition");
// //             System.out.println("2. Subtraction");
// //             System.out.println("3. Multiplication");
// //             System.out.println("4. Division");
// //             System.out.println("5. Exit");
// //             System.out.println("Choose an operation: ");
// //             operation = input.nextInt();

// //             if (operation == 5) {
// //                 System.out.println("Exiting the Calculator...");
// //                 Thread.sleep(1000);
// //                 System.out.println("Thank you for using the calculator! ");
// //                 break;
// //             }

// //             if (operation < 1 || operation > 4) {
// //                 System.out.println("Invalid operation");
// //                 continue;
// //             }

// //             System.out.println("Enter the first number: ");
// //             float num1 = input.nextFloat();
// //             System.out.println("Enter the second number: ");
// //             float num2 = input.nextFloat();
// //             calculate(num1, num2, operation);
// //         } while (operation != 5);
// //         input.close();
// //     }
// // }