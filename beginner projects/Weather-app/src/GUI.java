import java.awt.Font;
import javax.swing.*;

public class GUI extends JFrame {
    public GUI() {
        // Setup our GUI
        super("Weather App"); // Title of our app

        // Configuration of GUI 
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(450, 650);//sets the width and height of the app
        this.setLocationRelativeTo(null);//sets the frame at default center
        this.setResizable(false);//prevents the window to be resizeable

        addGuiComponents();
        this.setVisible(true);//makes the frame visible
    }

    private void addGuiComponents() {
        //search field for the app
        JTextField searchField = new JTextField();

        //sets the location and size of our app
        searchField.setBounds(10, 10, 410, 40);

        //changes the fontstyles and sizes 
        searchField.setFont(new Font("Arial", Font.BOLD, 24));

        add(searchField);
        
    }
}
