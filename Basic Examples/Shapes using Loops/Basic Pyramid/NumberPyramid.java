public class NumberPyramid {
    public static void main(String[] args) {
        int rows = 5; 

        for (int i = 1; i <= rows; i++) {
            for (int j = i; j < rows; j++) { //for loop for printing spaces
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) { //for loop for printing the numbers
                System.out.print(k + " ");
            }
            System.out.println();
        }
    }
}