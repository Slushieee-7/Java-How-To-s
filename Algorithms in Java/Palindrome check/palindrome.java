import java.util.Scanner;

public class palindrome {
    public static void main(String[] args){
        Scanner val1 = new Scanner(System.in);
        Scanner val2 = new Scanner(System.in);

        System.out.println("Enter the the first word: ");
        String string1 = val1.nextLine();

        System.out.println("Enter the second word: ");
        String string2 = val2.nextLine();

        System.out.println(string1 + " is a palindrome: " + isPalindrome(string1));
        System.out.println(string2 + " is a palindrome: " + isPalindrome(string2));

    }

    public static boolean isPalindrome(String str){
        int left = 0;
        int right = str.length() - 1;

        while(left < right){
            if (str.charAt(left) != str.charAt(right)){
                return false; //if characters are not in the same order, it will return false or not a palindrome
            }
            left++;
            right--;
        }
        return true; //if the loop completes without returning false, it will return true 
    }
}
