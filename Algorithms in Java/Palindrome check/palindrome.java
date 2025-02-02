import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner val1 = new Scanner(System.in);
        Scanner val2 = new Scanner(System.in);

        System.out.println("Enter the the first word: ");
        String string1 = val1.nextLine();

        System.out.println("Enter the second word: ");
        String string2 = val2.nextLine();

        String pal1 = Palindrome(string1);
        String pal2 = Palindrome(string2);

        System.out.println("\n\n" + string1 + " is a palindrome: " + isPalindrome(string1));
        System.out.println(string2 + " is a palindrome: " + isPalindrome(string2) + "\n\n");
        System.out.println("First palindrome " + string1 + " -> " + pal1);
        System.out.println("First palindrome " + string2 + " -> " + pal2);

    }

    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false; // if characters are not in the same order, it will return false or not a
                              // palindrome
            }
            left++;
            right--;
        }
        return true; // if the loop completes without returning false, it will return true
    }

    //returns the palindrome version of the string
    public static String Palindrome(String str) {
        String reverse = " ";
        for (int i = 0; i < str.length(); i++) {
            reverse = str.charAt(i) + reverse;
        }
        System.out.println(reverse);
        return reverse;
    }
}
