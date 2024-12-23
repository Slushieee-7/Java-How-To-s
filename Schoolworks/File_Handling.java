import java.io.*;
import java.util.*;

public class File_Handling {

    public static void main(String[] args) throws IOException {
        // create a new file
        File txt = new File("File dis bitch.txt");

        // Methods for creating or getting information of the file
        System.out.println(txt.canRead()); // checks if the file is readable
        System.out.println(txt.canWrite()); // checks if the file is writeable
        System.out.println(txt.exists()); // checks if the file exists
        System.out.println(txt.getName()); // returns the name of the file
        System.out.println(txt.getAbsolutePath()); // gets the directory path of the file
        System.out.println(txt.length()); // gets the length of the file
        txt.mkdir(); // creates a directory

        // in order to use the createNewFile syntax, use try and catch method
        try {
            if (txt.createNewFile()) { // creates a new file
                System.out.println("File is created! \n File name: " + txt.getName());
            } else {
                System.out.println("The File already exists :<");
            }
        }

        catch (IOException e) {
            System.out.println("An error occurred");
            e.printStackTrace();
        }

        // u can also write a text inside the file u made, using FileWriter ^-^
        try {
            FileWriter newFile = new FileWriter("Test File.txt"); // creates a new txt file
            newFile.close();
            newFile.write("U can write anything u want here (AAAAAAAAAAAAAAAAAAAAAAA)");
            System.out.println("File is created and written");
        }

        catch (IOException e) {
            System.out.println("An error occurred");
            e.printStackTrace();
        } // this part is important to always check if there is a misinput

        // u can also let the system read what is on the file itself
        try {
            Scanner readEm = new Scanner(txt);
            while (readEm.hasNextLine()) { // while the scanner detects a line or a string or any data in the file
                String data = readEm.nextLine(); // it will return that data read in the file
                System.out.println(data); // outputs the data read in the file
            }
            readEm.close(); // always close the scanner
        } catch (FileNotFoundException e) {
            System.out.println("File was not found :<");
            e.printStackTrace();
        }

        // to delete a file
        // txt.delete()

        // to delete a folder
        // File daFolder = new File("(path of that folder)")
        // daFolder.deleter

    }
}
