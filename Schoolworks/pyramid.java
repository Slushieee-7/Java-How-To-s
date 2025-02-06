import java.util.Scanner;

public class pyramid {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter the size of the pyramid: ");
        int ans = inp.nextInt();

        for (int i = 0; i < ans; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        inp.close();
    }
}
