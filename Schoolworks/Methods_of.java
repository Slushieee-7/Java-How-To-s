//comment at the start until end of each p(x) to avoid any errors due to duplicates of main 
public class Methods_of { 
    //p1 start
    static void main() { //or in c++ these are the classes
        System.out.println(" Hello! I am in a class :>");        
    }

    public static void main (String[] args) {
        main();
    }
    //p1 end

    // //p2 start
    // static void class1(String names, int yr){ //adding parameters
    //     System.out.println(names + " " + yr + "nd year" + " BSCSSE");
    // }

    // public static void main(String[] args) {
    //     class1("Rey", 2);
    //     class1("Ken", 2);
    //     class1("Alvin", 2);
    //     class1("Basti", 2);
    // }
    // //p2 end

    // //p3 start
    // static int class2(int x, int y){ //returning values
    //     return x + y;
    // }

    // public static void main(String[] args){
    //     int z = class2(5, 2);
    //     System.out.println(z);
    // }

    // //or 

    //     static int class3(int xa, int ya) {
    //       return xa + ya;
    //     }
      
    //     public static void main(String[] args) {
    //       System.out.println(class3(5, 3));
    //     }
    // //p3 end

    // //p4 start
    // //overloading
    // static int Method(int x, int y) {
    //     return x + y;//inserts here the value if INT
    //   }
      
    //   static double Method(double x, double y) {
    //     return x - y; //inserts here the value if DOUBLE
    //   }
      
    //   public static void main(String[] args) { //only INT and DOUBLE are allowed 
    //     int myNum1 = Method(8, 5); 
    //     double myNum2 = Method(4.3, 6.26);
    //     System.out.println("int: " + myNum1);
    //     System.out.println("double: " + myNum2);
    //   }
    // //p4 end

    // //p5 start
    // //recursion
    // public static void main(String[] args) {
    //     int result = sum(10);
    //     printPlaces(10);
    //     System.out.println("Sum: " + result);
    // }

    // public static int sum(int m) {
    //     if (m > 0) {
    //         return m + sum(m - 1);
    //     } else {
    //         return 0;
    //     }
    // }

    // public static void printPlaces(int n) {
    //     if (n > 0) {
    //         printPlaces(n - 1);
    //         System.out.println("Place of number: " + n);
    //     }
    // }
    // //p5 end
}
