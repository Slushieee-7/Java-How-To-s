public class Basics_of { //"Basics_of" or the filename must be placed after the public class
  /**
   * @param args
   * @throws InterruptedException 
   */
  public static void main(String[] args) throws InterruptedException { //if want to put a sleep function add "throws InterruptedException"
    //Basic printout (cout in c++)
    System.out.print("Sentence 1 ");
    //next print (Sentence 2) will be displayed at the SAME line
    System.out.println("Sentence 2");
    //next print (Sentence 3) will be displayed at the NEXT line
    System.out.println("Sentence 3");

    //Inserting Mathematical Equation
    System.out.print("The answer for 3+3 is "); //sentence 
    System.out.println(3+3); //answer
    System.out.print("The answer for 4x6 is "); //sentence 
    System.out.println(4*6); //answer
    System.out.print("The answer for 10-5 is "); //sentence 
    System.out.println(10-5); //answer
    System.out.print("The answer for 8/4 is "); //sentence 
    System.out.println(8/4); //answer
    //any mathematical equation that will be inputted in the parentheses () will be displayed automatically

    //Declaring and printing out Variables
    String name = "Rey";
    System.out.println(name);
    //the variable name is declared as a string and is assigned the value "Rey"

    int number = 7;
    System.out.println(number);
    //the variable number is declared as an integer and is assigned the value 7

    float num = 5.4f;
    //or float num = (float) 5.4
    System.out.println(num);
    //the variable num is declared as a float and is assigned the value 5.4

    boolean mybool = true;
    System.out.println(mybool);
    //the variable mybool is declared as a boolean and is assigned the value true

    char letter = 'C';
    System.out.println(letter);
    //the variable letter is declared as a char and is assigned the value C

    //note: in displaying another variable, u can use "+" to display
    String myName = "Rey";
    String myLastName = "Delos Reyes";
    System.out.println(myName + " " + myLastName);
    //the variable myName is declared as a string and is assigned the value "Rey"

    //printing multiple variables
    int x = 5, y = 9;
    float z = 5.7f;
    System.out.println(x + " " + y + " " + z);
    System.out.println(x + y + z);
    //this ^ prints out the sum and u can change what ever mathematical equation to it

    String studentName = "Rey Delos Reyes";
    int yrLevel = 2;
    float GPA = 3.57f;
    String StudentID = "20231000473";

    System.out.println("Student name: " + studentName);
    System.out.println("Year Level: " + yrLevel);
    System.out.println("Student's GPA: " + GPA);
    System.out.println("Student's ID number: " + StudentID);

    //Boolean 
    boolean babae = true;
    boolean lalake = false;
    System.out.println("Kapag babae " + babae);
    System.out.println("Kapag lalake " + lalake);

    //real life example
    int carrot = 2;
    int apple = 3;
    float bacon = 10.99f;
    float TotalCost = carrot + apple + bacon;
    char currency = '$';

    System.out.println("The cart has: ");
    System.out.println("carrots = " + carrot + currency); 
    System.out.println("apples = " + apple + currency);
    System.out.println("bacon = " + bacon + currency);
    System.out.println("The total cost is: " + TotalCost + currency);
    
    //type casting or assigning a primitive data to other primitive data
    int maxScore = 500;

    // The actual score of the user
    int userScore = 423;

    // we can transform or assign the "int" to become a "float"
    float percentage = (float) userScore / maxScore * 100.0f;

    System.out.println("Player's percentage is " + percentage + "%");

    //Arithmetic operators
    //Addition
    int a = 5;
    int b = 10;
    int c = a + b;
    System.out.println("The answer for the Addition operator is: " + c);

    //Subtraction
    int d = 10;
    int e = 3;
    int f = d - e;
    System.out.println("The answer for the Subtraction operator is: " + f);

    //Multiplication
    int g = 5;
    int h = 10;
    int i = g * h;
    System.out.println("The answer for the Multiplication operator is: " +i);

    //Division
    int j = 10;
    int k = 2;
    int l = j / k;
    System.out.println("The answer for the Division operator is: " +l);

    //Modulus (displays the remainder of the numbers)
    int m = 10;
    int n = 3;
    int o = m % n;
    System.out.println("The answer for the Modulus operator is: " +o);

    //Decrement
    int rr = 10;
    --rr;
    System.out.println("The answer for the Decrement operator is: " +rr);

    //Increment
    int p = 10;
    ++p;
    System.out.println("The answer for the Increment operator is: " +p);

    //Assignment operators
    //AND operator
    int xc = 5;
    xc &= 7;
    System.out.println("The answer for the AND operator is: " + xc); //prints out 5 because:
    // 0101 = 5
    // 0111 = 7
    // ----
    // 0101 (which is `5` in decimal)

    //OR operator
    int xb = 5;
    xb |= 3;
    System.out.println("The answer for the OR operator is: " + xb);
    // 0101 = 5
    // 0011 = 3
    // ----
    // 0111 (which is 7 in decimal form)

    //XOR operator
    int xa = 5;
    xa ^= 3;
    System.out.println("The answer for the XOR operator is: " + xa);
    // 0101 = 5
    // 0011 = 3
    // ----
    // 0110 (which is 6 in decimal form)

    //Right shift operator
    int xy = 5;
    xy >>= 3;
    System.out.println("The answer for the right shift operator is: " + xy);
    // 0000 0101 = 5
    // (shifts 3 positions to the right)
    // 0000 0000 = 0

    //Left shift operator
    int xx = 5;
    xx <<= 3;
    System.out.println("The answer for the left shift operator is: " + xx);
    // 0000 0101 = 5
    // (shifts 3 positions to the left)
    // 0010 0100 = 40

    //Logical Operators
    int xq = 5;
    System.out.println(xq > 3 && xq < 10); 
    // returns true because 5 is greater than 3 AND 5 is less than 10

    int xr = 5;
    System.out.println(!(xr > 3 && xr < 10)); 
    // returns false because ! (not) is used to reverse the result

    //if else statements 
    int op = 15;
    int po = 17;
    if (op > po) {
      System.out.println("op is greater than po");
      } else {
        System.out.println("op is less than to po");
  }

    //short hand if else statement
    int time = 20;
    String ans = (time > 18) ? "Good Morning." : "Good Evening";
    System.out.println(ans);

    //even or odd
    int myNum = 5;
    if (myNum % 2 == 0) {
    System.out.println(myNum + " is even");
    } else {
    System.out.println(myNum + " is odd");
    } 

    //switch cases 
    int hours = 3;
    switch (hours){
      case 1:
        System.out.println("Good Morning! ");
        break;
      case 2:
        System.out.println("Good Afternoon! ");
        break;
      case 3:
       System.out.println("Good Evening! ");
       break;
      default:
        System.out.println("No Input Detected :<");
        break;
    }

    //While loop
    int m1 = 5, m2 = 1;
    while (m1 > 1){
      System.out.println(m1--);
    }
    while (m2 < 6) {
      System.out.println(m2++);
    }

    //Do/while loop
    int g1 = 10;
    do {
      System.out.println("Shutdown in " + g1);
      Thread.sleep(1000);
      g1--;
    }
    while(g1 >= 0);
    System.out.println("Shutting down...");

    //for loops
    for (int iol = 0; iol < 5; iol++)
    {
      System.out.println("Hi!");
      Thread.sleep(1000);
    }

    //nested loops
    // Outer loop
    for (int i1 = 1; i1 <= 2; i1++) {
    System.out.println("Outer: " + i1); // Executes 2 times
  
    // Inner loop
     for (int j1 = 1; j1 <= 3; j1++) {
     System.out.println(" Inner: " + j1); // Executes 6 times (2 * 3)
      }
    } 

    //For each loops
    String[] Schools = {"FEU", "UST", "ADU", "DLSU", "NU", "UP"};
    for (String q1 : Schools)
    {
      System.out.println(q1);
      Thread.sleep(1000);
    }

    //printing out the multiplication number for 7
    int mnum = 7;
    int ir = 0;
    do
    {
      System.out.println(mnum + " times " + ir + " is equals to " + (mnum * ir));
      ir++;
    }
    while (ir <= 10);

    //Break/Continue 
    //We use break to STOP the code when it reaches a certain condition
    char choi = 'a';
    switch (choi){
      case 'a':
      System.out.println("A");
      break;

      case 'b':
      System.out.println("B");
      break;

      default:
      System.out.println("Invalid");
      break;
  }
}
}