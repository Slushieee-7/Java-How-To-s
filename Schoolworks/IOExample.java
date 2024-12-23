import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class IOExample {
    public static void main(String[] args) {

        Scanner input1 = new Scanner(System.in);
         
        System.out.println("Enter the file name (add .txt after the filename): ");
        String filename = input1.nextLine();

        try {
            System.out.println("Enter the shift size: ");
            int number = input1.nextInt();
            input1.nextLine(); 

            System.out.println("Enter the text you want to write to the file: ");
            String message = input1.nextLine();

            BufferedWriter writer = new BufferedWriter(new FileWriter(filename));
            writer.write(message);
            writer.close();

            System.out.println("Shift size: " + number);
            System.out.println("The filename is: " + filename);

        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            // Read from the file
            BufferedReader reader = new BufferedReader(new FileReader(filename));

            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println("Message written into the file: " + line);
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            input1.close();
        }
    }
}