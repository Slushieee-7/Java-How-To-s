import java.util.Scanner;

public class mirror {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows: ");

        int rows = sc.nextInt();

        //printing the pyramid pattern
        for (int i = 1; i <= rows; i++){
            for (int j = 1; j <= i; j++){
                System.out.print(" ");
            }
            for (int j = i; j <= rows; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }

        //printing the reverse pattern of the pyramid
        for (int i = rows - 1; i >= 1; i--){
            for(int j = 1; j < i; j++){
                System.out.print(" ");
            }
            for (int j = i; j <= rows; j++ ){
                System.out.print(j + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
