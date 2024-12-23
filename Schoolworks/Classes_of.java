// //All errors are only because of main duplicates. Comment from start of every "start comment here p(x)"
// //just comment every main and x duplicate to run a block of code 

// public class Classes_of {
//   //start comment here p1
//     int x = 5;

//     //creating an object and creating multiple objects
//     public static void main (String[] args) {
//         Classes_of newObj = new Classes_of();
//         Classes_of newObj2 = new Classes_of();
//         System.out.println(newObj.x);
//         System.out.println(newObj2.x);
//     }


//     //{
//     //open the "Classe_of2" java file to run this block of code 
//     //using multiple classes for better organization of classes 
//     //in this example we used the code wrote in the "Classes_of2" to run a program while the instructions are in this file "Classes_of"
//     //}


//     //start comment here p2
//     //class attributes 
//     //we can access attributes by using "." like in printing the "newObj.x" which prints out the value stored in x

//     //modifying attributes 
//     int x; //x has no value

//     public static void main(String[] args) {
//         Classes_of newOBJ = new Classes_of();
//         newOBJ.x = 7; //here we input the value of 7 into x
//         System.out.println(newOBJ.x); //outputs 7
//     }

//     //start comment here p3
//     //overriding attributes
//     int x = 10;

//     public static void main(String[] args) {
//         Classes_of newObj = new Classes_of();
//         newObj.x = 25;
//         System.out.println(newObj.x); //outputs 25
//     }

//     //putting "final" to not override the value stored at x
//      final int x = 17;

//      public static void main(String[] args) {
//         Classes_of newObj = new Classes_of();
//         newObj.x = 19; //will be an error
//         System.out.println(newObj.x); //therefore it will not print because "final" permamently inputs the value of x

//      }

//     //start comment here p4
//     //inputting multiple attributes
//     String firstName = "Rey";
//     String lastName = "Delos Reyes";
//     int age = 19;

//     public static void main(String[] args) {
//         Classes_of record = new Classes_of();
//         System.out.println("First name: " + record.firstName); //prints out first name from the class "record"
//         System.out.println("Last name: " + record.lastName); //prints out last name from the class "record"
//         System.out.println("Age: " + record.age);//prints out age from the class "record"
//     }

//     //start comment here p5
//     //Static vs Public 
//     //static method
//     static void StaticMethod(){
//         System.out.println("Static methods can be called WITHOUT creating an object");
//     }

//     //public method
//     public void PublicMethod(){
//         System.out.println("Public methods can be called WITH creating an object");
//     }

//     public static void main(String[] args) {
//         StaticMethod(); //calls the STATIC method
//         //PublicMethod() would be error

//         Classes_of newObj = new Classes_of();
//         newObj.PublicMethod(); //calls the PUBLIC method
//     }

//     //start comment here p6
//     //Example from W3schools
//     // Create a fullThrottle() method
//   public void fullThrottle() {
//     System.out.println("The car is going as fast as it can!");
//   } //if called, it will print out that the car is going as fast as it can

//   // Create a speed() method and add a parameter
//   public void speed(int maxSpeed) {
//     System.out.println("Max speed is: " + maxSpeed);
//   } 

//   // Inside main, call the methods on the myCar object
//   public static void main(String[] args) {
//     Classes_of myCar = new Classes_of();   // Create a myCar object
//     myCar.fullThrottle();      // Call the full Throttle() method
//     myCar.speed(200);          // Call the speed() method
//   }

//   //start comment here p7
//   //Java constructors 
//   int x;

//     //Creates a class constructor for the Classes_of class
//     public Classes_of(){
//       x = 7; //sets the initial of x to 7
//     }

//     public static void main(String[] args){
//       Classes_of newObj = new Classes_of();
//       System.out.println(newObj.x); //prints out 7
//     }

//   //start comment here p8
//   //parameters
//   int x;

//   public Classes_of(int y){
//     x = y;
//   }

//   public static void main(String[] args) {
//     Classes_of myObj = new Classes_of(10);
//     System.out.println(myObj.x); //prints out 10 since the value set to y is 10 and x  = y
//   }

//   //start comment here p9
//   int yrlevel;
//   String lname;
//   String fname;

//   public Classes_of(int year, String last, String first){
//     yrlevel = year;
//     lname = last;
//     fname = first;
//   }

//   public static void main(String[] args){
//     Classes_of data = new Classes_of(2, "Delos Reyes", "Rey");
//     System.out.println("Student's Year level: " + data.yrlevel);
//     System.out.println("Student's Last Name: " + data.lname);
//     System.out.println("Student's First Name: " + data.fname);
//   }


// }

