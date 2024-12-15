import java.util.Scanner;
public class Comparison {

    public void isGreater(int Lnumber, int Rnumber){
        System.out.println(Lnumber + " is greater than " + Rnumber);
    }

    public void isLess(int Lnumber, int Rnumber){
        System.out.println(Lnumber + " is less than " + Rnumber);
    }

    public void isEqual(int Lnumber, int Rnumber){
        System.out.println(Lnumber + " is equal to " + Rnumber);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int Lnumber = input.nextInt();
        System.out.println("Enter the Second number: ");
        int Rnumber = input.nextInt();

        Comparison compare = new Comparison();

        if (Lnumber > Rnumber){
            compare.isGreater(Lnumber, Rnumber);
        }
        else if (Lnumber < Rnumber){
            compare.isLess(Lnumber, Rnumber);
        }
        else if (Lnumber == Rnumber){
            compare.isEqual(Lnumber, Rnumber);
        }

        input.close();
    }
}
