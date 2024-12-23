public class reverse {
    public static void main(String[] args) {
        String str = "Hello"; // inputs the string
        String reverse = ""; // insantiates the "reverse" as an empty string

        for (int i = 0; i < str.length(); i++) {
            reverse = str.charAt(i) + reverse; // this line takes the character at index i of str (using str.charAt(i))
                                               // and adds it to the "reverse" string
        }
        System.out.println(reverse);
    }
}

/*If str is "hello", the process would look like this:

Start with reverse = ""
After the first iteration: reverse = "h"
After the second iteration: reverse = "eh"
After the third: reverse = "leh"
After the fourth: reverse = "lleh"
After the fifth: reverse = "olleh"
Finally, it prints "olleh". */