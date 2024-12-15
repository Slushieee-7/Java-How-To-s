import java.util.Scanner;
public class Currency {
    public static void main(String[] args) {
        Scanner myObj = new Scanner (System.in);
        Double currency;
        System.out.print("Amount of Philippine peso: ");
        currency = myObj.nextDouble();

        Double dollar = currency * 0.018;
        Double euro = currency * 0.016;
        Double yuan = currency * 0.13;
        Double koruna = currency * 0.40;
        Double krone = currency * 0.19;
        Double shekel = currency * 0.066;
        Double dinar = currency * 0.0054;

        System.out.println("The amount is equivalent to: ");
        System.out.println("US Dollar: " + dollar);
        System.out.println("Euro: " + euro);
        System.out.println("Chinese Yuan: " + yuan);
        System.out.println("Czech Koruna: " + koruna);
        System.out.println("Norweigan krone: " + krone);
        System.out.println("Israeli New Shekel: " + shekel);
        System.out.println("Kuwaiti Dinar: " + dinar);
        myObj.close();
    }
}