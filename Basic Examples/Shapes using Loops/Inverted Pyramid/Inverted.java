public class Inverted {
    public static void main(String[] args) {
        int rows = 3; //initiate how many rows 

        for (int i = rows; i >= 1; i--) { //for loop that starts the inverted pyramid
            for (int j = rows; j > i; j--) {//for loop that prints out spaces
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {//for loop that prints out each star
                System.out.print("*");
            }
            System.out.println();
        }
    }
}