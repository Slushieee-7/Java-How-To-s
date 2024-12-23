import java.util.Scanner;

public class pointofsales {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        String productname;
        int quantity;
        double price, TotalPrice, discountedprice, netprice, payment, change;

        System.out.print("Enter product name: ");
        productname = myObj.nextLine();

        System.out.print("Enter quantity: ");
        quantity = myObj.nextInt();

        System.out.print("Enter price: ");
        price = myObj.nextDouble();

        TotalPrice = price * quantity;
        discountedprice = price * 0.20;
        netprice = TotalPrice - discountedprice;

        System.out.print("Enter payment: ");
        payment = myObj.nextDouble();

        change = payment - TotalPrice;

        System.out.println("\nPoint of Sales");
        System.out.println("Employee product name: " + productname);
        System.out.println("Quantity: " + quantity);
        System.out.println("Price: " + price);
        System.out.println("Discounted price: " + discountedprice);
        System.out.println("Net Price: " + netprice);
        System.out.println("Payment: " + payment);
        System.out.println("Total change: " + change);

        myObj.close();
    }
}