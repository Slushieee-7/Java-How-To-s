import java.io.*;

public class File_Handling {
    
    public static void main(String[] args) throws IOException {
        File txt = new File("File dis bitch.txt");

        //Methods for creating or getting information of the file
        System.out.println(txt.canRead()); //checks if the file is readable
        System.out.println(txt.canWrite()); //checks if the file is writeable 
        txt.createNewFile(); //creates an empty file
        System.out.println(txt.exists()); //checks if the file exists 
        System.out.println(txt.getName()); //returns the name of the file 

    }

}
