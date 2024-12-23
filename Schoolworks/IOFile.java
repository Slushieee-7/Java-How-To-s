import java.io.*;


public class IOFile {
    
    public static void main(String[] args) {
        
        int numbers = '8';
        try{
            BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\Joshua\\Downloads\\text.txt"));
            writer.write(numbers);
            // writer.write("\nAnother line into a file...");

            // for (String name : names){
            //     writer.write("\nNames: " + name);
            // }
            writer.close();
        }
        
        catch (IOException e){
            e.printStackTrace();
        }

        try{
            BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\Joshua\\Downloads\\text.txt"));

            String line;
            while ((line = reader.readLine()) != null) {
            System.out.println("This text is read from the file: " + line);
            }
             reader.close();
        }
        catch (IOException e){
            e.printStackTrace();
        }

    }
}
