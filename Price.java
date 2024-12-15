public class Price {
    public static void main(String[] args) {
        double carrot = 20.95;
        double apple = 18.56;
        double hotdog = 21.46;

        double disc = 0.5;

        int quantcarrot = 6;
        int quantapple = 3;
        int quanthotdog = 8;

        double total = ((carrot * quantcarrot) + (apple * quantapple) + (hotdog * quanthotdog));

        System.out.println("Your cart has: ");
        System.out.println("6 carrots ");
        System.out.println("3 apple ");
        System.out.println("8 hotdog ");

        System.out.println("Total price: " + total );
        System.out.println("Discount price: " + (total * disc));
}
}

