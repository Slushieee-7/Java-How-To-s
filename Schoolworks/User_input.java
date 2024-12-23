import java.util.Scanner;
class User_input {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
          String UserName;
          System.out.println("Enter username: ");

          UserName = myObj.nextLine(); //reads user input
          System.out.println("Username is: " + UserName);
             myObj.close();
        
    }

    //Input types

    //nextBoolean() - reads a boolean value from user
    //nextByte() - reads a byte value from user
    //nextDouble() - reads a double value from user 
    //nextFloat() - reads a float value from user 
    //nextInt() - reads an int value from user
    //nextLine() - reads the string from user 
    //nextLong() - reads the long value from the user
    //nextShort() - reads the short value from the user

    // remove the comments here and comment the previous block of code to run this code :>
    // public static void main(String[] args) {
    //   Scanner newOBJ = new Scanner(System.in); //activates the scanner

    //     System.out.println("Enter name: ");
    //     //iinput ng user
    //     String namee = newOBJ.nextLine(); //stores the name here

    //     //numerical inputs
    //     System.out.println(" Enter age: ");
    //     int age = newOBJ.nextInt(); //stores the age here

    //     System.out.println("Enter Year Level: ");
    //     int yearLevel = newOBJ.nextInt(); //stores the year level here

    //     //output
    //     System.out.println("Name of the student: " + namee);
    //     System.out.println("Student's age: " + age);
    //     System.out.println("Student's Year Level: " + yearLevel);
    //     newOBJ.close();
    // }
}


