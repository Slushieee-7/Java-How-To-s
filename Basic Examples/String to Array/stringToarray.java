public class stringToarray {
    public static void main(String[] args) {
        String str = "Hello!";
        char[] array = str.toCharArray(); //converts the string to array, which each index in the array becomes a character
        for (char i : array){   //for every character in the array, will be stored in the variable "i";
            System.out.print(i + " ");
        }
    }
}
