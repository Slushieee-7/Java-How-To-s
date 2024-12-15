import java.awt.*;
import javax.swing.*;
public class popupwindow{

    private static void createWindow(){
        JFrame frame = new JFrame("ACM Committee Search"); //create and sets up the window
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //terminates the code when the window is closed

        JLabel textLabel = new JLabel(" Check your emails! =) ", SwingConstants.CENTER); //displays the text
        textLabel.setFont(new Font("Arial", Font.BOLD, 40)); //sets the font and size of the text
        textLabel.setPreferredSize(new Dimension(7680, 4320)); //sets the width to 300 pixels and the height to 100 pixels
        frame.getContentPane().add(textLabel, BorderLayout.CENTER); //sets the text at the center

        //displays the window
        frame.setSize(7680, 4320); //sets the size of the window
        // frame.pack(); // automatically sets the size of the window
        frame.setVisible(true); //makes the window visible
    }

    public static void main(String[] args) {
        createWindow();
    }
}
