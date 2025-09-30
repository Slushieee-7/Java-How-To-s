//we make different classes that are placed on the same folder for much cleaner code

import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class WelcomePage {

    // insantiate
    JFrame frame = new JFrame();
    JLabel welcomeLabel = new JLabel("Hi!");

    WelcomePage(String userID) { //we user String userID, so that the code accepts the userID, and will display the userID with the message

        // setting the label or the message of the window
        welcomeLabel.setBounds(50, 50, 200, 25);
        welcomeLabel.setFont(new Font(null, Font.BOLD, 20));
        welcomeLabel.setText("Good Day! " + userID + " ^-^");

        // setting the frame
        frame.setSize(500, 500); // sets the window
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // sets the default exit window
        frame.setLayout(null); // sets the layout to null
        frame.setVisible(true); // sets the window to be visible
        frame.setLocationRelativeTo(null);// sets the window at the center of the screen
        frame.add(welcomeLabel);
    }
}
