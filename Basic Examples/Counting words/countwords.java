public class countwords {
    public static void main(String[] args) {
        String str = "Hello! How many words do you think I have? "; //string entered
        int count = str.split("\\s").length; //the "split" method splits the string into an array
                                                   // meaning "str.split("\\s")" will split the string at each whitespace character (spaces, tabs, etc.)
        System.out.println("Number of words: " + count); //displays the number of words
    }
}
